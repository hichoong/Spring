package com.kh.app99.board.vo;

import lombok.Data;

@Data
public class BoardVo {
	
	private String 	no;
	private String	title;
	private String	content;
	private String	writer;
	private String	hit;
	private String	enrollDate;
	private String	modifyDate;
	private String	status;
}
