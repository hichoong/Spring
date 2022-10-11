package com.kh.app99.reply.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.app99.reply.dao.ReplyDao;
import com.kh.app99.reply.vo.ReplyVo;

@Service
public class ReplyServiceImpl implements ReplyService {

	private final ReplyDao dao;
	private final SqlSessionTemplate sst;
	
	@Autowired
	public ReplyServiceImpl(ReplyDao dao, SqlSessionTemplate sst) {
		this.dao = dao;
		this.sst = sst;
	}
	
	//댓글 작성 비즈니스 로직
	@Override
	public int write(ReplyVo vo) {
		return dao.insertReply(sst, vo);
		 
	}
	//댓글 조회 
	@Override
	public List<ReplyVo> selectList(String no) {
		return dao.selectList(sst, no);
	}
	
	
}
