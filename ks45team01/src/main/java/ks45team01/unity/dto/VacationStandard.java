package ks45team01.unity.dto;

public class VacationStandard {

	private String serviceNum;
	private String lengthOfService;
	private String addVacation;
	private String giveTime;
	private String vacationStandardUse;
	private String regMemberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
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
	public String getGiveTime() {
		return giveTime;
	}
	public void setGiveTime(String giveTime) {
		this.giveTime = giveTime;
	}
	public String getVacationStandardUse() {
		return vacationStandardUse;
	}
	public void setVacationStandardUse(String vacationStandardUse) {
		this.vacationStandardUse = vacationStandardUse;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VacationStandard [serviceNum=");
		builder.append(serviceNum);
		builder.append(", lengthOfService=");
		builder.append(lengthOfService);
		builder.append(", addVacation=");
		builder.append(addVacation);
		builder.append(", giveTime=");
		builder.append(giveTime);
		builder.append(", vacationStandardUse=");
		builder.append(vacationStandardUse);
		builder.append(", regMemberNum=");
		builder.append(regMemberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", correctMemberNum=");
		builder.append(correctMemberNum);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append("]");
		return builder.toString();
	}
	
}
