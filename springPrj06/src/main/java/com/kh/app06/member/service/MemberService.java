package com.kh.app06.member.service;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public interface MemberService {
	//회원가입
	int join(Map<String, String> map);
	//로그인
	Map<String, String> login(Map<String, String> map);
	//정보 수정
	
	//탈퇴
}
