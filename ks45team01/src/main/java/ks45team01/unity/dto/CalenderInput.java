package ks45team01.unity.dto;

public class CalenderInput {
	
	private String scheduleNum;
	private String scheduleType;
	private String memberNum;
	private String scheduleTitle;
	private String scheduleContent;
	private String scheduleRegDate;
	private String scheduleStart;
	private String scheduleEnd;
	
	public String getScheduleNum() {
		return scheduleNum;
	}
	public void setScheduleNum(String scheduleNum) {
		this.scheduleNum = scheduleNum;
	}
	public String getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getScheduleTitle() {
		return scheduleTitle;
	}
	public void setScheduleTitle(String scheduleTitle) {
		this.scheduleTitle = scheduleTitle;
	}
	public String getScheduleContent() {
		return scheduleContent;
	}
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	public String getScheduleRegDate() {
		return scheduleRegDate;
	}
	public void setScheduleRegDate(String scheduleRegDate) {
		this.scheduleRegDate = scheduleRegDate;
	}
	public String getScheduleStart() {
		return scheduleStart;
	}
	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}
	public String getScheduleEnd() {
		return scheduleEnd;
	}
	public void setScheduleEnd(String scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalenderInput [scheduleNum=");
		builder.append(scheduleNum);
		builder.append(", scheduleType=");
		builder.append(scheduleType);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", scheduleTitle=");
		builder.append(scheduleTitle);
		builder.append(", scheduleContent=");
		builder.append(scheduleContent);
		builder.append(", scheduleRegDate=");
		builder.append(scheduleRegDate);
		builder.append(", scheduleStart=");
		builder.append(scheduleStart);
		builder.append(", scheduleEnd=");
		builder.append(scheduleEnd);
		builder.append("]");
		return builder.toString();
	}
	

	
	
	
}
