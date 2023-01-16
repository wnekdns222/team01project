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
}
