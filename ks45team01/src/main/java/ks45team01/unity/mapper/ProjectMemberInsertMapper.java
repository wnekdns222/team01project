package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectMember;

@Mapper
public interface ProjectMemberInsertMapper {
	
	//인원배정리스트 등록
	void ProjectMemberInsert(ProjectMember projectMember); 
	
	// 인원배정리스트 조인 멤버 조인
	List<ProjectMember> projectMemberList();

	//부서명 리스트
	List<MemberDepartmentList> memberDepartmentList();
	
	//부서별 사람 리스트 department_list 멤버 조인
	List<MemberList> memberList();
	
	//자동증가 코드
	String getCommonNewCode (String table,String column);
}

