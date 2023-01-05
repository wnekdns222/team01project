package ks45team01.unity.dto;

public class CalenderCategory {
	private String CalenderCategoryNum;
	private String CalenderCategoryName;
	private String MemberNum;
	private String CalenderCategoryRegDate;
	private String CalenderCategoryUpdateDate;
	private String CalenderCategoryUseOrNot;
	public String getCalenderCategoryNum() {
		return CalenderCategoryNum;
	}
	public void setCalenderCategoryNum(String calenderCategoryNum) {
		CalenderCategoryNum = calenderCategoryNum;
	}
	public String getCalenderCategoryName() {
		return CalenderCategoryName;
	}
	public void setCalenderCategoryName(String calenderCategoryName) {
		CalenderCategoryName = calenderCategoryName;
	}
	public String getMemberNum() {
		return MemberNum;
	}
	public void setMemberNum(String memberNum) {
		MemberNum = memberNum;
	}
	public String getCalenderCategoryRegDate() {
		return CalenderCategoryRegDate;
	}
	public void setCalenderCategoryRegDate(String calenderCategoryRegDate) {
		CalenderCategoryRegDate = calenderCategoryRegDate;
	}
	public String getCalenderCategoryUpdateDate() {
		return CalenderCategoryUpdateDate;
	}
	public void setCalenderCategoryUpdateDate(String calenderCategoryUpdateDate) {
		CalenderCategoryUpdateDate = calenderCategoryUpdateDate;
	}
	public String getCalenderCategoryUseOrNot() {
		return CalenderCategoryUseOrNot;
	}
	public void setCalenderCategoryUseOrNot(String calenderCategoryUseOrNot) {
		CalenderCategoryUseOrNot = calenderCategoryUseOrNot;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalenderCategory [CalenderCategoryNum=");
		builder.append(CalenderCategoryNum);
		builder.append(", CalenderCategoryName=");
		builder.append(CalenderCategoryName);
		builder.append(", MemberNum=");
		builder.append(MemberNum);
		builder.append(", CalenderCategoryRegDate=");
		builder.append(CalenderCategoryRegDate);
		builder.append(", CalenderCategoryUpdateDate=");
		builder.append(CalenderCategoryUpdateDate);
		builder.append(", CalenderCategoryUseOrNot=");
		builder.append(CalenderCategoryUseOrNot);
		builder.append("]");
		return builder.toString();
	}
	
	
}
