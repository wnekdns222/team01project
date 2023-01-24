package ks45team01.unity.dto;


public class Reservation {
	
	private String reservationNum;
	private String meetNum;
	private String reservationDate;
	private String reservationStartTime;
	private String reservationEndTime;
	private String reservationContents;
	private String reservationInsertDate;
	private String applicantMemberNum;
	private String reservationUpdateDate;
	private String reservationUpdateMember;
	
	private Meetingroom meetingroom;

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

	public String getReservationContents() {
		return reservationContents;
	}

	public void setReservationContents(String reservationContents) {
		this.reservationContents = reservationContents;
	}

	public String getReservationInsertDate() {
		return reservationInsertDate;
	}

	public void setReservationInsertDate(String reservationInsertDate) {
		this.reservationInsertDate = reservationInsertDate;
	}

	public String getApplicantMemberNum() {
		return applicantMemberNum;
	}

	public void setApplicantMemberNum(String applicantMemberNum) {
		this.applicantMemberNum = applicantMemberNum;
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

	public Meetingroom getMeetingroom() {
		return meetingroom;
	}

	public void setMeetingroom(Meetingroom meetingroom) {
		this.meetingroom = meetingroom;
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
		builder.append(", reservationContents=");
		builder.append(reservationContents);
		builder.append(", reservationInsertDate=");
		builder.append(reservationInsertDate);
		builder.append(", applicantMemberNum=");
		builder.append(applicantMemberNum);
		builder.append(", reservationUpdateDate=");
		builder.append(reservationUpdateDate);
		builder.append(", reservationUpdateMember=");
		builder.append(reservationUpdateMember);
		builder.append(", meetingroom=");
		builder.append(meetingroom);
		builder.append("]");
		return builder.toString();
	}
		
}
