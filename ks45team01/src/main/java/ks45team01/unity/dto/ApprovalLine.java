package ks45team01.unity.dto;

public class ApprovalLine {
	
	private String approvalLineNum;
	private String draftDocNum;
	private String approvalMemberNum;
	private String finalApproverNum;
	private String finalApprover;
	private int approvalSequence;
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
	public String getApprovalMemberNum() {
		return approvalMemberNum;
	}
	public void setApprovalMemberNum(String approvalMemberNum) {
		this.approvalMemberNum = approvalMemberNum;
	}
	public String getFinalApproverNum() {
		return finalApproverNum;
	}
	public void setFinalApproverNum(String finalApproverNum) {
		this.finalApproverNum = finalApproverNum;
	}
	public String getFinalApprover() {
		return finalApprover;
	}
	public void setFinalApprover(String finalApprover) {
		this.finalApprover = finalApprover;
	}
	public int getApprovalSequence() {
		return approvalSequence;
	}
	public void setApprovalSequence(int approvalSequence) {
		this.approvalSequence = approvalSequence;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApprovalLine [approvalLineNum=");
		builder.append(approvalLineNum);
		builder.append(", draftDocNum=");
		builder.append(draftDocNum);
		builder.append(", approvalMemberNum=");
		builder.append(approvalMemberNum);
		builder.append(", finalApproverNum=");
		builder.append(finalApproverNum);
		builder.append(", finalApprover=");
		builder.append(finalApprover);
		builder.append(", approvalSequence=");
		builder.append(approvalSequence);
		builder.append("]");
		return builder.toString();
	}
	
}
