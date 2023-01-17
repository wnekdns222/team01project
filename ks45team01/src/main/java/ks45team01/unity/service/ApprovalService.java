package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.Approval;
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
	 * @return approvalMapper.draftList
	 */
	public List<Approval> draftList(){
		return approvalMapper.draftList();
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
	
	/**
	 * 반려사유 등록
	 * @param approvalProcessNum
	 * @param rejectReasonMember
	 * @param rejectReason
	 * @param rejectDate
	 */
	public void addRejectReason(String approvalProcessNum, String rejectReasonMember, String rejectReason, String rejectDate) {
		approvalMapper.addRejectReason(approvalProcessNum, rejectReasonMember, rejectReason, rejectDate);
	}
	
	public List<Approval> rejectList(){
		return approvalMapper.rejectList();
	}
	public void addDraftInsert(Approval approval) {
		String draftDocNum = approvalMapper.getCommonNewCode("tb_draft_document", "draft_doc_num");
		approval.setDraftDocNum(draftDocNum);
		approvalMapper.addDraftInsert(approval);
	}
}
