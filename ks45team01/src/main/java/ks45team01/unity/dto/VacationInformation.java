package ks45team01.unity.dto;

public class VacationInformation {

	private String vacationInfoNum;
	private String memberNum;
	private String serviceNum;
	private String lengthOfService;
	private String addVacation;
	private String rewardVacationNumber;
	private String replaceVacationDay;
	private String remainVacationDay;
	private String remainVacationTime;
	private String useVacationYear;
	private String regMemberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
	private String memberList;
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
	public String getMemberList() {
		return memberList;
	}
	public void setMemberList(String memberList) {
		this.memberList = memberList;
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
		builder.append("]");
		return builder.toString();
	}
	
}
