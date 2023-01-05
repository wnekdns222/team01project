package ks45team01.unity.dto;

public class CommunityBoard {
	
	private String BoardCode;
	private String CommunityCode;
	private String BoardName;
	private String MemberNum;
	private String BoardContent;
	private String BoardFile;
	private String BoardFilePath;
	private String BoardRegDate;
	private String BoardUpdateDate;
	private String BoardViewCount;
	public String getBoardCode() {
		return BoardCode;
	}
	public void setBoardCode(String BoardCode) {
		BoardCode = BoardCode;
	}
	public String getCommunityCode() {
		return CommunityCode;
	}
	public void setCommunityCode(String communityCode) {
		CommunityCode = communityCode;
	}
	public String getBoardName() {
		return BoardName;
	}
	public void setBoardName(String BoardName) {
		BoardName = BoardName;
	}
	public String getMemberNum() {
		return MemberNum;
	}
	public void setMemberNum(String memberNum) {
		MemberNum = memberNum;
	}
	public String getBoardContent() {
		return BoardContent;
	}
	public void setBoardContent(String BoardContent) {
		BoardContent = BoardContent;
	}
	public String getBoardFile() {
		return BoardFile;
	}
	public void setBoardFile(String BoardFile) {
		BoardFile = BoardFile;
	}
	public String getBoardFilePath() {
		return BoardFilePath;
	}
	public void setBoardFilePath(String BoardFilePath) {
		BoardFilePath = BoardFilePath;
	}
	public String getBoardRegDate() {
		return BoardRegDate;
	}
	public void setBoardRegDate(String BoardRegDate) {
		BoardRegDate = BoardRegDate;
	}
	public String getBoardUpdateDate() {
		return BoardUpdateDate;
	}
	public void setBoardUpdateDate(String BoardUpdateDate) {
		BoardUpdateDate = BoardUpdateDate;
	}
	public String getBoardViewCount() {
		return BoardViewCount;
	}
	public void setBoardViewCount(String BoardViewCount) {
		BoardViewCount = BoardViewCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommunityBoard [BoardCode=");
		builder.append(BoardCode);
		builder.append(", CommunityCode=");
		builder.append(CommunityCode);
		builder.append(", BoardName=");
		builder.append(BoardName);
		builder.append(", MemberNum=");
		builder.append(MemberNum);
		builder.append(", BoardContent=");
		builder.append(BoardContent);
		builder.append(", BoardFile=");
		builder.append(BoardFile);
		builder.append(", BoardFilePath=");
		builder.append(BoardFilePath);
		builder.append(", BoardRegDate=");
		builder.append(BoardRegDate);
		builder.append(", BoardUpdateDate=");
		builder.append(BoardUpdateDate);
		builder.append(", BoardViewCount=");
		builder.append(BoardViewCount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
