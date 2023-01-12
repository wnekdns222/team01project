package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.dto.ProjectMember;
import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.dto.ProjectUnit;
import ks45team01.unity.dto.ProjectUnitMember;

@Mapper
public interface ProjectListMapper {
	
	// 프로젝트 리스트
	List<ProjectList> projectListSe();

	//Project join projectUnit
	List<ProjectUnit> ProjectUnit();
	
	//프로젝트 한개 조회값
	ProjectList ProjectListOne(String projectNum);
	
	//projectBoard
	// 회원 멤버전체 조회
	List<ProjectBoard> projectBoardList();
	
	
	//projectMemberInsert
	//인원배정리스트 등록
		void ProjectMemberInsert(ProjectMember projectMember); 
		
		
		//프로젝트 인원 전체 갯수 조회
		int getMemberListCnt();
		
		// 인원배정리스트 조인 멤버 조인
		List<ProjectMember> projectMemberList();

		//부서별 사람 리스트 department_list 멤버 조인
		List<MemberList> memberList(Map<String, Object> paramMap);
		
		//부서명 리스트
		List<MemberDepartmentList> memberDepartmentList();
		
		//자동증가 코드
		String getCommonNewCode (String table,String column);
		
		
		//projectList
		// 프로젝트리퀘스트
		List<ProjectRequest> projectRequestList();
		
		
		//projectUnit
		// 회원 멤버전체 조회
		List<ProjectUnit> projectUnitList(); 
		
		//projectUnitMember 왜 오류가 안나지?? 아직 안쓰인 코드인가?
		// 회원 멤버전체 조회
		List<ProjectUnitMember> projectUnitMemberList(); 
}

