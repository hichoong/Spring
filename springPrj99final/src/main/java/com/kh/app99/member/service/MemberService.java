package com.kh.app99.member.service;


import java.util.List;

import com.kh.app99.member.vo.MemberVo;

public interface MemberService {
	//로그인
	MemberVo login(MemberVo vo);
	//회원가입
	int insertMember(MemberVo vo);
	//회원 정보 수정 
	MemberVo edit(MemberVo vo);
	//아이디 중복 확인
	int checkDup(String userId);
	//회원목록조회
	List<MemberVo> selectList();

	
	//정보수정
	
	//회원탈퇴
}
