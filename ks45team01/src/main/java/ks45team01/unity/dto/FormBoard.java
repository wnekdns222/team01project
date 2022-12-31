package ks45team01.unity.dto;

public class FormBoard {
	
	private int formNum;
	private String formName;
	private String formContents;
	private String formAddFile;
	private String formFilePath;
	private String formRegiStrant;
	private String formCommentRegDate;
	private String formModificationDate;
	private String formModifier;
	public int getFormNum() {
		return formNum;
	}
	public void setFormNum(int formNum) {
		this.formNum = formNum;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getFormContents() {
		return formContents;
	}
	public void setFormContents(String formContents) {
		this.formContents = formContents;
	}
	public String getFormAddFile() {
		return formAddFile;
	}
	public void setFormAddFile(String formAddFile) {
		this.formAddFile = formAddFile;
	}
	public String getFormFilePath() {
		return formFilePath;
	}
	public void setFormFilePath(String formFilePath) {
		this.formFilePath = formFilePath;
	}
	public String getFormRegiStrant() {
		return formRegiStrant;
	}
	public void setFormRegiStrant(String formRegiStrant) {
		this.formRegiStrant = formRegiStrant;
	}
	public String getFormCommentRegDate() {
		return formCommentRegDate;
	}
	public void setFormCommentRegDate(String formCommentRegDate) {
		this.formCommentRegDate = formCommentRegDate;
	}
	public String getFormModificationDate() {
		return formModificationDate;
	}
	public void setFormModificationDate(String formModificationDate) {
		this.formModificationDate = formModificationDate;
	}
	public String getFormModifier() {
		return formModifier;
	}
	public void setFormModifier(String formModifier) {
		this.formModifier = formModifier;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormBoard [formNum=");
		builder.append(formNum);
		builder.append(", formName=");
		builder.append(formName);
		builder.append(", formContents=");
		builder.append(formContents);
		builder.append(", formAddFile=");
		builder.append(formAddFile);
		builder.append(", formFilePath=");
		builder.append(formFilePath);
		builder.append(", formRegiStrant=");
		builder.append(formRegiStrant);
		builder.append(", formCommentRegDate=");
		builder.append(formCommentRegDate);
		builder.append(", formModificationDate=");
		builder.append(formModificationDate);
		builder.append(", formModifier=");
		builder.append(formModifier);
		builder.append("]");
		return builder.toString();
	}
	
	
}
