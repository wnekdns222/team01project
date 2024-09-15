package ks45team01.unity.dto;

public class WorkCorrectApproval {

	private String workCorrectNum;	
	private String workNum;		
	private String workCategoryNum;		
	private String draftDocNum;		
	private String workCorrectTitle;		
	private String memberNum;		
	private String draftSend;		
	private String correctAttendanceTime;		
	private String correctLeaveworkTime;		
	private String correctReason;		
	private String approvalDeadline;
	public String getWorkCorrectNum() {
		return workCorrectNum;
	}
	public void setWorkCorrectNum(String workCorrectNum) {
		this.workCorrectNum = workCorrectNum;
	}
	public String getWorkNum() {
		return workNum;
	}
	public void setWorkNum(String workNum) {
		this.workNum = workNum;
	}
	public String getWorkCategoryNum() {
		return workCategoryNum;
	}
	public void setWorkCategoryNum(String workCategoryNum) {
		this.workCategoryNum = workCategoryNum;
	}
	public String getDraftDocNum() {
		return draftDocNum;
	}
	public void setDraftDocNum(String draftDocNum) {
		this.draftDocNum = draftDocNum;
	}
	public String getWorkCorrectTitle() {
		return workCorrectTitle;
	}
	public void setWorkCorrectTitle(String workCorrectTitle) {
		this.workCorrectTitle = workCorrectTitle;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getDraftSend() {
		return draftSend;
	}
	public void setDraftSend(String draftSend) {
		this.draftSend = draftSend;
	}
	public String getCorrectAttendanceTime() {
		return correctAttendanceTime;
	}
	public void setCorrectAttendanceTime(String correctAttendanceTime) {
		this.correctAttendanceTime = correctAttendanceTime;
	}
	public String getCorrectLeaveworkTime() {
		return correctLeaveworkTime;
	}
	public void setCorrectLeaveworkTime(String correctLeaveworkTime) {
		this.correctLeaveworkTime = correctLeaveworkTime;
	}
	public String getCorrectReason() {
		return correctReason;
	}
	public void setCorrectReason(String correctReason) {
		this.correctReason = correctReason;
	}
	public String getApprovalDeadline() {
		return approvalDeadline;
	}
	public void setApprovalDeadline(String approvalDeadline) {
		this.approvalDeadline = approvalDeadline;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("workCorrectApproval [workCorrectNum=");
		builder.append(workCorrectNum);
		builder.append(", workNum=");
		builder.append(workNum);
		builder.append(", workCategoryNum=");
		builder.append(workCategoryNum);
		builder.append(", draftDocNum=");
		builder.append(draftDocNum);
		builder.append(", workCorrectTitle=");
		builder.append(workCorrectTitle);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", draftSend=");
		builder.append(draftSend);
		builder.append(", correctAttendanceTime=");
		builder.append(correctAttendanceTime);
		builder.append(", correctLeaveworkTime=");
		builder.append(correctLeaveworkTime);
		builder.append(", correctReason=");
		builder.append(correctReason);
		builder.append(", approvalDeadline=");
		builder.append(approvalDeadline);
		builder.append("]");
		return builder.toString();
	}
	
}
