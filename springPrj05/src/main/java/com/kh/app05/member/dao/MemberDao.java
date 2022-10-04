package com.kh.app05.member.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.app05.member.vo.MemberVo;

public interface MemberDao {
	//회원가입
	int join(SqlSessionTemplate sst, MemberVo vo);
	//로그인
	MemberVo login(SqlSessionTemplate sst, MemberVo vo);
	//회원정보수정
	int edit(SqlSessionTemplate sst, MemberVo vo);
	//회원탈퇴
	int quit(SqlSessionTemplate sst, int memberNo);
	//회원 조회 (아이디)
	MemberVo selectOneById(SqlSessionTemplate sst, String string);
}
