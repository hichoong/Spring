package com.kh.app99.board.service;

import java.util.List;

import com.kh.app99.board.vo.BoardVo;

public interface BoardService {
	//게시글 작성
	int write(BoardVo vo);
	//게시글 목록 조회
	List<BoardVo> selectList();
	//게시글 상세조회 (게시글 번호)
	BoardVo selectOne(String no);
	//게시글 수정하기()
	int edit(BoardVo vo);

}
