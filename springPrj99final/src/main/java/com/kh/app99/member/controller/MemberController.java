package com.kh.app99.member.controller;


import java.io.File;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.app99.common.FileUploader;
import com.kh.app99.member.service.MemberService;
import com.kh.app99.member.vo.MemberVo;

@Controller
@RequestMapping("member")
public class MemberController {
	//MemberService 객체 주입
	private final MemberService service;
	
	@Autowired
	public MemberController(MemberService service) {
		this.service = service;
	}
	
	//회원가입 화면
	@GetMapping("join")
	public String join() {
		return "member/join";
	}
	
	//실제 회원가입 진행
	@PostMapping("join")
	public String join(MemberVo vo, HttpServletRequest req) {
		//(파일 여부 확인)
		if(vo.getProfile() != null && !vo.getProfile().isEmpty()) {
			//파일 업로드 후 저장된 파일명 얻기 
			String savePath = req.getServletContext().getRealPath("/resources/upload/profile/");
			String changeName = FileUploader.fileUpload(vo.getProfile(), savePath);
			vo.setFileName(changeName);
		}
		
		//서비스호출
		int result = service.insertMember(vo);
		//화면선택
		if(result == 1) {
			return "redirect:/";
		}else {
			return "redirect:/errorPage";
		}
	}
	
	//로그인(화면)
	@GetMapping("login")
	public String login() {
		return "member/login" ;
	}
	
	//로그인
	@PostMapping("login")
	public String login(MemberVo vo, HttpSession session, Model model, String saveId, HttpServletResponse resp) {
		
		
		//아이디 저장하기 확인 
		if(saveId != null) {
			Cookie c = new Cookie("rid", vo.getId()); 
			resp.addCookie(c);
		}else {
			
		}
		
		
		MemberVo loginMember = service.login(vo);
		
		if(loginMember != null) {
			//로그인 성공
			session.setAttribute("loginMember", loginMember);
			return "redirect:/";
		}else {
			//로그인 실패
			model.addAttribute("msg", "로그인 실패!!!");
			return "common/error";	
		}
		
	}
	
	//로그아웃 화면
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/" ;
	}
	
	//마이페이지 화면
	@GetMapping("mypage")
	public String mypage() {
		return "member/mypage";
	}
	
	//마이페이지 작업
	@PostMapping("mypage")
	public String mypage(MemberVo vo, HttpServletRequest req, HttpSession session, Model model) {
		
		//파일처리
		//1. 기존 프사 O > 변경  = Update
		//2. 기존 프사 O > 삭제  = delete
		//3. 기존 프사 X > 등록O = upload
		//4. 기존 프사 X > 등록X = X
		
		//기존파일 삭제
		String savePath = req.getServletContext().getRealPath("/resources/upload/profile/");
		MemberVo loginMember = (MemberVo)(session.getAttribute("loginMember"));
		String fileName = loginMember.getFileName();
		File f = new File(savePath + fileName);
		if(f.exists()) {
			f.delete();			
		}
		
		//신규로 받은 파일 업로드, 저장된 파일명 얻기
		if(!vo.getProfile().isEmpty()) {
			String changeName = FileUploader.fileUpload(vo.getProfile(), savePath);
			vo.setFileName(changeName);
		}
		vo.setNo(loginMember.getNo());
		//업데이트 후 세션에 새 정보 담아주기
		MemberVo updatedMember = service.edit(vo);
		
		if(updatedMember != null) {
			//정보수정 성공
			session.setAttribute("loginMember", updatedMember);
			return "redirect:/";
		}else {
			//정보수정 실패
			model.addAttribute("errorMsg", "회원정보 수정 실패...");
			return "error/errorPage";
		}
	}
	
	//ajax 
	@PostMapping("/dup")
	@ResponseBody
	public String dup(String userId, HttpServletResponse resp) {
		
		System.out.println("ajax를 통해서 넘어온 userId : " + userId);
		int result = service.checkDup(userId);
		
		return "" + result;
	}
	
	//회원 목록 조회
	@GetMapping("list")
	public String list(Model model) {
		//DB 다녀오기
		List<MemberVo> voList = service.selectList();
		//모델에 담기
		model.addAttribute("voList", voList);
		//화면선택
		return "member/list";
	}
}
