package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectMember;
import ks45team01.unity.mapper.ProjectMemberInsertMapper;

@Service
public class ProjectMemberInsertService {


	
	private final ProjectMemberInsertMapper projectMemberInsertMapper;
	public ProjectMemberInsertService(ProjectMemberInsertMapper projectMemberInsertMapper) {
		this.projectMemberInsertMapper = projectMemberInsertMapper;
	}
	
	

	public List<ProjectMember> projectMemberList() {

		List<ProjectMember> projectMemberList = projectMemberInsertMapper.projectMemberList();

		return projectMemberList;
	}

	public List<MemberDepartmentList> memberDepartmentList() {

		List<MemberDepartmentList> memberDepartmentList = projectMemberInsertMapper.memberDepartmentList();

		return memberDepartmentList;
	}
	
	public List<MemberList> memberList() {

		List<MemberList> memberList = projectMemberInsertMapper.memberList();

		return memberList;
	}
	
}
