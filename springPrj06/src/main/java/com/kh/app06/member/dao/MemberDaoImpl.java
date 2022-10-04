package com.kh.app06.member.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Override
	public int insert(SqlSessionTemplate sst, Map<String, String> map) {
		return sst.insert("memberMapper.insert", map);
	}

	@Override
	public Map<String, String> selectOneById(SqlSessionTemplate sst, String id) {
		return sst.selectOne("memberMapper.selectOne", id);
	}

	@Override
	public Map<String, String> login(SqlSessionTemplate sst, Map<String, String> map) {
		return sst.selectOne(null);
	}

}
