package ks45team01.unity.dto;

import java.util.List;

public class Reservation {
	
	private String reservationNum;
	private String meetNum;
	private String reservationDate;
	private String reservationStartTime;
	private String reservationEndTime;
	private String meetOutTime;
	private String reservationContents;
	private String meetApplicationDate;
	private String memberNum;
	private String reservationUpdateDate;
	private String reservationUpdateMember;
	
	private List<Meetingroom> meetingroom;
	private List<listMember> listMember;
	public String getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(String reservationNum) {
		this.reservationNum = reservationNum;
	}
	public String getMeetNum() {
		return meetNum;
	}
	public void setMeetNum(String meetNum) {
		this.meetNum = meetNum;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getReservationStartTime() {
		return reservationStartTime;
	}
	public void setReservationStartTime(String reservationStartTime) {
		this.reservationStartTime = reservationStartTime;
	}
	public String getReservationEndTime() {
		return reservationEndTime;
	}
	public void setReservationEndTime(String reservationEndTime) {
		this.reservationEndTime = reservationEndTime;
	}
	public String getMeetOutTime() {
		return meetOutTime;
	}
	public void setMeetOutTime(String meetOutTime) {
		this.meetOutTime = meetOutTime;
	}
	public String getReservationContents() {
		return reservationContents;
	}
	public void setReservationContents(String reservationContents) {
		this.reservationContents = reservationContents;
	}
	public String getMeetApplicationDate() {
		return meetApplicationDate;
	}
	public void setMeetApplicationDate(String meetApplicationDate) {
		this.meetApplicationDate = meetApplicationDate;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getReservationUpdateDate() {
		return reservationUpdateDate;
	}
	public void setReservationUpdateDate(String reservationUpdateDate) {
		this.reservationUpdateDate = reservationUpdateDate;
	}
	public String getReservationUpdateMember() {
		return reservationUpdateMember;
	}
	public void setReservationUpdateMember(String reservationUpdateMember) {
		this.reservationUpdateMember = reservationUpdateMember;
	}
	public List<Meetingroom> getMeetingroom() {
		return meetingroom;
	}
	public void setMeetingroom(List<Meetingroom> meetingroom) {
		this.meetingroom = meetingroom;
	}
	public List<listMember> getListMember() {
		return listMember;
	}
	public void setListMember(List<listMember> listMember) {
		this.listMember = listMember;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [reservationNum=");
		builder.append(reservationNum);
		builder.append(", meetNum=");
		builder.append(meetNum);
		builder.append(", reservationDate=");
		builder.append(reservationDate);
		builder.append(", reservationStartTime=");
		builder.append(reservationStartTime);
		builder.append(", reservationEndTime=");
		builder.append(reservationEndTime);
		builder.append(", meetOutTime=");
		builder.append(meetOutTime);
		builder.append(", reservationContents=");
		builder.append(reservationContents);
		builder.append(", meetApplicationDate=");
		builder.append(meetApplicationDate);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", reservationUpdateDate=");
		builder.append(reservationUpdateDate);
		builder.append(", reservationUpdateMember=");
		builder.append(reservationUpdateMember);
		builder.append(", meetingroom=");
		builder.append(meetingroom);
		builder.append(", listMember=");
		builder.append(listMember);
		builder.append("]");
		return builder.toString();
	}
	
	
}
