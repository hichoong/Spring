package com.kh.app99.common;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUploader {

	public static String fileUpload(MultipartFile f, String savePath) {
		//파일업로드
				//0. 기존 파일 확장자 얻기
				String originName = f.getOriginalFilename();
				String ext = originName.substring(originName.lastIndexOf("."));
				
				//1. 저장할 파일 이름 만들기
				long now = System.currentTimeMillis();
				int random = (int)(Math.random() *90000 + 10000);
				String changeName = now + "_" + random + ext;
				
				//2. 서버에 업로드
				//파일 객체 준비
				//해당 파일에 전송
				//String savePath = req.getServletContext().getRealPath("/resources/upload/profile/");
				File target = new File(savePath + changeName);
				try {
					f.transferTo(target);
				} catch (IOException e) {
				e.printStackTrace();
				}
				return changeName;
	}
}
