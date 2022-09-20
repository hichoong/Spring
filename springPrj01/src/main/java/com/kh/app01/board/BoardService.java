package com.kh.app01.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;

	public int write() {
		System.out.println("board 서비스 호출됨...");
		int result = dao.write();
		return result;
	}

}
