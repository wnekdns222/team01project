package ks45team01.unity.dto;

public class FileBoardCate {
	
	private String fileCategoryCode;
	private String fileCategoryName;
	private String fileCategoryRegistrant;
	private String fileCategoryRegDate;
	private String fileCategoryModifier;
	private String fileCategoryModificationDate;
	private String categoryUseOrNot;
	
	private MemberPositionList memberPositionList;

	private MemberList memberList;

	private MemberDepartmentList memberDepartmentList;

	public String getFileCategoryCode() {
		return fileCategoryCode;
	}

	public void setFileCategoryCode(String fileCategoryCode) {
		this.fileCategoryCode = fileCategoryCode;
	}

	public String getFileCategoryName() {
		return fileCategoryName;
	}

	public void setFileCategoryName(String fileCategoryName) {
		this.fileCategoryName = fileCategoryName;
	}

	public String getFileCategoryRegistrant() {
		return fileCategoryRegistrant;
	}

	public void setFileCategoryRegistrant(String fileCategoryRegistrant) {
		this.fileCategoryRegistrant = fileCategoryRegistrant;
	}

	public String getFileCategoryRegDate() {
		return fileCategoryRegDate;
	}

	public void setFileCategoryRegDate(String fileCategoryRegDate) {
		this.fileCategoryRegDate = fileCategoryRegDate;
	}

	public String getFileCategoryModifier() {
		return fileCategoryModifier;
	}

	public void setFileCategoryModifier(String fileCategoryModifier) {
		this.fileCategoryModifier = fileCategoryModifier;
	}

	public String getFileCategoryModificationDate() {
		return fileCategoryModificationDate;
	}

	public void setFileCategoryModificationDate(String fileCategoryModificationDate) {
		this.fileCategoryModificationDate = fileCategoryModificationDate;
	}

	public String getCategoryUseOrNot() {
		return categoryUseOrNot;
	}

	public void setCategoryUseOrNot(String categoryUseOrNot) {
		this.categoryUseOrNot = categoryUseOrNot;
	}

	public MemberPositionList getMemberPositionList() {
		return memberPositionList;
	}

	public void setMemberPositionList(MemberPositionList memberPositionList) {
		this.memberPositionList = memberPositionList;
	}

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}

	public MemberDepartmentList getMemberDepartmentList() {
		return memberDepartmentList;
	}

	public void setMemberDepartmentList(MemberDepartmentList memberDepartmentList) {
		this.memberDepartmentList = memberDepartmentList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileBoardCate [fileCategoryCode=");
		builder.append(fileCategoryCode);
		builder.append(", fileCategoryName=");
		builder.append(fileCategoryName);
		builder.append(", fileCategoryRegistrant=");
		builder.append(fileCategoryRegistrant);
		builder.append(", fileCategoryRegDate=");
		builder.append(fileCategoryRegDate);
		builder.append(", fileCategoryModifier=");
		builder.append(fileCategoryModifier);
		builder.append(", fileCategoryModificationDate=");
		builder.append(fileCategoryModificationDate);
		builder.append(", categoryUseOrNot=");
		builder.append(categoryUseOrNot);
		builder.append(", memberPositionList=");
		builder.append(memberPositionList);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append(", memberDepartmentList=");
		builder.append(memberDepartmentList);
		builder.append("]");
		return builder.toString();
	}
	
}
