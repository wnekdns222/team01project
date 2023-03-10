package ks45team01.unity.dto;

//근무유형 dto
public class WorkType {

	private String workTypeNum;
	private String memberNum;
	private String workName;
	private String workDate;
	private String attendanceTime;
	private String leaveWorkTime;
	private String regMemberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
	private String use;
	private String workTypeUsePeriod;
	
	private MemberList memberList;
	
	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}
	public String getWorkTypeNum() {
		return workTypeNum;
	}
	public void setWorkTypeNum(String workTypeNum) {
		this.workTypeNum = workTypeNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getAttendanceTime() {
		return attendanceTime;
	}
	public void setAttendanceTime(String attendanceTime) {
		this.attendanceTime = attendanceTime;
	}
	public String getLeaveWorkTime() {
		return leaveWorkTime;
	}
	public void setLeaveWorkTime(String leaveWorkTime) {
		this.leaveWorkTime = leaveWorkTime;
	}
	public String getRegMemberNum() {
		return regMemberNum;
	}
	public void setRegMemberNum(String regMemberNum) {
		this.regMemberNum = regMemberNum;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getCorrectMemberNum() {
		return correctMemberNum;
	}
	public void setCorrectMemberNum(String correctMemberNum) {
		this.correctMemberNum = correctMemberNum;
	}
	public String getCorrectDate() {
		return correctDate;
	}
	public void setCorrectDate(String correctDate) {
		this.correctDate = correctDate;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getWorkTypeUsePeriod() {
		return workTypeUsePeriod;
	}
	public void setWorkTypeUsePeriod(String workTypeUsePeriod) {
		this.workTypeUsePeriod = workTypeUsePeriod;
	}
	public MemberList getMemberList() {
		return memberList;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkType [workTypeNum=");
		builder.append(workTypeNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", workName=");
		builder.append(workName);
		builder.append(", workDate=");
		builder.append(workDate);
		builder.append(", attendanceTime=");
		builder.append(attendanceTime);
		builder.append(", leaveWorkTime=");
		builder.append(leaveWorkTime);
		builder.append(", regMemberNum=");
		builder.append(regMemberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", correctMemberNum=");
		builder.append(correctMemberNum);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append(", use=");
		builder.append(use);
		builder.append(", workTypeUsePeriod=");
		builder.append(workTypeUsePeriod);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append("]");
		return builder.toString();
	}
	
}
