package ks45team01.unity.dto;

public class MajorCateGory {
	
	private String majorCategoryNum;
	private String categotyType;
	private String categotyRegistrant;
	private String regDate;
	private String categoryModifier;
	private String correctDate;
	private String categoryUseOrNot;
	public String getMajorCategoryNum() {
		return majorCategoryNum;
	}
	public void setMajorCategoryNum(String majorCategoryNum) {
		this.majorCategoryNum = majorCategoryNum;
	}
	public String getCategotyType() {
		return categotyType;
	}
	public void setCategotyType(String categotyType) {
		this.categotyType = categotyType;
	}
	public String getCategotyRegistrant() {
		return categotyRegistrant;
	}
	public void setCategotyRegistrant(String categotyRegistrant) {
		this.categotyRegistrant = categotyRegistrant;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getCategoryModifier() {
		return categoryModifier;
	}
	public void setCategoryModifier(String categoryModifier) {
		this.categoryModifier = categoryModifier;
	}
	public String getCorrectDate() {
		return correctDate;
	}
	public void setCorrectDate(String correctDate) {
		this.correctDate = correctDate;
	}
	public String getCategoryUseOrNot() {
		return categoryUseOrNot;
	}
	public void setCategoryUseOrNot(String categoryUseOrNot) {
		this.categoryUseOrNot = categoryUseOrNot;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MajorCategory [majorCategoryNum=");
		builder.append(majorCategoryNum);
		builder.append(", categotyType=");
		builder.append(categotyType);
		builder.append(", categotyRegistrant=");
		builder.append(categotyRegistrant);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", categoryModifier=");
		builder.append(categoryModifier);
		builder.append(", correctDate=");
		builder.append(correctDate);
		builder.append(", categoryUseOrNot=");
		builder.append(categoryUseOrNot);
		builder.append("]");
		return builder.toString();
	}
	
	
}
