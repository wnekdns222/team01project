package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.mapper.MemberListMapper;


@Service
public class MemberModifyService {

	/*
	 * private final FileMapper fileMapper; public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */

	private final MemberListMapper memberListMapper;

	public MemberModifyService(MemberListMapper memberListMapper) {
		this.memberListMapper = memberListMapper;
	}

	//직급리스트 부서리스트 멤버리스트 조인
	public List<MemberList> memberModifyList() {

		Map<String, Object> paramMap = new HashMap<String, Object>();

		List<MemberList> memberModifyList = memberListMapper.memberModifyList(paramMap);
		return memberModifyList;
	}

	
	//부서 리스트 표시
	public List<MemberDepartmentList> memberModifyDepartmentList() {

		List<MemberDepartmentList> memberModifyDepartmentList = memberListMapper.memberModifyDepartmentList();
		return memberModifyDepartmentList;
	}
	
	// 직급 리스트 표시
	public List<MemberPositionList> memberModifyPositionList() {
		
		List<MemberPositionList>  memberModifyPositionList = memberListMapper.MemberModifyPositionList();
		
		return memberModifyPositionList;
	}

}
