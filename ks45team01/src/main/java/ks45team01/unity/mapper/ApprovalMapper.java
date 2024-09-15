package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Approval;
import ks45team01.unity.dto.ApprovalLine;
import ks45team01.unity.dto.VacationApproval;
import ks45team01.unity.dto.WorkCorrectApproval;

@Mapper
public interface ApprovalMapper {
	
	// 기안 문서 목록 조회
	List<Approval> draftList(String registrantNum);
	
	// 기안 문서 상세보기
	Approval draftView(String draftDocNum);
	
	// 결재 진행 목록 조회
	List<Approval> approvalList();
	
	// 결재 완료 목록 조회
	List<Approval> approvalDoneList();
	
	// 반려사유 등록
	void addRejectReason(String draftDocNum, String approvalProcessNum, String rejectReasonMember, String rejectReason, String rejectDate);
	
	// 반려함 목록 조회
	List<Approval> rejectList();
	
	// 결재자 추가
	void addApprovalMember(List<ApprovalLine> approvalLineList);
	
	// 기안 작성
	void addDraftInsert(Approval approval);
	
	// 자동증가 코드
	String getCommonNewCode(String table, String column);
	
	// 반려 문서 상세보기
	Approval rejectView(String draftDocNum);
	
	// 결재 완료 처리
	int approvalDoneProcess(String approvalProcessNum, String draftDocNum);
	
	// 기안 문서 반려처리
	int rejectProcess(String approvalFinalState, String draftDocNum);
	
	// 결재 상태 승인 등록
	void approvalApprove(String draftDocNum, String processStatus);
	
	//연차신청서 등록
	void addVacationApproval(VacationApproval vacationApproval);
	
	//근태정정신청서 등록
	void addWorkCorrectApproval(WorkCorrectApproval workCorrectApproval);
}
