package ks45team01.unity.dto;

public class MemberDepartmentList {
	private String departmentNum;
	private String departmentName;
	private String memberNum;
	private String departmentRegDate;
	private String departmentUpdateDate;
	private String departmentModifier;
	private String useOrNot;
	public String getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getDepartmentRegDate() {
		return departmentRegDate;
	}
	public void setDepartmentRegDate(String departmentRegDate) {
		this.departmentRegDate = departmentRegDate;
	}
	public String getDepartmentUpdateDate() {
		return departmentUpdateDate;
	}
	public void setDepartmentUpdateDate(String departmentUpdateDate) {
		this.departmentUpdateDate = departmentUpdateDate;
	}
	public String getDepartmentModifier() {
		return departmentModifier;
	}
	public void setDepartmentModifier(String departmentModifier) {
		this.departmentModifier = departmentModifier;
	}
	public String getUseOrNot() {
		return useOrNot;
	}
	public void setUseOrNot(String useOrNot) {
		this.useOrNot = useOrNot;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberDepartmentList [departmentNum=");
		builder.append(departmentNum);
		builder.append(", departmentName=");
		builder.append(departmentName);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", departmentRegDate=");
		builder.append(departmentRegDate);
		builder.append(", departmentUpdateDate=");
		builder.append(departmentUpdateDate);
		builder.append(", departmentModifier=");
		builder.append(departmentModifier);
		builder.append(", useOrNot=");
		builder.append(useOrNot);
		builder.append(", getDepartmentNum()=");
		builder.append(getDepartmentNum());
		builder.append(", getDepartmentName()=");
		builder.append(getDepartmentName());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getDepartmentRegDate()=");
		builder.append(getDepartmentRegDate());
		builder.append(", getDepartmentUpdateDate()=");
		builder.append(getDepartmentUpdateDate());
		builder.append(", getDepartmentModifier()=");
		builder.append(getDepartmentModifier());
		builder.append(", getUseOrNot()=");
		builder.append(getUseOrNot());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
