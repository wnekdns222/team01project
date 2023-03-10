package ks45team01.unity.dto;

public class CommunityNotice {
	
	private String noticeCode;
	private String communityCode;
	private String noticeName;
	private String memberNum;
	private String noticeContent;
	private String noticeFile;
	private String noticeFilePath;
	private String noticeRegDate;
	private String noticeUpdateDate;
	private String noticeViewCount;
	
	public String getNoticeCode() {
		return noticeCode;
	}
	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}
	public String getCommunityCode() {
		return communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeFile() {
		return noticeFile;
	}
	public void setNoticeFile(String noticeFile) {
		this.noticeFile = noticeFile;
	}
	public String getNoticeFilePath() {
		return noticeFilePath;
	}
	public void setNoticeFilePath(String noticeFilePath) {
		this.noticeFilePath = noticeFilePath;
	}
	public String getNoticeRegDate() {
		return noticeRegDate;
	}
	public void setNoticeRegDate(String noticeRegDate) {
		this.noticeRegDate = noticeRegDate;
	}
	public String getNoticeUpdateDate() {
		return noticeUpdateDate;
	}
	public void setNoticeUpdateDate(String noticeUpdateDate) {
		this.noticeUpdateDate = noticeUpdateDate;
	}
	public String getNoticeViewCount() {
		return noticeViewCount;
	}
	public void setNoticeViewCount(String noticeViewCount) {
		this.noticeViewCount = noticeViewCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommunityNotice [noticeCode=");
		builder.append(noticeCode);
		builder.append(", communityCode=");
		builder.append(communityCode);
		builder.append(", noticeName=");
		builder.append(noticeName);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", noticeContent=");
		builder.append(noticeContent);
		builder.append(", noticeFile=");
		builder.append(noticeFile);
		builder.append(", noticeFilePath=");
		builder.append(noticeFilePath);
		builder.append(", noticeRegDate=");
		builder.append(noticeRegDate);
		builder.append(", noticeUpdateDate=");
		builder.append(noticeUpdateDate);
		builder.append(", noticeViewCount=");
		builder.append(noticeViewCount);
		builder.append("]");
		return builder.toString();
	}
	
}
	
	
