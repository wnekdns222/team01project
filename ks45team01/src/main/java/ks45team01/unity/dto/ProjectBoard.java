package ks45team01.unity.dto;

import java.util.List;

public class ProjectBoard {
	private String projectBoardNum;
	private String projectNum;
	private String memberNum;
	private String projectBoardTitle;
	private String projectBoardContent;
	private String projectBoardModifier;
	private String projectBoardRegDate;
	private String projectBoardUpdateDate;
	
	private List<ProjectComment> projectComment;
	
	private MemberList memberList;

	public String getProjectBoardNum() {
		return projectBoardNum;
	}

	public void setProjectBoardNum(String projectBoardNum) {
		this.projectBoardNum = projectBoardNum;
	}

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

	public String getProjectBoardTitle() {
		return projectBoardTitle;
	}

	public void setProjectBoardTitle(String projectBoardTitle) {
		this.projectBoardTitle = projectBoardTitle;
	}

	public String getProjectBoardContent() {
		return projectBoardContent;
	}

	public void setProjectBoardContent(String projectBoardContent) {
		this.projectBoardContent = projectBoardContent;
	}

	public String getProjectBoardModifier() {
		return projectBoardModifier;
	}

	public void setProjectBoardModifier(String projectBoardModifier) {
		this.projectBoardModifier = projectBoardModifier;
	}

	public String getProjectBoardRegDate() {
		return projectBoardRegDate;
	}

	public void setProjectBoardRegDate(String projectBoardRegDate) {
		this.projectBoardRegDate = projectBoardRegDate;
	}

	public String getProjectBoardUpdateDate() {
		return projectBoardUpdateDate;
	}

	public void setProjectBoardUpdateDate(String projectBoardUpdateDate) {
		this.projectBoardUpdateDate = projectBoardUpdateDate;
	}

	public List<ProjectComment> getProjectComment() {
		return projectComment;
	}

	public void setProjectComment(List<ProjectComment> projectComment) {
		this.projectComment = projectComment;
	}

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectBoard [projectBoardNum=");
		builder.append(projectBoardNum);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", projectBoardTitle=");
		builder.append(projectBoardTitle);
		builder.append(", projectBoardContent=");
		builder.append(projectBoardContent);
		builder.append(", projectBoardModifier=");
		builder.append(projectBoardModifier);
		builder.append(", projectBoardRegDate=");
		builder.append(projectBoardRegDate);
		builder.append(", projectBoardUpdateDate=");
		builder.append(projectBoardUpdateDate);
		builder.append(", projectComment=");
		builder.append(projectComment);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append(", getProjectBoardNum()=");
		builder.append(getProjectBoardNum());
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getProjectBoardTitle()=");
		builder.append(getProjectBoardTitle());
		builder.append(", getProjectBoardContent()=");
		builder.append(getProjectBoardContent());
		builder.append(", getProjectBoardModifier()=");
		builder.append(getProjectBoardModifier());
		builder.append(", getProjectBoardRegDate()=");
		builder.append(getProjectBoardRegDate());
		builder.append(", getProjectBoardUpdateDate()=");
		builder.append(getProjectBoardUpdateDate());
		builder.append(", getProjectComment()=");
		builder.append(getProjectComment());
		builder.append(", getMemberList()=");
		builder.append(getMemberList());
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
