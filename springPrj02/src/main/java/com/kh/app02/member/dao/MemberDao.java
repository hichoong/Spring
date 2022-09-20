package com.kh.app02.member.dao;

import com.kh.app02.member.vo.MemberVo;

public interface MemberDao {

	// 회원가입
	 int join(MemberVo vo);
	// 로그인
	MemberVo login(MemberVo vo);
	// 회원정보 조회(마이페이지)
	MemberVo selectOneByNo(int memberNo);
	// 회원정보 수정
	int edit(MemberVo vo);	
	// 회원 탈퇴
	int quitByNo(int memberNo);	
}
