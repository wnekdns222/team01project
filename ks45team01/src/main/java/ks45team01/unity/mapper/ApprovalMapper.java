package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Approval;

@Mapper
public interface ApprovalMapper {
	
	// 기안 문서 목록 조회
	List<Approval> draftList();
	
	// 기안 문서 상세보기
	Approval draftView(String draftDocNum);
	
	// 결재 진행 목록 조회
	List<Approval> approvalList();
	
	// 결재 완료 목록 조회
	List<Approval> approvalDoneList();
	
	// 반려사유 등록
	void addRejectReason(String approvalProcessNum, String rejectReasonMember, String rejectReason, String rejectDate);
	
	// 반려함 목록 조회
	List<Approval> rejectList();
	
	// 결재자 추가
	void addApprovalMember(Approval approval);
	
	// 기안 작성
	void addDraftInsert(Approval approval);
	
	// 자동증가 코드
	String getCommonNewCode(String table, String column);
}
