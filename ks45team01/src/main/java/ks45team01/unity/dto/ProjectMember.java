package ks45team01.unity.dto;

public class ProjectMember {
	private String projectJoinNum;
	private String projectNum;
	private String memberNum;
	private String joinStartDate;
	private String joinEndDate;
	private String joinContent;
	
	private MemberList memberList;

	public String getProjectJoinNum() {
		return projectJoinNum;
	}

	public void setProjectJoinNum(String projectJoinNum) {
		this.projectJoinNum = projectJoinNum;
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

	public String getJoinStartDate() {
		return joinStartDate;
	}

	public void setJoinStartDate(String joinStartDate) {
		this.joinStartDate = joinStartDate;
	}

	public String getJoinEndDate() {
		return joinEndDate;
	}

	public void setJoinEndDate(String joinEndDate) {
		this.joinEndDate = joinEndDate;
	}

	public String getJoinContent() {
		return joinContent;
	}

	public void setJoinContent(String joinContent) {
		this.joinContent = joinContent;
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
		builder.append("ProjectMember [projectJoinNum=");
		builder.append(projectJoinNum);
		builder.append(", projectNum=");
		builder.append(projectNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", joinStartDate=");
		builder.append(joinStartDate);
		builder.append(", joinEndDate=");
		builder.append(joinEndDate);
		builder.append(", joinContent=");
		builder.append(joinContent);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append(", getProjectJoinNum()=");
		builder.append(getProjectJoinNum());
		builder.append(", getProjectNum()=");
		builder.append(getProjectNum());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getJoinStartDate()=");
		builder.append(getJoinStartDate());
		builder.append(", getJoinEndDate()=");
		builder.append(getJoinEndDate());
		builder.append(", getJoinContent()=");
		builder.append(getJoinContent());
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
