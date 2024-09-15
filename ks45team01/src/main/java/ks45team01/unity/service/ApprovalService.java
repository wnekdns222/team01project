package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.Approval;
import ks45team01.unity.dto.ApprovalLine;
import ks45team01.unity.dto.VacationApproval;
import ks45team01.unity.dto.WorkCorrectApproval;
import ks45team01.unity.mapper.ApprovalMapper;
import ks45team01.unity.mapper.WorkMapper;

@Service
@Transactional
public class ApprovalService {
	
	private final ApprovalMapper approvalMapper;
	private final WorkMapper workMapper;
	public ApprovalService(ApprovalMapper approvalMapper, WorkMapper workMapper) {
		this.approvalMapper = approvalMapper;
		this.workMapper = workMapper;
	}
	
	/**
	 * 기안문서 목록 조회
	 * @param registrantNum 
	 * @return approvalMapper.draftList
	 */
	public List<Approval> draftList(String registrantNum){
		return approvalMapper.draftList(registrantNum);
	}
	
	/**
	 * 개별 기안문서 상세보기
	 * @param draftDocNum
	 * @return approvalMapper.draftView(draftDocNum)
	 */
	public Approval draftView(String draftDocNum) {
		return approvalMapper.draftView(draftDocNum);
	}
	
	/**
	 * 결재 진행 목록 조회
	 * @return approvalMapper.approvalList
	 */
	public List<Approval> approvalList(){
		return approvalMapper.approvalList();
	}
	/**
	 * 결재 완료 목록 조회
	 * @return approvalMapper.approvalDoneList
	 */
	public List<Approval> approvalDoneList(){
		return approvalMapper.approvalDoneList();
	}
	public void approvalApprove(String draftDocNum, String processStatus) {
		approvalMapper.approvalApprove(draftDocNum, processStatus);
	}
	public int approvalDoneProcess(String approvalProcessNum, String draftDocNum) {
		return approvalMapper.approvalDoneProcess(approvalProcessNum, draftDocNum);
	}
	
	/**
	 * 반려사유 등록
	 * @param approvalProcessNum
	 * @param rejectReasonMember
	 * @param rejectReason
	 * @param rejectDate
	 */
	public void addRejectReason(String draftDocNum, String approvalProcessNum, String rejectReasonMember, String rejectReason, String rejectDate) {
		approvalMapper.addRejectReason(draftDocNum, approvalProcessNum, rejectReasonMember, rejectReason, rejectDate);
	}
	
	public int rejectProcess(String approvalFinalState, String draftDocNum) {
		return approvalMapper.rejectProcess(approvalFinalState, draftDocNum);
	}
	
	/**
	 * 반려문서 목록조회
	 * @return approvalMapper.rejectList
	 */
	public List<Approval> rejectList(){
		return approvalMapper.rejectList();
	}
	public Approval rejectView(String draftDocNum) {
		return approvalMapper.rejectView(draftDocNum);
	}
	/**
	 * 기안문서 등록
	 * @param approval
	 */
	public void addDraftInsert(Approval approval) {
		String draftDocNum = approvalMapper.getCommonNewCode("tb_draft_document", "draft_doc_num");
		approval.setDraftDocNum(draftDocNum);
		approvalMapper.addDraftInsert(approval);
	}
	/**
	 * 결재자 추가
	 * @param approvalLineList
	 */
	public void addApprovalMember(List<ApprovalLine> approvalLineList) {
		approvalMapper.addApprovalMember(approvalLineList);
	}
	/**
	 * 연차사용신청서
	 * @param vacationApproval
	 */
	public void addVacationApproval(VacationApproval vacationApproval) {
		String vacationApprovalNum = approvalMapper.getCommonNewCode("tb_vacation_approval", "vacation_approval_num");
		vacationApproval.setVacationApprovalNum(vacationApprovalNum);
		approvalMapper.addVacationApproval(vacationApproval);
	}
	/**
	 * 근태정정신청서
	 * @param vacationApproval
	 */
	public void addWorkCorrectApproval(WorkCorrectApproval workCorrectApproval, String attendanceDay) {
		String workCorrectNum = approvalMapper.getCommonNewCode("tb_work_correct_approval", "work_correct_num");
		workCorrectApproval.setWorkCorrectNum(workCorrectNum);
		String memberNum = workCorrectApproval.getMemberNum();
		String workNum = workMapper.getWorkNum(memberNum, attendanceDay);
		workCorrectApproval.setWorkNum(workNum);
		approvalMapper.addWorkCorrectApproval(workCorrectApproval);
	}
}
