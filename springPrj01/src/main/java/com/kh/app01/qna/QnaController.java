package com.kh.app01.qna;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QnaController {
	
	//필드 인젝션
//	@Autowired
//	private QnaService s;
	
	
	
	//생성자 인젝션
	@Autowired
	public QnaController(QnaService s) {
		this.s = s;
	}
	
	private final QnaService s;	//생성자 인젝션 사용 시 , final 선언 가능
	
	
	
	
	
	/**
	 * 문의 작성 화면
	 */
	@RequestMapping(value = "/qna/write" , method = RequestMethod.GET)
	public String write() {
		return "qna/write";
	}
	
	/**
	 * 문의 작성 진행
	 */
	@RequestMapping(value = "/qna/write" , method = RequestMethod.POST)
	public String write(QnaVo vo) {
		
		int result = s.write(vo);
		if(result == 1) {
			return "redirect:/";
		}else {
			//리퀘스트에 에러메세지 담기
			return "error/errorPage";
		}
		
	}

	
	
	
}//class



















