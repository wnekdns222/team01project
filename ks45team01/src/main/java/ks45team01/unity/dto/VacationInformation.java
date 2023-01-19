package ks45team01.unity.dto;

public class VacationInformation {

	private String vacationInfoNum;
	private String memberNum;
	private String serviceNum;
	private String lengthOfService;
	private String addVacation;
	private String rewardVacationNumber;
	private String replaceVacationDay;
	private String sickVacationDay;
	private String personalBuisinessVacationDay;
	private String remainVacationDay;
	private String remainVacationTime;
	private String useVacationYear;
	private String regMemberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
	
	private MemberList memberList;
	
	private VacationApproval vacationApproval;

	

	public String getVacationInfoNum() {
		return vacationInfoNum;
	}

	public void setVacationInfoNum(String vacationInfoNum) {
		this.vacationInfoNum = vacationInfoNum;
	}

	public String getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}

	public String getLengthOfService() {
		return lengthOfService;
	}

	public void setLengthOfService(String lengthOfService) {
		this.lengthOfService = lengthOfService;
	}

	public String getAddVacation() {
		return addVacation;
	}

	public void setAddVacation(String addVacation) {
		this.addVacation = addVacation;
	}

	public String getRewardVacationNumber() {
		return rewardVacationNumber;
	}

	public void setRewardVacationNumber(String rewardVacationNumber) {
		this.rewardVacationNumber = rewardVacationNumber;
	}

	public String getReplaceVacationDay() {
		return replaceVacationDay;
	}

	public void setReplaceVacationDay(String replaceVacationDay) {
		this.replaceVacationDay = replaceVacationDay;
	}

	public String getSickVacationDay() {
		return sickVacationDay;
	}

	public void setSickVacationDay(String sickVacationDay) {
		this.sickVacationDay = sickVacationDay;
	}

	public String getPersonalBuisinessVacationDay() {
		return personalBuisinessVacationDay;
	}

	public void setPersonalBuisinessVacationDay(String personalBuisinessVacationDay) {
		this.personalBuisinessVacationDay = personalBuisinessVacationDay;
	}

	public String getRemainVacationDay() {
		return remainVacationDay;
	}

	public void setRemainVacationDay(String remainVacationDay) {
		this.remainVacationDay = remainVacationDay;
	}

	public String getRemainVacationTime() {
		return remainVacationTime;
	}

	public void setRemainVacationTime(String remainVacationTime) {
		this.remainVacationTime = remainVacationTime;
	}

	public String getUseVacationYear() {
		return useVacationYear;
	}

	public void setUseVacationYear(String useVacationYear) {
		this.useVacationYear = useVacationYear;
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

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}
	public VacationApproval getVacationApproval() {
		return vacationApproval;
	}

	public void setVacationApproval(VacationApproval vacationApproval) {
		this.vacationApproval = vacationApproval;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VacationInformation [vacationInfoNum=");
		builder.append(vacationInfoNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", serviceNum=");
		builder.append(serviceNum);
		builder.append(", lengthOfService=");
		builder.append(lengthOfService);
		builder.append(", addVacation=");
		builder.append(addVacation);
		builder.append(", rewardVacationNumber=");
		builder.append(rewardVacationNumber);
		builder.append(", replaceVacationDay=");
		builder.append(replaceVacationDay);
		builder.append(", sickVacationDay=");
		builder.append(sickVacationDay);
		builder.append(", personalBuisinessVacationDay=");
		builder.append(personalBuisinessVacationDay);
		builder.append(", remainVacationDay=");
		builder.append(remainVacationDay);
		builder.append(", remainVacationTime=");
		builder.append(remainVacationTime);
		builder.append(", useVacationYear=");
		builder.append(useVacationYear);
		builder.append(", regMemberNum=");
		builder.append(regMemberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", correctMemberNum=");
		builder.append(correctMemberNum);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append(", vacationApproval=");
		builder.append(vacationApproval);
		builder.append("]");
		return builder.toString();
	}

	
}
