package ks45team01.unity.dto;

public class FileControl {

	private int fileControlCode;
	private String fileGroupCode;
	private String fileIdx;
	public int getFileControlCode() {
		return fileControlCode;
	}
	public void setFileControlCode(int fileControlCode) {
		this.fileControlCode = fileControlCode;
	}
	public String getFileGroupCode() {
		return fileGroupCode;
	}
	public void setFileGroupCode(String fileGroupCode) {
		this.fileGroupCode = fileGroupCode;
	}
	public String getFileIdx() {
		return fileIdx;
	}
	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileControl [fileControlCode=");
		builder.append(fileControlCode);
		builder.append(", fileGroupCode=");
		builder.append(fileGroupCode);
		builder.append(", fileIdx=");
		builder.append(fileIdx);
		builder.append("]");
		return builder.toString();
	}
	
}
