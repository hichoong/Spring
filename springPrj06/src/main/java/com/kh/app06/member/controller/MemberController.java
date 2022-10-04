package com.kh.app06.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.app06.member.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	@GetMapping("join")
	public String join() {
		return "member/join";
	}
	@PostMapping("join")
	public String join(@RequestParam HashMap<String, String> map) {
		System.out.println(map.get("id"));
		System.out.println(map.get("pwd"));
		System.out.println(map.get("nick"));
		 ms.join(map);
		return "redirect:/";
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	@PostMapping("login")
	public String login(@RequestParam Map<String, String> map, HttpSession session) {
		Map<String, String> loginMember = ms.login(map);
		if(loginMember != null ) {
			//성공
			session.setAttribute("msg", "로그인 성공");
			return "redirect:/";
		}else {
			return "error";
		}
	}
}
