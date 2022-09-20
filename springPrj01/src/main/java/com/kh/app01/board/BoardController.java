package com.kh.app01.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board") //공통 url
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	/**
	 * 글 작성 화면
	 */
	@RequestMapping(value = "/write" , method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	
	/**
	 * 글 작성 진행
	 */
	@RequestMapping(value = "/write" , method = RequestMethod.POST)
	public String write(BoardVo vo) {
		System.out.println("board 컨트롤러 호출됨...");
		
		System.out.println(vo);
		
		int result = service.write();
		return "board/write";
		//  /WEB-INF/views    board/write    .jsp
	}
	
	/**
	 * 게시글 목록 조회
	 */

}//class




























