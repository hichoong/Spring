package com.kh.app01.qna;

import org.springframework.stereotype.Repository;

@Repository
public class QnaDao {

	/**
	 * 문의 작성 진행 
	 */
	public int write(QnaVo vo) {
		//return 커넥션.SQL 실행
		System.out.println(vo);
		return 1;
	}

}
