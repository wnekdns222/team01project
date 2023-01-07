package ks45team01.unity.dto;

public class ProjectUnitMember {
	private String taskMemberNum;
	private String projectJoinNum;
	private String projectUnitNum;
	private String memberNum;
	private String taskRegDate;
	private String taskDeleteDate;
	public String getTaskMemberNum() {
		return taskMemberNum;
	}
	public void setTaskMemberNum(String taskMemberNum) {
		this.taskMemberNum = taskMemberNum;
	}
	public String getProjectJoinNum() {
		return projectJoinNum;
	}
	public void setProjectJoinNum(String projectJoinNum) {
		this.projectJoinNum = projectJoinNum;
	}
	public String getProjectUnitNum() {
		return projectUnitNum;
	}
	public void setProjectUnitNum(String projectUnitNum) {
		this.projectUnitNum = projectUnitNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getTaskRegDate() {
		return taskRegDate;
	}
	public void setTaskRegDate(String taskRegDate) {
		this.taskRegDate = taskRegDate;
	}
	public String getTaskDeleteDate() {
		return taskDeleteDate;
	}
	public void setTaskDeleteDate(String taskDeleteDate) {
		this.taskDeleteDate = taskDeleteDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectUnitMember [taskMemberNum=");
		builder.append(taskMemberNum);
		builder.append(", projectJoinNum=");
		builder.append(projectJoinNum);
		builder.append(", projectUnitNum=");
		builder.append(projectUnitNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", taskRegDate=");
		builder.append(taskRegDate);
		builder.append(", taskDeleteDate=");
		builder.append(taskDeleteDate);
		builder.append(", getTaskMemberNum()=");
		builder.append(getTaskMemberNum());
		builder.append(", getProjectJoinNum()=");
		builder.append(getProjectJoinNum());
		builder.append(", getProjectUnitNum()=");
		builder.append(getProjectUnitNum());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getTaskRegDate()=");
		builder.append(getTaskRegDate());
		builder.append(", getTaskDeleteDate()=");
		builder.append(getTaskDeleteDate());
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
