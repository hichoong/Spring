package com.kh.app99.reply.service;

import java.util.List;

import com.kh.app99.reply.vo.ReplyVo;

public interface ReplyService {
	//댓글 작성
	int write(ReplyVo vo);
	//댓글 목록조회
	List<ReplyVo> selectList(String no);

}
