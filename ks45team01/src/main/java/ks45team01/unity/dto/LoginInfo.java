package ks45team01.unity.dto;

public class LoginInfo {
	
	private String memberNum;
	private String positionNum;
	private String memberName;
	private String departmentNum;
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginInfo [memberNum=");
		builder.append(memberNum);
		builder.append(", positionNum=");
		builder.append(positionNum);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", departmentNum=");
		builder.append(departmentNum);
		builder.append("]");
		return builder.toString();
	}
	

}
