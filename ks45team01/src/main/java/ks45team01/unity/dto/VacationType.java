package ks45team01.unity.dto;

public class VacationType {

	private String vacationTypeNum;
	private String vacationName;
	private String vacationType;
	private String subtractUnit;
	private String vacationUse;
	private String memberNum;
	private String regDate;
	private String correctMemberNum;
	private String correctDate;
	
	public String getVacationTypeNum() {
		return vacationTypeNum;
	}
	public void setVacationTypeNum(String vacationTypeNum) {
		this.vacationTypeNum = vacationTypeNum;
	}
	public String getVacationName() {
		return vacationName;
	}
	public void setVacationName(String vacationName) {
		this.vacationName = vacationName;
	}
	public String getVacationType() {
		return vacationType;
	}
	public void setVacationType(String vacationType) {
		this.vacationType = vacationType;
	}
	public String getSubtractUnit() {
		return subtractUnit;
	}
	public void setSubtractUnit(String subtractUnit) {
		this.subtractUnit = subtractUnit;
	}
	public String getVacationUse() {
		return vacationUse;
	}
	public void setVacationUse(String vacationUse) {
		this.vacationUse = vacationUse;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
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
		builder.append("VacationType [vacationTypeNum=");
		builder.append(vacationTypeNum);
		builder.append(", vacationName=");
		builder.append(vacationName);
		builder.append(", vacationType=");
		builder.append(vacationType);
		builder.append(", subtractUnit=");
		builder.append(subtractUnit);
		builder.append(", vacationUse=");
		builder.append(vacationUse);
		builder.append(", memberNum=");
		builder.append(memberNum);
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
