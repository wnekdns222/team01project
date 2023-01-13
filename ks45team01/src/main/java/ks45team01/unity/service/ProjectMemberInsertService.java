package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectList;
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
	
public Map<String, Object> getMemberList(int currentPage) {
		
		//페이지당 보여질 행의 갯수(rowPerPage)
		int rowPerPage = 10;
		
		// 로그인이력 테이블의 보여질 행의 시작점
		int startRowNum = (currentPage -1)*rowPerPage;

		//마지막페이지
		//1.로그인이력 테이블의 전체 행의 갯수
		double rowCnt = projectListMapper.getMemberListCnt();
		//2.마지막 페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		//로그인 이력 조회시 Limit 인수 파라미터 셋팅
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRowNum", startRowNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		//로그인 이력 data
		List<MemberList> loginHistory = projectListMapper.memberList(paramMap);
		
		//보여질 페이지 번호 구현
		//보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = 10;
		
		//동적 페이지 번호 구현
		//페이지 번호 (동적) 10페이지 미만일 경우 처리
		if(currentPage > 6 && lastPage > 9) {
			startPageNum = currentPage -5;
			endPageNum = currentPage +4;
			if(endPageNum >= lastPage) {
				startPageNum = currentPage -9;
				endPageNum = lastPage;
			}
		}
		//라스트페이지가 10보다 작으면 엔드페이지이다..
		endPageNum = lastPage < 10 ? lastPage : endPageNum;
		//controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("loginHistory", loginHistory);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		return paramMap;
	}
	
	
	
	
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

	
	
}
