package com.kh.app99.common;

import lombok.Data;

@Data
public class PageVo {
	private int listConut; //총게시글개수
	private int currentPage; //현재페이지
	private int pageLimit; //하단 페이지 영역에 보여줄 페이지 버튼 개수
	private int boardLimit; // 한 페이지에서 보여줄 최대 게시글 개수
	
	private int maxPage; //가장 마지막 페이지
	private int startPage; //현재 페이지에서 보여질 시작 페이지
	private int endPage; // 현재 페이지에서 보여질 마지막 페이지
}
