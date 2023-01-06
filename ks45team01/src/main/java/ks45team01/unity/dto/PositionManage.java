package ks45team01.unity.dto;

public class PositionManage {
	private String positionListNum;
	private String memberNum;
	private String positionNum;
	private String positionRegDate;
	private String positionUpdateRegDate;
	private String positionListManageRegistrant;
	private String regDate;
	private String positionListManageModifier;
	private String positionUpdateDate;
	public String getPositionListNum() {
		return positionListNum;
	}
	public void setPositionListNum(String positionListNum) {
		this.positionListNum = positionListNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}
	public String getPositionRegDate() {
		return positionRegDate;
	}
	public void setPositionRegDate(String positionRegDate) {
		this.positionRegDate = positionRegDate;
	}
	public String getPositionUpdateRegDate() {
		return positionUpdateRegDate;
	}
	public void setPositionUpdateRegDate(String positionUpdateRegDate) {
		this.positionUpdateRegDate = positionUpdateRegDate;
	}
	public String getPositionListManageRegistrant() {
		return positionListManageRegistrant;
	}
	public void setPositionListManageRegistrant(String positionListManageRegistrant) {
		this.positionListManageRegistrant = positionListManageRegistrant;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getPositionListManageModifier() {
		return positionListManageModifier;
	}
	public void setPositionListManageModifier(String positionListManageModifier) {
		this.positionListManageModifier = positionListManageModifier;
	}
	public String getPositionUpdateDate() {
		return positionUpdateDate;
	}
	public void setPositionUpdateDate(String positionUpdateDate) {
		this.positionUpdateDate = positionUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PositionManage [positionListNum=");
		builder.append(positionListNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", positionNum=");
		builder.append(positionNum);
		builder.append(", positionRegDate=");
		builder.append(positionRegDate);
		builder.append(", positionUpdateRegDate=");
		builder.append(positionUpdateRegDate);
		builder.append(", positionListManageRegistrant=");
		builder.append(positionListManageRegistrant);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", positionListManageModifier=");
		builder.append(positionListManageModifier);
		builder.append(", positionUpdateDate=");
		builder.append(positionUpdateDate);
		builder.append(", getPositionListNum()=");
		builder.append(getPositionListNum());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getPositionNum()=");
		builder.append(getPositionNum());
		builder.append(", getPositionRegDate()=");
		builder.append(getPositionRegDate());
		builder.append(", getPositionUpdateRegDate()=");
		builder.append(getPositionUpdateRegDate());
		builder.append(", getPositionListManageRegistrant()=");
		builder.append(getPositionListManageRegistrant());
		builder.append(", getRegDate()=");
		builder.append(getRegDate());
		builder.append(", getPositionListManageModifier()=");
		builder.append(getPositionListManageModifier());
		builder.append(", getPositionUpdateDate()=");
		builder.append(getPositionUpdateDate());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
