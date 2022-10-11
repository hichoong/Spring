package com.kh.app99.board.service;

import java.util.List;

import com.kh.app99.board.vo.BoardVo;
import com.kh.app99.common.PageVo;

public interface BoardService {
	//게시글 작성
	int write(BoardVo vo);
	//게시글 목록 조회(게시글 페이지네이션 추가)
	List<BoardVo> selectList(PageVo pv);
	//게시글 상세조회 (게시글 번호)
	BoardVo selectOne(String no);
	//게시글 수정하기()
	int edit(BoardVo vo);
	//전체 게시글 개수 조회
	int selectTotalCnt();
	//게시글삭제
	int delete(String no);

}
