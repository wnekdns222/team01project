package ks45team01.unity.dto;

public class VacationCategory {

	private String vacationCategoryNum;
	private String vacationCategoryName;
	private String memberNum;
	private String regDate;
	private String vacationUse;
	private String correctMemberNum;
	private String correctDate;
	
	public String getVacationCategoryNum() {
		return vacationCategoryNum;
	}
	public void setVacationCategoryNum(String vacationCategoryNum) {
		this.vacationCategoryNum = vacationCategoryNum;
	}
	public String getVacationCategoryName() {
		return vacationCategoryName;
	}
	public void setVacationCategoryName(String vacationCategoryName) {
		this.vacationCategoryName = vacationCategoryName;
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
	public String getVacationUse() {
		return vacationUse;
	}
	public void setVacationUse(String vacationUse) {
		this.vacationUse = vacationUse;
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
		builder.append("VacationCategory [vacationCategoryNum=");
		builder.append(vacationCategoryNum);
		builder.append(", vacationCategoryName=");
		builder.append(vacationCategoryName);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", vacationUse=");
		builder.append(vacationUse);
		builder.append(", correctMemberNum=");
		builder.append(correctMemberNum);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append("]");
		return builder.toString();
	}
	
}
