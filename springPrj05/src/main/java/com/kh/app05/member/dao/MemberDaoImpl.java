package com.kh.app05.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app05.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Override
	public int join(SqlSessionTemplate sst, MemberVo vo) {
		return sst.insert("memberMapper.join",vo);
	}

	@Override
	public MemberVo login(SqlSessionTemplate sst, MemberVo vo) {
		return sst.selectOne("memberMapper.login",vo);
	}

	@Override
	public int edit(SqlSessionTemplate sst, MemberVo vo) {
		return sst.update("memberMapper.edit", vo);
	}

	@Override
	public int quit(SqlSessionTemplate sst, int memberNo) {
		return 0;
	}

	@Override
	public MemberVo selectOneById(SqlSessionTemplate sst, String id) {
		return sst.selectOne("memberMapper.selectOneById", id);
	}

}
