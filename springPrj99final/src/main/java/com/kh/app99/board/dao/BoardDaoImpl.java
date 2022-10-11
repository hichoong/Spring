package com.kh.app99.board.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app99.board.vo.BoardVo;
import com.kh.app99.common.PageVo;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public int insertBoard(SqlSessionTemplate sst, BoardVo vo) {
		return sst.insert("boardMapper.insertBoard", vo);
	}

	@Override
	public List<BoardVo> selectList(SqlSessionTemplate sst, PageVo pv) {
		int offset = (pv.getCurrentPage() -1) * pv.getBoardLimit();
		
		RowBounds rb = new RowBounds(offset ,pv.getBoardLimit());
		return sst.selectList("boardMapper.selectList",null, rb);
	}

	@Override
	public BoardVo selectOne(SqlSessionTemplate sst, String no) {
		return sst.selectOne("boardMapper.selectOne", no);
	}

	@Override
	public int increaseHit(SqlSessionTemplate sst, String no) {
		return sst.update("boardMapper.increaseHit", no);
	}

	@Override
	public int updateOne(SqlSessionTemplate sst, BoardVo vo) {
		return sst.update("boardMapper.updateOne", vo);
	}

	@Override
	public int selectCountAll(SqlSessionTemplate sst) {
		return sst.selectOne("boardMapper.selectCountAll");
	}

	@Override
	public int delete(SqlSessionTemplate sst, String no) {
		return sst.update("boardMapper.deleteBoard", no);
	}
	
	
}
