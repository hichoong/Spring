package com.kh.app06.member.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public interface MemberDao {

	//insert
	int insert ( SqlSessionTemplate sst, Map<String, String> map);
	//selectOne
	Map<String, String> selectOneById(SqlSessionTemplate sst, String id);
	//login
	Map<String, String> login(SqlSessionTemplate sst, Map<String, String> map);
	
	
	//update

	//updateStatus
	
	
}
