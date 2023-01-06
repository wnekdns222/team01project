package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.mapper.MemberDepartmentListMapper;


@Service
public class MemberDepartmentListService {
	
	private final MemberDepartmentListMapper memberDepartmentListMapper;
	public MemberDepartmentListService(MemberDepartmentListMapper memberDepartmentListMapper) {
		this.memberDepartmentListMapper = memberDepartmentListMapper;
	}
	
	
	public List<MemberDepartmentList> memberDepartmentList() {
		
		List<MemberDepartmentList> memberDepartmentList = memberDepartmentListMapper.memberDepartmentList();
		
		return memberDepartmentList;
	}

}
