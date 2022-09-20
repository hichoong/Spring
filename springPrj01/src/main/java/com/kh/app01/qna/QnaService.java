package com.kh.app01.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	
	@Autowired
	private QnaDao dao;
	
	/**
	 * 문의 작성 진행
	 */
	public int write(QnaVo vo) {
		
		//커넥션 //보류
		
		//dao 호출
		int result = dao.write(vo);
		
		//트랜잭션 , close //아무튼 디비 관련
		
		return result;
	}

}
