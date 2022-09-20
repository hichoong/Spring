package com.kh.app02.member.vo;

public class MemberVo {
	
	private String memberNo;
	private String memberId;
	private String memberPwd;
	private String memberNick;
	private String enrollDate;
	private String status;
	
	public MemberVo() {
	
	}

	public MemberVo(String memberNo, String memberId, String memberPwd, String memberNick, String enrollDate,
			String status) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberNick = memberNick;
		this.enrollDate = enrollDate;
		this.status = status;
	}

	public final String getMemberNo() {
		return memberNo;
	}

	public final void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public final String getMemberId() {
		return memberId;
	}

	public final void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public final String getMemberPwd() {
		return memberPwd;
	}

	public final void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public final String getMemberNick() {
		return memberNick;
	}

	public final void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public final String getEnrollDate() {
		return enrollDate;
	}

	public final void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public final String getStatus() {
		return status;
	}

	public final void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MemberVo [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd
				+ ", memberNick=" + memberNick + ", enrollDate=" + enrollDate + ", status=" + status + "]";
	}
	
}
