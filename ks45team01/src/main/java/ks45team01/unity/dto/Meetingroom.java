package ks45team01.unity.dto;

public class Meetingroom {

	private String meetNum;
	private String meetName;
	private String meetLocation;
	private String meetUsableStart;
	private String meetUsableEnd;
	private String meetRegDate;
	private String memberNum;
	private String meetUpdateDate;
	private String meetUpdateMember;
	private String meetCapacity;
	private String meetStatus;
	private String meetRejectReason;
	private String meetDetail;
	public String getMeetNum() {
		return meetNum;
	}
	public void setMeetNum(String meetNum) {
		this.meetNum = meetNum;
	}
	public String getMeetName() {
		return meetName;
	}
	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}
	public String getMeetLocation() {
		return meetLocation;
	}
	public void setMeetLocation(String meetLocation) {
		this.meetLocation = meetLocation;
	}
	public String getMeetUsableStart() {
		return meetUsableStart;
	}
	public void setMeetUsableStart(String meetUsableStart) {
		this.meetUsableStart = meetUsableStart;
	}
	public String getMeetUsableEnd() {
		return meetUsableEnd;
	}
	public void setMeetUsableEnd(String meetUsableEnd) {
		this.meetUsableEnd = meetUsableEnd;
	}
	public String getMeetRegDate() {
		return meetRegDate;
	}
	public void setMeetRegDate(String meetRegDate) {
		this.meetRegDate = meetRegDate;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getMeetUpdateDate() {
		return meetUpdateDate;
	}
	public void setMeetUpdateDate(String meetUpdateDate) {
		this.meetUpdateDate = meetUpdateDate;
	}
	public String getMeetUpdateMember() {
		return meetUpdateMember;
	}
	public void setMeetUpdateMember(String meetUpdateMember) {
		this.meetUpdateMember = meetUpdateMember;
	}
	public String getMeetCapacity() {
		return meetCapacity;
	}
	public void setMeetCapacity(String meetCapacity) {
		this.meetCapacity = meetCapacity;
	}
	public String getMeetStatus() {
		return meetStatus;
	}
	public void setMeetStatus(String meetStatus) {
		this.meetStatus = meetStatus;
	}
	public String getMeetRejectReason() {
		return meetRejectReason;
	}
	public void setMeetRejectReason(String meetRejectReason) {
		this.meetRejectReason = meetRejectReason;
	}
	public String getMeetDetail() {
		return meetDetail;
	}
	public void setMeetDetail(String meetDetail) {
		this.meetDetail = meetDetail;
	}
	public String getMeetManager() {
		return meetManager;
	}
	public void setMeetManager(String meetManager) {
		this.meetManager = meetManager;
	}
	private String meetManager;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meetingroom [meetNum=");
		builder.append(meetNum);
		builder.append(", meetName=");
		builder.append(meetName);
		builder.append(", meetLocation=");
		builder.append(meetLocation);
		builder.append(", meetUsableStart=");
		builder.append(meetUsableStart);
		builder.append(", meetUsableEnd=");
		builder.append(meetUsableEnd);
		builder.append(", meetRegDate=");
		builder.append(meetRegDate);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", meetUpdateDate=");
		builder.append(meetUpdateDate);
		builder.append(", meetUpdateMember=");
		builder.append(meetUpdateMember);
		builder.append(", meetCapacity=");
		builder.append(meetCapacity);
		builder.append(", meetStatus=");
		builder.append(meetStatus);
		builder.append(", meetRejectReason=");
		builder.append(meetRejectReason);
		builder.append(", meetDetail=");
		builder.append(meetDetail);
		builder.append(", meetManager=");
		builder.append(meetManager);
		builder.append("]");
		return builder.toString();
	}	
}
