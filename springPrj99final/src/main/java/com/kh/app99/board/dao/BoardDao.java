package com.kh.app99.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.app99.board.vo.BoardVo;

public interface BoardDao {
	
	//게시글 insert
	int insertBoard(SqlSessionTemplate sst, BoardVo vo);
	
	//게시글 목록조회
	List<BoardVo> selectList(SqlSessionTemplate sst);
	
	//게시글 상세조회
	BoardVo selectOne(SqlSessionTemplate sst, String no);
	
	//게시글 조회수 증가
	int increaseHit(SqlSessionTemplate sst, String no);
	
	//게시글 수정
	int updateOne(SqlSessionTemplate sst, BoardVo vo);
}
