package ks45team01.unity.dto;

public class Work {
	private String workNum;
	private String memberNum;
	private String workTypeNum;
	private String departmentNum;
	private String attendanceDay;
	private String attendanceTime;
	private String leaveworkTime;
	private String gooutWorkoutStartTime;
	private String gooutWorkoutComebackTime;
	private String entrance;
	private String leave;
	private String attendanceStatus;
	private String leaveworkStatus;
	private String outsideDuty;
	private String workUnusual;
	
	private WorkType workType;
	
	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	public String getWorkNum() {
		return workNum;
	}
	public void setWorkNum(String workNum) {
		this.workNum = workNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getWorkTypeNum() {
		return workTypeNum;
	}
	public void setWorkTypeNum(String workTypeNum) {
		this.workTypeNum = workTypeNum;
	}
	public String getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getAttendanceDay() {
		return attendanceDay;
	}
	public void setAttendanceDay(String attendanceDay) {
		this.attendanceDay = attendanceDay;
	}
	public String getAttendanceTime() {
		return attendanceTime;
	}
	public void setAttendanceTime(String attendanceTime) {
		this.attendanceTime = attendanceTime;
	}
	public String getLeaveworkTime() {
		return leaveworkTime;
	}
	public void setLeaveworkTime(String leaveworkTime) {
		this.leaveworkTime = leaveworkTime;
	}
	public String getGooutWorkoutStartTime() {
		return gooutWorkoutStartTime;
	}
	public void setGooutWorkoutStartTime(String gooutWorkoutStartTime) {
		this.gooutWorkoutStartTime = gooutWorkoutStartTime;
	}
	public String getGooutWorkoutComebackTime() {
		return gooutWorkoutComebackTime;
	}
	public void setGooutWorkoutComebackTime(String gooutWorkoutComebackTime) {
		this.gooutWorkoutComebackTime = gooutWorkoutComebackTime;
	}
	public String getEntrance() {
		return entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public String getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	public String getLeaveworkStatus() {
		return leaveworkStatus;
	}
	public void setLeaveworkStatus(String leaveworkStatus) {
		this.leaveworkStatus = leaveworkStatus;
	}
	public String getOutsideDuty() {
		return outsideDuty;
	}
	public void setOutsideDuty(String outsideDuty) {
		this.outsideDuty = outsideDuty;
	}
	public String getWorkUnusual() {
		return workUnusual;
	}
	public void setWorkUnusual(String workUnusual) {
		this.workUnusual = workUnusual;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Work [workNum=");
		builder.append(workNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", workTypeNum=");
		builder.append(workTypeNum);
		builder.append(", departmentNum=");
		builder.append(departmentNum);
		builder.append(", attendanceDay=");
		builder.append(attendanceDay);
		builder.append(", attendanceTime=");
		builder.append(attendanceTime);
		builder.append(", leaveworkTime=");
		builder.append(leaveworkTime);
		builder.append(", gooutWorkoutStartTime=");
		builder.append(gooutWorkoutStartTime);
		builder.append(", gooutWorkoutComebackTime=");
		builder.append(gooutWorkoutComebackTime);
		builder.append(", entrance=");
		builder.append(entrance);
		builder.append(", leave=");
		builder.append(leave);
		builder.append(", attendanceStatus=");
		builder.append(attendanceStatus);
		builder.append(", leaveworkStatus=");
		builder.append(leaveworkStatus);
		builder.append(", outsideDuty=");
		builder.append(outsideDuty);
		builder.append(", workUnusual=");
		builder.append(workUnusual);
		builder.append(", workType=");
		builder.append(workType);
		builder.append("]");
		return builder.toString();
	}
	
	
}
