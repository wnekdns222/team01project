package ks45team01.unity.dto;

public class ApprovalProcess {
	
	private String approvalProcessNum;
	private String approvalLineNum;
	private String draftDocNum;
	private String processStatus;
	private String rejectReasonMember;
	private String rejectReason;
	private String rejectDate;
	private String approvalDoneDate;
	public String getApprovalProcessNum() {
		return approvalProcessNum;
	}
	public void setApprovalProcessNum(String approvalProcessNum) {
		this.approvalProcessNum = approvalProcessNum;
	}
	public String getApprovalLineNum() {
		return approvalLineNum;
	}
	public void setApprovalLineNum(String approvalLineNum) {
		this.approvalLineNum = approvalLineNum;
	}
	public String getDraftDocNum() {
		return draftDocNum;
	}
	public void setDraftDocNum(String draftDocNum) {
		this.draftDocNum = draftDocNum;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getRejectReasonMember() {
		return rejectReasonMember;
	}
	public void setRejectReasonMember(String rejectReasonMember) {
		this.rejectReasonMember = rejectReasonMember;
	}
	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectDate() {
		return rejectDate;
	}
	public void setRejectDate(String rejectDate) {
		this.rejectDate = rejectDate;
	}
	public String getApprovalDoneDate() {
		return approvalDoneDate;
	}
	public void setApprovalDoneDate(String approvalDoneDate) {
		this.approvalDoneDate = approvalDoneDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApprovalProcess [approvalProcessNum=");
		builder.append(approvalProcessNum);
		builder.append(", approvalLineNum=");
		builder.append(approvalLineNum);
		builder.append(", draftDocNum=");
		builder.append(draftDocNum);
		builder.append(", processStatus=");
		builder.append(processStatus);
		builder.append(", rejectReasonMember=");
		builder.append(rejectReasonMember);
		builder.append(", rejectReason=");
		builder.append(rejectReason);
		builder.append(", rejectDate=");
		builder.append(rejectDate);
		builder.append(", approvalDoneDate=");
		builder.append(approvalDoneDate);
		builder.append("]");
		return builder.toString();
	}
}
