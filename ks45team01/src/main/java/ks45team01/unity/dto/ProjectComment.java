package ks45team01.unity.dto;

public class ProjectComment {
	private String projectCommentNum;
	private String projectNum;
	private String projectDitailNum;
	private String projectCommentRegistrant;
	private String projectCommentContent;
	private String projectCommnetRegDate;
	public String getProjectCommentNum() {
		return projectCommentNum;
	}
	public void setProjectCommentNum(String projectCommentNum) {
		this.projectCommentNum = projectCommentNum;
	}
	public String getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	public String getProjectDitailNum() {
		return projectDitailNum;
	}
	public void setProjectDitailNum(String projectDitailNum) {
		this.projectDitailNum = projectDitailNum;
	}
	public String getProjectCommentRegistrant() {
		return projectCommentRegistrant;
	}
	public void setProjectCommentRegistrant(String projectCommentRegistrant) {
		this.projectCommentRegistrant = projectCommentRegistrant;
	}
	public String getProjectCommentContent() {
		return projectCommentContent;
	}
	public void setProjectCommentContent(String projectCommentContent) {
		this.projectCommentContent = projectCommentContent;
	}
	public String getProjectCommnetRegDate() {
		return projectCommnetRegDate;
	}
	public void setProjectCommnetRegDate(String projectCommnetRegDate) {
		this.projectCommnetRegDate = projectCommnetRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectComment [projectCommentNum=");
		builder.append(projectCommentNum);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", projectDitailNum=");
		builder.append(projectDitailNum);
		builder.append(", projectCommentRegistrant=");
		builder.append(projectCommentRegistrant);
		builder.append(", projectCommentContent=");
		builder.append(projectCommentContent);
		builder.append(", projectCommnetRegDate=");
		builder.append(projectCommnetRegDate);
		builder.append(", getProjectCommentNum()=");
		builder.append(getProjectCommentNum());
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getProjectDitailNum()=");
		builder.append(getProjectDitailNum());
		builder.append(", getProjectCommentRegistrant()=");
		builder.append(getProjectCommentRegistrant());
		builder.append(", getProjectCommentContent()=");
		builder.append(getProjectCommentContent());
		builder.append(", getProjectCommnetRegDate()=");
		builder.append(getProjectCommnetRegDate());
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
