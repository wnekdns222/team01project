package ks45team01.unity.dto;

public class MemberPositionList {
	private String positionNum;
	private String positionName;
	private String memberNum;
	private String positionRegDate;
	private String positionUpdateDate;
	private String positionModifier;
	private String useOrNot;
	public String getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getPositionRegDate() {
		return positionRegDate;
	}
	public void setPositionRegDate(String positionRegDate) {
		this.positionRegDate = positionRegDate;
	}
	public String getPositionUpdateDate() {
		return positionUpdateDate;
	}
	public void setPositionUpdateDate(String positionUpdateDate) {
		this.positionUpdateDate = positionUpdateDate;
	}
	public String getPositionModifier() {
		return positionModifier;
	}
	public void setPositionModifier(String positionModifier) {
		this.positionModifier = positionModifier;
	}
	public String getUseOrNot() {
		return useOrNot;
	}
	public void setUseOrNot(String useOrNot) {
		this.useOrNot = useOrNot;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberPositionList [positionNum=");
		builder.append(positionNum);
		builder.append(", positionName=");
		builder.append(positionName);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", positionRegDate=");
		builder.append(positionRegDate);
		builder.append(", positionUpdateDate=");
		builder.append(positionUpdateDate);
		builder.append(", positionModifier=");
		builder.append(positionModifier);
		builder.append(", useOrNot=");
		builder.append(useOrNot);
		builder.append(", getPositionNum()=");
		builder.append(getPositionNum());
		builder.append(", getPositionName()=");
		builder.append(getPositionName());
		builder.append(", getMemberNum()=");
		builder.append(getMemberNum());
		builder.append(", getPositionRegDate()=");
		builder.append(getPositionRegDate());
		builder.append(", getPositionUpdateDate()=");
		builder.append(getPositionUpdateDate());
		builder.append(", getPositionModifier()=");
		builder.append(getPositionModifier());
		builder.append(", getUseOrNot()=");
		builder.append(getUseOrNot());
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
