package com.kh.app01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {
	
	public HomeDao() {
		System.out.println("홈 다오 기본생성자로 태어남 ~~~ !");
	}

	public int home() {
		System.out.println("dao 호출됨 ~~~");
		return 777;
	}

}
