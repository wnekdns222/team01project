package ks45team01.unity.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectMember;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class ProjectMemberInsertService {


	
	private final ProjectListMapper projectListMapper;
	public ProjectMemberInsertService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	

	public List<ProjectMember> projectMemberList(String projectNum) {

		List<ProjectMember> projectMemberList = projectListMapper.projectMemberList(projectNum);

		return projectMemberList;
	}

	public List<MemberDepartmentList> memberDepartmentList() {

		List<MemberDepartmentList> memberDepartmentList = projectListMapper.memberDepartmentList();

		return memberDepartmentList;
	}
	
	public List<MemberList> memberList(Map<String, Object> paramMap) {

		List<MemberList> memberList = projectListMapper.memberList(paramMap);


		
		return memberList;
	}
	

	
	
	
	//프로젝트 멤버 등록
	public void ProjectMemberInsert(ProjectMember projectMember) {
		
		String projectJoinNum = projectListMapper.getCommonNewCode("tb_project_member", "project_join_num");
		projectMember.setProjectJoinNum(projectJoinNum);
		projectListMapper.ProjectMemberInsert(projectMember);
		
		
	}
	
	
	//프로젝트 등록 회원 카운트 조회
			public int ProjectmemberCnt(String projectnum) {
				int projectMemberCnt = projectListMapper.ProjectmemberCnt(projectnum);
				
				return projectMemberCnt;
			}

	
	//프로젝트 맴버 카운트 조회값 업데이트
			public int projectMemberCntUpdate(String projectNum) {
				int projectMemberCntUpdate = projectListMapper.projectMemberCntUpdate(projectNum);
				
				return projectMemberCntUpdate;
			}
	
	//프로젝트 멤버 삭제 
			public int projectMemberDelete(String projectJoinNum) {
				int  projectMemberDelete = projectListMapper.projectMemberDelete(projectJoinNum);
				
				return projectMemberDelete;
			}
			
	
			
	//프로젝트 아이디 조회 카운트
			public int projectIdCnt (String memberNum,String projectNum) {
				int projectIdCnt = projectListMapper.projectIdCnt(memberNum, projectNum);
				
				return projectIdCnt;
			}
	
}
