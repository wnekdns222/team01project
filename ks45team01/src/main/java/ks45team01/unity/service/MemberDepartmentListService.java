package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.mapper.MemberListMapper;


@Service
public class MemberDepartmentListService {
	
	private final MemberListMapper memberListMapper;
	public MemberDepartmentListService(MemberListMapper memberListMapper) {
		this.memberListMapper = memberListMapper;
	}
	
	
	public List<MemberDepartmentList> memberDepartmentList() {
		
		List<MemberDepartmentList> memberDepartmentList = memberListMapper.memberDepartmentList();
		
		return memberDepartmentList;
	}

}
