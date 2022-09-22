package com.kh.app04.member.vo;


public class MemberVo {
	private String id;
	private String pwd;
	private String nick;
	
	public MemberVo() {
	}

	public MemberVo(String id, String pwd, String nick) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPwd() {
		return pwd;
	}

	public final void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public final String getNick() {
		return nick;
	}

	public final void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}
	
	
}
