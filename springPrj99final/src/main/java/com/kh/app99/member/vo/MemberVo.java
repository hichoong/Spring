package com.kh.app99.member.vo;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MemberVo {
	private String no;
	private String id;
	private String pwd;
	private String nick;
	private String gender;
	private String mbti;
	private String fileName;
	private MultipartFile profile;
	private String status;
	private String enrollDate;
	private String modifyDate;
	
	public void encodePwd(PasswordEncoder pwdEnc) {
		this.pwd = pwdEnc.encode(pwd);
	}
}
