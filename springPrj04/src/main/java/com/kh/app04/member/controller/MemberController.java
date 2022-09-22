package com.kh.app04.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.app04.member.service.MemberService;
import com.kh.app04.member.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	@GetMapping("member/join")
	public String join() {
		return "member/join";
	}
	
	@GetMapping("member/login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("member/join")
	public String join(MemberVo vo) {
		//서비스 호출
		int result = ms.join(vo);
		if(result == 1) {
			//성공
			return "redirect:/";
		}else {
			//실패
			return "error/errorPage";
		}
	}
	
	@PostMapping("member/login")
	public String login(MemberVo vo, HttpSession session) {
		MemberVo loginMember = ms.login(vo);
		if(loginMember != null ) {
			//성공
			System.out.println(loginMember);
			session.setAttribute("loginMember", loginMember);
			return "redirect:/";
		}else {
			//실패
			System.out.println("로그인 실패");
			session.setAttribute("msg", "로그인실패");
			return "redirect:/error-page.jsp";
		}
	}
}
