package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.Approval;
import ks45team01.unity.dto.ApprovalLine;
import ks45team01.unity.mapper.ApprovalMapper;

@Service
@Transactional
public class ApprovalService {
	
	private final ApprovalMapper approvalMapper;
	public ApprovalService(ApprovalMapper approvalMapper) {
		this.approvalMapper = approvalMapper;
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
	public void addApprovalMember(List<ApprovalLine> approvalLineList) {
		approvalMapper.addApprovalMember(approvalLineList);
	}
}
