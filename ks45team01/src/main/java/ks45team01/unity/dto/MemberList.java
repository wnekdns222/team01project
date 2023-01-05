package ks45team01.unity.dto;

public class MemberList {
	private String memberNum;
	private String memberPw;
	private String memberName;
	private String memberGender;
	private String memberEmail;
	private String memberBirth;
	private String memberPhone;
	private String memberDormant;
	private String memberDormantDate;
	private String departmentNum;
	private String positionNum;
	private String memberInsertDate;
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberDormant() {
		return memberDormant;
	}
	public void setMemberDormant(String memberDormant) {
		this.memberDormant = memberDormant;
	}
	public String getMemberDormantDate() {
		return memberDormantDate;
	}
	public void setMemberDormantDate(String memberDormantDate) {
		this.memberDormantDate = memberDormantDate;
	}
	public String getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}
	public String getMemberInsertDate() {
		return memberInsertDate;
	}
	public void setMemberInsertDate(String memberInsertDate) {
		this.memberInsertDate = memberInsertDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberList [memberNum=");
		builder.append(memberNum);
		builder.append(", memberPw=");
		builder.append(memberPw);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", memberGender=");
		builder.append(memberGender);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", memberBirth=");
		builder.append(memberBirth);
		builder.append(", memberPhone=");
		builder.append(memberPhone);
		builder.append(", memberDormant=");
		builder.append(memberDormant);
		builder.append(", memberDormantDate=");
		builder.append(memberDormantDate);
		builder.append(", departmentNum=");
		builder.append(departmentNum);
		builder.append(", positionNum=");
		builder.append(positionNum);
		builder.append(", memberInsertDate=");
		builder.append(memberInsertDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
