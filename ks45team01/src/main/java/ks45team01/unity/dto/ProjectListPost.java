package ks45team01.unity.dto;

import java.util.List;

public class ProjectListPost {
	private String postIdx;
	private String projectNum;
	private String postType;
	private String postRegDate;

	private ProjectRequest projectRequest;
	private ProjectBoard projectBoard;
	public String getPostIdx() {
		return postIdx;
	}
	public void setPostIdx(String postIdx) {
		this.postIdx = postIdx;
	}
	public String getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getPostRegDate() {
		return postRegDate;
	}
	public void setPostRegDate(String postRegDate) {
		this.postRegDate = postRegDate;
	}
	public ProjectRequest getProjectRequest() {
		return projectRequest;
	}
	public void setProjectRequest(ProjectRequest projectRequest) {
		this.projectRequest = projectRequest;
	}
	public ProjectBoard getProjectBoard() {
		return projectBoard;
	}
	public void setProjectBoard(ProjectBoard projectBoard) {
		this.projectBoard = projectBoard;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectListPost [postIdx=");
		builder.append(postIdx);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", postType=");
		builder.append(postType);
		builder.append(", postRegDate=");
		builder.append(postRegDate);
		builder.append(", projectRequest=");
		builder.append(projectRequest);
		builder.append(", projectBoard=");
		builder.append(projectBoard);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
