package ks45team01.unity.dto;

public class ProjectUnit {
	private String projectUnitNum;
	private String projectNum;
	private String unitContents;
	private String memberInsertNum;
	private String projectUnitRegDate;
	private String memberUpdateNum;
	private String projectUnitUpdateDate;
	public String getProjectUnitNum() {
		return projectUnitNum;
	}
	public void setProjectUnitNum(String projectUnitNum) {
		this.projectUnitNum = projectUnitNum;
	}
	public String getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	public String getUnitContents() {
		return unitContents;
	}
	public void setUnitContents(String unitContents) {
		this.unitContents = unitContents;
	}
	public String getMemberInsertNum() {
		return memberInsertNum;
	}
	public void setMemberInsertNum(String memberInsertNum) {
		this.memberInsertNum = memberInsertNum;
	}
	public String getProjectUnitRegDate() {
		return projectUnitRegDate;
	}
	public void setProjectUnitRegDate(String projectUnitRegDate) {
		this.projectUnitRegDate = projectUnitRegDate;
	}
	public String getMemberUpdateNum() {
		return memberUpdateNum;
	}
	public void setMemberUpdateNum(String memberUpdateNum) {
		this.memberUpdateNum = memberUpdateNum;
	}
	public String getProjectUnitUpdateDate() {
		return projectUnitUpdateDate;
	}
	public void setProjectUnitUpdateDate(String projectUnitUpdateDate) {
		this.projectUnitUpdateDate = projectUnitUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectUnit [projectUnitNum=");
		builder.append(projectUnitNum);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", unitContents=");
		builder.append(unitContents);
		builder.append(", memberInsertNum=");
		builder.append(memberInsertNum);
		builder.append(", projectUnitRegDate=");
		builder.append(projectUnitRegDate);
		builder.append(", memberUpdateNum=");
		builder.append(memberUpdateNum);
		builder.append(", projectUnitUpdateDate=");
		builder.append(projectUnitUpdateDate);
		builder.append(", getProjectUnitNum()=");
		builder.append(getProjectUnitNum());
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getUnitContents()=");
		builder.append(getUnitContents());
		builder.append(", getMemberInsertNum()=");
		builder.append(getMemberInsertNum());
		builder.append(", getProjectUnitRegDate()=");
		builder.append(getProjectUnitRegDate());
		builder.append(", getMemberUpdateNum()=");
		builder.append(getMemberUpdateNum());
		builder.append(", getProjectUnitUpdateDate()=");
		builder.append(getProjectUnitUpdateDate());
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
