package ks45team01.unity.dto;

public class FileBoard {
	
	private String fileBoardNum;
	private String fileCategoryCode;
	private String fileBoardRegistrant;
	private String fileBoardTitle;
	private String fileBoardContents;
	private String fileRegDate;
	private String fileModifier;
	private String fileModificationDate;
	private String fileUseOrNot;
	private String fileGroupCode;
	public String getFileBoardNum() {
		return fileBoardNum;
	}
	public void setFileBoardNum(String fileBoardNum) {
		this.fileBoardNum = fileBoardNum;
	}
	public String getFileCategoryCode() {
		return fileCategoryCode;
	}
	public void setFileCategoryCode(String fileCategoryCode) {
		this.fileCategoryCode = fileCategoryCode;
	}
	public String getFileBoardRegistrant() {
		return fileBoardRegistrant;
	}
	public void setFileBoardRegistrant(String fileBoardRegistrant) {
		this.fileBoardRegistrant = fileBoardRegistrant;
	}
	public String getFileBoardTitle() {
		return fileBoardTitle;
	}
	public void setFileBoardTitle(String fileBoardTitle) {
		this.fileBoardTitle = fileBoardTitle;
	}
	public String getFileBoardContents() {
		return fileBoardContents;
	}
	public void setFileBoardContents(String fileBoardContents) {
		this.fileBoardContents = fileBoardContents;
	}
	public String getFileRegDate() {
		return fileRegDate;
	}
	public void setFileRegDate(String fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	public String getFileModifier() {
		return fileModifier;
	}
	public void setFileModifier(String fileModifier) {
		this.fileModifier = fileModifier;
	}
	public String getFileModificationDate() {
		return fileModificationDate;
	}
	public void setFileModificationDate(String fileModificationDate) {
		this.fileModificationDate = fileModificationDate;
	}
	public String getFileUseOrNot() {
		return fileUseOrNot;
	}
	public void setFileUseOrNot(String fileUseOrNot) {
		this.fileUseOrNot = fileUseOrNot;
	}
	public String getFileGroupCode() {
		return fileGroupCode;
	}
	public void setFileGroupCode(String fileGroupCode) {
		this.fileGroupCode = fileGroupCode;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileBoard [fileBoardNum=");
		builder.append(fileBoardNum);
		builder.append(", fileCategoryCode=");
		builder.append(fileCategoryCode);
		builder.append(", fileBoardRegistrant=");
		builder.append(fileBoardRegistrant);
		builder.append(", fileBoardTitle=");
		builder.append(fileBoardTitle);
		builder.append(", fileBoardContents=");
		builder.append(fileBoardContents);
		builder.append(", fileRegDate=");
		builder.append(fileRegDate);
		builder.append(", fileModifier=");
		builder.append(fileModifier);
		builder.append(", fileModificationDate=");
		builder.append(fileModificationDate);
		builder.append(", fileUseOrNot=");
		builder.append(fileUseOrNot);
		builder.append(", fileGroupCode=");
		builder.append(fileGroupCode);
		builder.append("]");
		return builder.toString();
	}
	
}
