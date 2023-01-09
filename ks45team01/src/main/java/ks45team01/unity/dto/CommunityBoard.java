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
	public void setBoardCode(String boardCode) {
		BoardCode = boardCode;
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
	public void setBoardName(String boardName) {
		BoardName = boardName;
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
	public void setBoardContent(String boardContent) {
		BoardContent = boardContent;
	}
	public String getBoardFile() {
		return BoardFile;
	}
	public void setBoardFile(String boardFile) {
		BoardFile = boardFile;
	}
	public String getBoardFilePath() {
		return BoardFilePath;
	}
	public void setBoardFilePath(String boardFilePath) {
		BoardFilePath = boardFilePath;
	}
	public String getBoardRegDate() {
		return BoardRegDate;
	}
	public void setBoardRegDate(String boardRegDate) {
		BoardRegDate = boardRegDate;
	}
	public String getBoardUpdateDate() {
		return BoardUpdateDate;
	}
	public void setBoardUpdateDate(String boardUpdateDate) {
		BoardUpdateDate = boardUpdateDate;
	}
	public String getBoardViewCount() {
		return BoardViewCount;
	}
	public void setBoardViewCount(String boardViewCount) {
		BoardViewCount = boardViewCount;
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
