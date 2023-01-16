package ks45team01.unity.dto;

public class Approval {
	
	private String draftDocNum;
	private String approvalCategoryNum;
	private String draftTitle;
	private String registrantNum;
	private String reportDate;
	private String draftContents;
	private String draftAddfile;
	private String draftAddfilePath;
	private String draftDeadline;
	private String draftRegDate;
	private String approvalFinalState;
	
	private ApprovalProcess approvalProcess;

	public String getDraftDocNum() {
		return draftDocNum;
	}

	public void setDraftDocNum(String draftDocNum) {
		this.draftDocNum = draftDocNum;
	}

	public String getApprovalCategoryNum() {
		return approvalCategoryNum;
	}

	public void setApprovalCategoryNum(String approvalCategoryNum) {
		this.approvalCategoryNum = approvalCategoryNum;
	}

	public String getDraftTitle() {
		return draftTitle;
	}

	public void setDraftTitle(String draftTitle) {
		this.draftTitle = draftTitle;
	}

	public String getRegistrantNum() {
		return registrantNum;
	}

	public void setRegistrantNum(String registrantNum) {
		this.registrantNum = registrantNum;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getDraftContents() {
		return draftContents;
	}

	public void setDraftContents(String draftContents) {
		this.draftContents = draftContents;
	}

	public String getDraftAddfile() {
		return draftAddfile;
	}

	public void setDraftAddfile(String draftAddfile) {
		this.draftAddfile = draftAddfile;
	}

	public String getDraftAddfilePath() {
		return draftAddfilePath;
	}

	public void setDraftAddfilePath(String draftAddfilePath) {
		this.draftAddfilePath = draftAddfilePath;
	}

	public String getDraftDeadline() {
		return draftDeadline;
	}

	public void setDraftDeadline(String draftDeadline) {
		this.draftDeadline = draftDeadline;
	}

	public String getDraftRegDate() {
		return draftRegDate;
	}

	public void setDraftRegDate(String draftRegDate) {
		this.draftRegDate = draftRegDate;
	}

	public String getApprovalFinalState() {
		return approvalFinalState;
	}

	public void setApprovalFinalState(String approvalFinalState) {
		this.approvalFinalState = approvalFinalState;
	}

	public ApprovalProcess getApprovalProcess() {
		return approvalProcess;
	}

	public void setApprovalProcess(ApprovalProcess approvalProcess) {
		this.approvalProcess = approvalProcess;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Approval [draftDocNum=");
		builder.append(draftDocNum);
		builder.append(", approvalCategoryNum=");
		builder.append(approvalCategoryNum);
		builder.append(", draftTitle=");
		builder.append(draftTitle);
		builder.append(", registrantNum=");
		builder.append(registrantNum);
		builder.append(", reportDate=");
		builder.append(reportDate);
		builder.append(", draftContents=");
		builder.append(draftContents);
		builder.append(", draftAddfile=");
		builder.append(draftAddfile);
		builder.append(", draftAddfilePath=");
		builder.append(draftAddfilePath);
		builder.append(", draftDeadline=");
		builder.append(draftDeadline);
		builder.append(", draftRegDate=");
		builder.append(draftRegDate);
		builder.append(", approvalFinalState=");
		builder.append(approvalFinalState);
		builder.append(", approvalProcess=");
		builder.append(approvalProcess);
		builder.append("]");
		return builder.toString();
	}
	
}
