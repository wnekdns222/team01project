package ks45team01.unity.dto;

public class WorkUnusual {

	private String workUnusualNum;
	private String workNum;
	private String memberNum;
	private String writeAttendanceDay;
	private String writeAttendanceTime;
	private String writeLeaveworkTime;
	private String writeChangeReason;
	private String vacationCategoryNum;
	private String vacationSortNum;
	private String vacationTypeNum;
	private String regMemberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
	public String getWorkUnusualNum() {
		return workUnusualNum;
	}
	public void setWorkUnusualNum(String workUnusualNum) {
		this.workUnusualNum = workUnusualNum;
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
	public String getWriteAttendanceDay() {
		return writeAttendanceDay;
	}
	public void setWriteAttendanceDay(String writeAttendanceDay) {
		this.writeAttendanceDay = writeAttendanceDay;
	}
	public String getWriteAttendanceTime() {
		return writeAttendanceTime;
	}
	public void setWriteAttendanceTime(String writeAttendanceTime) {
		this.writeAttendanceTime = writeAttendanceTime;
	}
	public String getWriteLeaveworkTime() {
		return writeLeaveworkTime;
	}
	public void setWriteLeaveworkTime(String writeLeaveworkTime) {
		this.writeLeaveworkTime = writeLeaveworkTime;
	}
	public String getWriteChangeReason() {
		return writeChangeReason;
	}
	public void setWriteChangeReason(String writeChangeReason) {
		this.writeChangeReason = writeChangeReason;
	}
	public String getVacationCategoryNum() {
		return vacationCategoryNum;
	}
	public void setVacationCategoryNum(String vacationCategoryNum) {
		this.vacationCategoryNum = vacationCategoryNum;
	}
	public String getVacationSortNum() {
		return vacationSortNum;
	}
	public void setVacationSortNum(String vacationSortNum) {
		this.vacationSortNum = vacationSortNum;
	}
	public String getVacationTypeNum() {
		return vacationTypeNum;
	}
	public void setVacationTypeNum(String vacationTypeNum) {
		this.vacationTypeNum = vacationTypeNum;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkUnusual [workUnusualNum=");
		builder.append(workUnusualNum);
		builder.append(", workNum=");
		builder.append(workNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", writeAttendanceDay=");
		builder.append(writeAttendanceDay);
		builder.append(", writeAttendanceTime=");
		builder.append(writeAttendanceTime);
		builder.append(", writeLeaveworkTime=");
		builder.append(writeLeaveworkTime);
		builder.append(", writeChangeReason=");
		builder.append(writeChangeReason);
		builder.append(", vacationCategoryNum=");
		builder.append(vacationCategoryNum);
		builder.append(", vacationSortNum=");
		builder.append(vacationSortNum);
		builder.append(", vacationTypeNum=");
		builder.append(vacationTypeNum);
		builder.append(", regMemberNum=");
		builder.append(regMemberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", correctMemberNum=");
		builder.append(correctMemberNum);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
