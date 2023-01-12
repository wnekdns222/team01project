package ks45team01.unity.dto;

public class ProjectList {
	private String projectNum;
	private String memberNum;
	private String projectContent;
	private String projectRegDate;
	private String projectEnd;
	private String projectDone;
	private String projectProgress;
	private String projectJoin;
	public String getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	public String getProjectRegDate() {
		return projectRegDate;
	}
	public void setProjectRegDate(String projectRegDate) {
		this.projectRegDate = projectRegDate;
	}
	public String getProjectEnd() {
		return projectEnd;
	}
	public void setProjectEnd(String projectEnd) {
		this.projectEnd = projectEnd;
	}
	public String getProjectDone() {
		return projectDone;
	}
	public void setProjectDone(String projectDone) {
		this.projectDone = projectDone;
	}
	public String getProjectProgress() {
		return projectProgress;
	}
	public void setProjectProgress(String projectProgress) {
		this.projectProgress = projectProgress;
	}
	public String getProjectJoin() {
		return projectJoin;
	}
	public void setProjectJoin(String projectJoin) {
		this.projectJoin = projectJoin;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectList [projectNum=");
		builder.append(projectNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", projectContent=");
		builder.append(projectContent);
		builder.append(", projectRegDate=");
		builder.append(projectRegDate);
		builder.append(", projectEnd=");
		builder.append(projectEnd);
		builder.append(", projectDone=");
		builder.append(projectDone);
		builder.append(", projectProgress=");
		builder.append(projectProgress);
		builder.append(", projectJoin=");
		builder.append(projectJoin);
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getProjectContent()=");
		builder.append(getProjectContent());
		builder.append(", getProjectRegDate()=");
		builder.append(getProjectRegDate());
		builder.append(", getProjectEnd()=");
		builder.append(getProjectEnd());
		builder.append(", getProjectDone()=");
		builder.append(getProjectDone());
		builder.append(", getProjectProgress()=");
		builder.append(getProjectProgress());
		builder.append(", getProjectJoin()=");
		builder.append(getProjectJoin());
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
