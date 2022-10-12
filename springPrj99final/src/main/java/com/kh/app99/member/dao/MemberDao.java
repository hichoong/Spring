package com.kh.app99.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.app99.member.vo.MemberVo;

public interface MemberDao {
	//selectOne : 유저
	MemberVo selectOneById(SqlSessionTemplate sst, MemberVo vo);
	
	//selectAll
	
	//insertOne : 회원가입
	int insertOne(SqlSessionTemplate sst, MemberVo vo);
	//update
	
	//회원정보 수정
	int updateOne(SqlSessionTemplate sst, MemberVo vo);
	
	//회원정보 수정한 유저 정보
	MemberVo selectOneByNo(SqlSessionTemplate sst, MemberVo vo);
	
	//아이디 중복확인
	int selectOneById(SqlSessionTemplate sst, String userId);
	
	//회원목록조회
	List<MemberVo> selectList(SqlSessionTemplate sst);

}
