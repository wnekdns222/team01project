package ks45team01.unity.dto;

public class VacationSort {
	
	private String vacationSortNum;
	private String vacationSortName;
	private String memberNum;
	private String regDate;
	private String vacationUse;
	public String getVacationSortNum() {
		return vacationSortNum;
	}
	public void setVacationSortNum(String vacationSortNum) {
		this.vacationSortNum = vacationSortNum;
	}
	public String getVacationSortName() {
		return vacationSortName;
	}
	public void setVacationSortName(String vacationSortName) {
		this.vacationSortName = vacationSortName;
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
		builder.append("VacationSort [vacationSortNum=");
		builder.append(vacationSortNum);
		builder.append(", vacationSortName=");
		builder.append(vacationSortName);
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
