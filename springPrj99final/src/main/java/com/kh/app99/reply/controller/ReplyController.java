package com.kh.app99.reply.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.app99.member.vo.MemberVo;
import com.kh.app99.reply.service.ReplyService;
import com.kh.app99.reply.vo.ReplyVo;

import lombok.Getter;

@Controller
@RequestMapping("reply")
public class ReplyController {

	private final ReplyService rs;
	
	@Autowired
	public ReplyController(ReplyService rs) {
		this.rs = rs;
	}
	
	//ajax로 댓글 작성
	@PostMapping("write")
	@ResponseBody
	public String write(ReplyVo vo, HttpSession session) {
		
		System.out.println(vo);
		//비즈니스 로직 실행
		MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
		
		vo.setWriter(loginMember.getNo());
		//디비 다녀오기
		int result = rs.write(vo);
		//결과응답
		if(result == 1) {
			//성공
			return "ok";
		}else {
			//실패 
			return "fail";
		}
	}
	
}
