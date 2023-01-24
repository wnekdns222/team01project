package ks45team01.unity.dto;

public class TodoDTO {
	
	private String todoTableNum;
	private String memberNum;
	private String finishUseOrNot;
	private String checklistContents;
	
	public String getTodoTableNum() {
		return todoTableNum;
	}
	public void setTodoTableNum(String todoTableNum) {
		this.todoTableNum = todoTableNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getFinishUseOrNot() {
		return finishUseOrNot;
	}
	public void setFinishUseOrNot(String finishUseOrNot) {
		this.finishUseOrNot = finishUseOrNot;
	}
	public String getChecklistContents() {
		return checklistContents;
	}
	public void setChecklistContents(String checklistContents) {
		this.checklistContents = checklistContents;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TodoDTO [todoTableNum=");
		builder.append(todoTableNum);
		builder.append(", memberNum=");
		builder.append(memberNum);
		builder.append(", finishUseOrNot=");
		builder.append(finishUseOrNot);
		builder.append(", checklistContents=");
		builder.append(checklistContents);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
