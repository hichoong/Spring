package com.kh.app04.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.app04.member.dao.MemberDao;
import com.kh.app04.member.vo.MemberVo;

@Service
public class MemberService {
	@Autowired
	private SqlSessionTemplate sst;
	//TODO : SqlSessionTemplate 클래스를 가지고 있는 라이브러리 추가
	@Autowired
	private MemberDao dao;
	
	public int join(MemberVo vo) {
		//커넥션 준비
		
		//dao 호출
		
		//실행 결과 리턴
		int result = dao.join(sst, vo);
		
		return result;
	}

	public MemberVo login(MemberVo vo) {
		//커넥션 준비
		
		//dao 호출
		
		//실행 결과 리턴
		return dao.login(sst, vo);
	}
}
