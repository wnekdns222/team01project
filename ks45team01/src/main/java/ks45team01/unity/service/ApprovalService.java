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
	
	public List<Approval> approvalList(){
		return approvalMapper.approvalList();
	}
}
