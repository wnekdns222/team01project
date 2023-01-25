package ks45team01.unity.dto;

public class VacationApproval {

	private String vacationApprovalNum;
	private String draftDocNum;
	private String vacationTypeNum;
	private String vacationTitle;
	private String memberNum;
	private String draftSend;
	private String vacationStartDate;
	private String vacationEndDate;
	private String totalVacationUseDate;
	private String totalVacationUseTime;
	private String vacationReason;
	private String emergencyContact;
	private String replaceMember;
	private String approvalDeadline;
	
	private MemberList memberList;
	
	public MemberList getMemberList() {
		return memberList;
	}
	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}
	public String getVacationApprovalNum() {
		return vacationApprovalNum;
	}
	public void setVacationApprovalNum(String vacationApprovalNum) {
		this.vacationApprovalNum = vacationApprovalNum;
	}
	public String getDraftDocNum() {
		return draftDocNum;
	}
	public void setDraftDocNum(String draftDocNum) {
		this.draftDocNum = draftDocNum;
	}
	public String getVacationTypeNum() {
		return vacationTypeNum;
	}
	public void setVacationTypeNum(String vacationTypeNum) {
		this.vacationTypeNum = vacationTypeNum;
	}
	public String getVacationTitle() {
		return vacationTitle;
	}
	public void setVacationTitle(String vacationTitle) {
		this.vacationTitle = vacationTitle;
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
	public String getVacationStartDate() {
		return vacationStartDate;
	}
	public void setVacationStartDate(String vacationStartDate) {
		this.vacationStartDate = vacationStartDate;
	}
	public String getVacationEndDate() {
		return vacationEndDate;
	}
	public void setVacationEndDate(String vacationEndDate) {
		this.vacationEndDate = vacationEndDate;
	}
	public String getTotalVacationUseDate() {
		return totalVacationUseDate;
	}
	public void setTotalVacationUseDate(String totalVacationUseDate) {
		this.totalVacationUseDate = totalVacationUseDate;
	}
	public String getTotalVacationUseTime() {
		return totalVacationUseTime;
	}
	public void setTotalVacationUseTime(String totalVacationUseTime) {
		this.totalVacationUseTime = totalVacationUseTime;
	}
	public String getVacationReason() {
		return vacationReason;
	}
	public void setVacationReason(String vacationReason) {
		this.vacationReason = vacationReason;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getReplaceMember() {
		return replaceMember;
	}
	public void setReplaceMember(String replaceMember) {
		this.replaceMember = replaceMember;
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
		builder.append("VacationApproval [vacationApprovalNum=");
		builder.append(vacationApprovalNum);
		builder.append(", draftDocNum=");
		builder.append(draftDocNum);
		builder.append(", vacationTypeNum=");
		builder.append(vacationTypeNum);
		builder.append(", vacationTitle=");
		builder.append(vacationTitle);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", draftSend=");
		builder.append(draftSend);
		builder.append(", vacationStartDate=");
		builder.append(vacationStartDate);
		builder.append(", vacationEndDate=");
		builder.append(vacationEndDate);
		builder.append(", totalVacationUseDate=");
		builder.append(totalVacationUseDate);
		builder.append(", totalVacationUseTime=");
		builder.append(totalVacationUseTime);
		builder.append(", vacationReason=");
		builder.append(vacationReason);
		builder.append(", emergencyContact=");
		builder.append(emergencyContact);
		builder.append(", replaceMember=");
		builder.append(replaceMember);
		builder.append(", approvalDeadline=");
		builder.append(approvalDeadline);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
