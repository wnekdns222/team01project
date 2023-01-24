package ks45team01.unity.dto;

import java.util.List;

public class ProjectRequest {
	private String projectRequestNum;
	private String projectNum;
	private String projectTaskTitle;
	private String projectRequestContent;
	private String memberNum;
	private String regDate;
	private String taskStartDate;
	private String taskEndDate;
	private String projectTaskFiles;
	
	private List<ProjectComment> projectComment;

	public String getProjectRequestNum() {
		return projectRequestNum;
	}

	public void setProjectRequestNum(String projectRequestNum) {
		this.projectRequestNum = projectRequestNum;
	}

	public String getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}

	public String getProjectTaskTitle() {
		return projectTaskTitle;
	}

	public void setProjectTaskTitle(String projectTaskTitle) {
		this.projectTaskTitle = projectTaskTitle;
	}

	public String getProjectRequestContent() {
		return projectRequestContent;
	}

	public void setProjectRequestContent(String projectRequestContent) {
		this.projectRequestContent = projectRequestContent;
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getTaskStartDate() {
		return taskStartDate;
	}

	public void setTaskStartDate(String taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public String getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public String getProjectTaskFiles() {
		return projectTaskFiles;
	}

	public void setProjectTaskFiles(String projectTaskFiles) {
		this.projectTaskFiles = projectTaskFiles;
	}

	public List<ProjectComment> getProjectComment() {
		return projectComment;
	}

	public void setProjectComment(List<ProjectComment> projectComment) {
		this.projectComment = projectComment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectRequest [projectRequestNum=");
		builder.append(projectRequestNum);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", projectTaskTitle=");
		builder.append(projectTaskTitle);
		builder.append(", projectRequestContent=");
		builder.append(projectRequestContent);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", taskStartDate=");
		builder.append(taskStartDate);
		builder.append(", taskEndDate=");
		builder.append(taskEndDate);
		builder.append(", projectTaskFiles=");
		builder.append(projectTaskFiles);
		builder.append(", projectComment=");
		builder.append(projectComment);
		builder.append(", getProjectRequestNum()=");
		builder.append(getProjectRequestNum());
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getProjectTaskTitle()=");
		builder.append(getProjectTaskTitle());
		builder.append(", getProjectRequestContent()=");
		builder.append(getProjectRequestContent());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getRegDate()=");
		builder.append(getRegDate());
		builder.append(", getTaskStartDate()=");
		builder.append(getTaskStartDate());
		builder.append(", getTaskEndDate()=");
		builder.append(getTaskEndDate());
		builder.append(", getProjectTaskFiles()=");
		builder.append(getProjectTaskFiles());
		builder.append(", getProjectComment()=");
		builder.append(getProjectComment());
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
