package ks45team01.unity.dto;

public class CommunityNotice {
	
	private String NoticeCode;
	private String CommunityCode;
	private String NoticeName;
	private String MemberNum;
	private String NoticeContent;
	private String NoticeFile;
	private String NoticeFilePath;
	private String NoticeRegDate;
	private String NoticeUpdateDate;
	private String NoticeViewCount;
	public String getNoticeCode() {
		return NoticeCode;
	}
	public void setNoticeCode(String noticeCode) {
		NoticeCode = noticeCode;
	}
	public String getCommunityCode() {
		return CommunityCode;
	}
	public void setCommunityCode(String communityCode) {
		CommunityCode = communityCode;
	}
	public String getNoticeName() {
		return NoticeName;
	}
	public void setNoticeName(String noticeName) {
		NoticeName = noticeName;
	}
	public String getMemberNum() {
		return MemberNum;
	}
	public void setMemberNum(String memberNum) {
		MemberNum = memberNum;
	}
	public String getNoticeContent() {
		return NoticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		NoticeContent = noticeContent;
	}
	public String getNoticeFile() {
		return NoticeFile;
	}
	public void setNoticeFile(String noticeFile) {
		NoticeFile = noticeFile;
	}
	public String getNoticeFilePath() {
		return NoticeFilePath;
	}
	public void setNoticeFilePath(String noticeFilePath) {
		NoticeFilePath = noticeFilePath;
	}
	public String getNoticeRegDate() {
		return NoticeRegDate;
	}
	public void setNoticeRegDate(String noticeRegDate) {
		NoticeRegDate = noticeRegDate;
	}
	public String getNoticeUpdateDate() {
		return NoticeUpdateDate;
	}
	public void setNoticeUpdateDate(String noticeUpdateDate) {
		NoticeUpdateDate = noticeUpdateDate;
	}
	public String getNoticeViewCount() {
		return NoticeViewCount;
	}
	public void setNoticeViewCount(String noticeViewCount) {
		NoticeViewCount = noticeViewCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommunityNotice [NoticeCode=");
		builder.append(NoticeCode);
		builder.append(", CommunityCode=");
		builder.append(CommunityCode);
		builder.append(", NoticeName=");
		builder.append(NoticeName);
		builder.append(", MemberNum=");
		builder.append(MemberNum);
		builder.append(", NoticeContent=");
		builder.append(NoticeContent);
		builder.append(", NoticeFile=");
		builder.append(NoticeFile);
		builder.append(", NoticeFilePath=");
		builder.append(NoticeFilePath);
		builder.append(", NoticeRegDate=");
		builder.append(NoticeRegDate);
		builder.append(", NoticeUpdateDate=");
		builder.append(NoticeUpdateDate);
		builder.append(", NoticeViewCount=");
		builder.append(NoticeViewCount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
