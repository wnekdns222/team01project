package ks45team01.unity.dto;

public class File {
	
	private String fileNum;
	private String fileCategoryCode;
	private String fileRegiStrant;
	private String fileTitle;
	private String fileContents;
	private String fileAttach;
	private String filePath;
	private String fileRegDate;
	private String fileModifier;
	private String fileModificationDate;
	private String fileSize;
	private String fileUseOrNot;
	public String getFileNum() {
		return fileNum;
	}
	public void setFileNum(String fileNum) {
		this.fileNum = fileNum;
	}
	public String getFileCategoryCode() {
		return fileCategoryCode;
	}
	public void setFileCategoryCode(String fileCategoryCode) {
		this.fileCategoryCode = fileCategoryCode;
	}
	public String getFileRegiStrant() {
		return fileRegiStrant;
	}
	public void setFileRegiStrant(String fileRegiStrant) {
		this.fileRegiStrant = fileRegiStrant;
	}
	public String getFileTitle() {
		return fileTitle;
	}
	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}
	public String getFileContents() {
		return fileContents;
	}
	public void setFileContents(String fileContents) {
		this.fileContents = fileContents;
	}
	public String getFileAttach() {
		return fileAttach;
	}
	public void setFileAttach(String fileAttach) {
		this.fileAttach = fileAttach;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileUseOrNot() {
		return fileUseOrNot;
	}
	public void setFileUseOrNot(String fileUseOrNot) {
		this.fileUseOrNot = fileUseOrNot;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("File [fileNum=");
		builder.append(fileNum);
		builder.append(", fileCategoryCode=");
		builder.append(fileCategoryCode);
		builder.append(", fileRegiStrant=");
		builder.append(fileRegiStrant);
		builder.append(", fileTitle=");
		builder.append(fileTitle);
		builder.append(", fileContents=");
		builder.append(fileContents);
		builder.append(", fileAttach=");
		builder.append(fileAttach);
		builder.append(", filePath=");
		builder.append(filePath);
		builder.append(", fileRegDate=");
		builder.append(fileRegDate);
		builder.append(", fileModifier=");
		builder.append(fileModifier);
		builder.append(", fileModificationDate=");
		builder.append(fileModificationDate);
		builder.append(", fileSize=");
		builder.append(fileSize);
		builder.append(", fileUseOrNot=");
		builder.append(fileUseOrNot);
		builder.append("]");
		return builder.toString();
	}
	
	
}
