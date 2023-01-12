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
	
	public List<Approval> draftList(){
		return approvalMapper.draftList();
	}
}
