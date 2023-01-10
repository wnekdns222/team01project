package ks45team01.unity.dto;

public class CommunityBoard {
	
	private String boardCode;
	private String communityCode;
	private String boardName;
	private String memberNum;
	private String boardContent;
	private String boardFile;
	private String boardFilePath;
	private String boardRegDate;
	private String boardUpdateDate;
	private String boardViewCount;
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public String getCommunityCode() {
		return communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardFile() {
		return boardFile;
	}
	public void setBoardFile(String boardFile) {
		this.boardFile = boardFile;
	}
	public String getBoardFilePath() {
		return boardFilePath;
	}
	public void setBoardFilePath(String boardFilePath) {
		this.boardFilePath = boardFilePath;
	}
	public String getBoardRegDate() {
		return boardRegDate;
	}
	public void setBoardRegDate(String boardRegDate) {
		this.boardRegDate = boardRegDate;
	}
	public String getBoardUpdateDate() {
		return boardUpdateDate;
	}
	public void setBoardUpdateDate(String boardUpdateDate) {
		this.boardUpdateDate = boardUpdateDate;
	}
	public String getBoardViewCount() {
		return boardViewCount;
	}
	public void setBoardViewCount(String boardViewCount) {
		this.boardViewCount = boardViewCount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommunityBoard [boardCode=");
		builder.append(boardCode);
		builder.append(", communityCode=");
		builder.append(communityCode);
		builder.append(", boardName=");
		builder.append(boardName);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", boardContent=");
		builder.append(boardContent);
		builder.append(", boardFile=");
		builder.append(boardFile);
		builder.append(", boardFilePath=");
		builder.append(boardFilePath);
		builder.append(", boardRegDate=");
		builder.append(boardRegDate);
		builder.append(", boardUpdateDate=");
		builder.append(boardUpdateDate);
		builder.append(", boardViewCount=");
		builder.append(boardViewCount);
		builder.append("]");
		return builder.toString();
	}

	
}
