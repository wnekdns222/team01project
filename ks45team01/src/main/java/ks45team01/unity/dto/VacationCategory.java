package ks45team01.unity.dto;

public class VacationCategory {

	private String vacationCategoryNum;
	private String vacationCategoryName;
	private String memberNum;
	private String regDate;
	private String vacationUse;
	
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
		builder.append("]");
		return builder.toString();
	}
	
}
