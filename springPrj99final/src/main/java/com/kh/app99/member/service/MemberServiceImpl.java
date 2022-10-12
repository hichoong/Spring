package com.kh.app99.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kh.app99.member.dao.MemberDao;
import com.kh.app99.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{
	//커넥션 전역변수
	private final SqlSessionTemplate sst; 
	//dao
	private final MemberDao dao;
	//암호화 처리를 위한 객체
	private final PasswordEncoder pwdEnc;
	
	@Autowired
	public MemberServiceImpl(SqlSessionTemplate sst, MemberDao dao, PasswordEncoder pwdEnc) {
		this.sst = sst;
		this.dao = dao;
		this.pwdEnc = pwdEnc;
	}
	
	//로그인
	@Override
	public MemberVo login(MemberVo vo) {
		
		MemberVo dbMember = dao.selectOneById(sst, vo);
		 
		if(pwdEnc.matches(vo.getPwd(), dbMember.getPwd())) { //첫번째 파라미터 : 기존 비밀번호, 두번째 파라미터 : 암호화 비밀번호
			 //로그인 성공
			 return dbMember;
		 }else {
			 //로그인 실패
			 return null;
		 }
	}
	
	//회원가입
	@Override
	public int insertMember(MemberVo vo) {
		//비밀번호 암호화 하기
		vo.encodePwd(pwdEnc);
		
		return dao.insertOne(sst, vo);
	}
	
	//회원정보 수정
	@Override
	public MemberVo edit(MemberVo vo) {
		vo.encodePwd(pwdEnc);
		int result = dao.updateOne(sst, vo);
		MemberVo updatedMember = null;
		if(result == 1) {
			updatedMember = dao.selectOneByNo(sst, vo);
		}
		return updatedMember;
	}
	
	//중복화인
	@Override
	public int checkDup(String userId) {
		return dao.selectOneById(sst, userId);
	}
	
	//회원목록 조회
	@Override
	public List<MemberVo> selectList() {
		return dao.selectList(sst);
	}

	
}
