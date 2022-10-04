package com.kh.app06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class TestController {

	@GetMapping("/test")
	public String test () {
		return "test";
	}
	
	@GetMapping("/kh")
	public String kh(RedirectAttributes ra) {
		
		//쿼리스트링에 자동으로 붙음
		//(단, 키값을 redirect 하는곳에서 활용하면 쿼리스트링으로 안 붙음)
		//key 값을 이용하여 redirect 하는 구문에 value를 추가할 수 있음
		//여러개 가능
		ra.addAttribute("k1", "v1");
		ra.addAttribute("k2", "v2");
		
		//
		ra.addFlashAttribute("msg", "일회용 알람");
		return "redirect:/test/";
	}
}
