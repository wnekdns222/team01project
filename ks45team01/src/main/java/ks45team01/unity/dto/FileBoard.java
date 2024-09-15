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
	
	private FileBoardCate fileBoardCate;

	private MemberPositionList memberPositionList;

	private MemberList memberList;

	private MemberDepartmentList memberDepartmentList;
	
	private FileDto fileDto;
	
	private FileControl fileControl;

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

	public FileBoardCate getFileBoardCate() {
		return fileBoardCate;
	}

	public void setFileBoardCate(FileBoardCate fileBoardCate) {
		this.fileBoardCate = fileBoardCate;
	}

	public MemberPositionList getMemberPositionList() {
		return memberPositionList;
	}

	public void setMemberPositionList(MemberPositionList memberPositionList) {
		this.memberPositionList = memberPositionList;
	}

	public MemberList getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberList memberList) {
		this.memberList = memberList;
	}

	public MemberDepartmentList getMemberDepartmentList() {
		return memberDepartmentList;
	}

	public void setMemberDepartmentList(MemberDepartmentList memberDepartmentList) {
		this.memberDepartmentList = memberDepartmentList;
	}

	public FileDto getFileDto() {
		return fileDto;
	}

	public void setFileDto(FileDto fileDto) {
		this.fileDto = fileDto;
	}

	public FileControl getFileControl() {
		return fileControl;
	}

	public void setFileControl(FileControl fileControl) {
		this.fileControl = fileControl;
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
		builder.append(", fileBoardCate=");
		builder.append(fileBoardCate);
		builder.append(", memberPositionList=");
		builder.append(memberPositionList);
		builder.append(", memberList=");
		builder.append(memberList);
		builder.append(", memberDepartmentList=");
		builder.append(memberDepartmentList);
		builder.append(", fileDto=");
		builder.append(fileDto);
		builder.append(", fileControl=");
		builder.append(fileControl);
		builder.append("]");
		return builder.toString();
	}

	
}