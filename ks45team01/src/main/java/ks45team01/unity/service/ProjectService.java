package ks45team01.unity.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.dto.ProjectComment;
import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.dto.ProjectListPost;
import ks45team01.unity.dto.ProjectMember;
import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.dto.ProjectUnit;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class ProjectService {


	
	private final ProjectListMapper projectListMapper;
	public ProjectService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	
	//ProjectMemberInsertService
			//프로젝트 
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
	
			
			
			//projectListSERVICE
			
			public List<ProjectBoard> projectBoardList(String projectNum){
				
				List<ProjectBoard> projectBoard = projectListMapper.projectBoardList(projectNum);
				
				return projectBoard;
			}
			
			//프로젝트 내부 단위업무랑 게시판 합쳐서 표시하는것
			public List<ProjectListPost> projectListPostList(String projectNum){
				List<ProjectListPost> projectListPostList = projectListMapper.projectListPostList(projectNum);
				return projectListPostList;
			}
			
			//프로젝트 게시글 등록
			public void projectBoardInsert(ProjectBoard projectBoard) {
				String projectBoardNum = projectListMapper.projectBoardCode("tb_project_board","project_board_num");
				projectBoard.setProjectBoardNum(projectBoardNum);
				projectListMapper.projectBoardInsert(projectBoard);
				
			
			}

			//댓글 등록 및 자동증가 코드
			public void projectCommentInsert(ProjectComment ProjectComment) {

				String projectCommentNum = projectListMapper.projectCommentCode("tb_project_comment", "project_comment_num");
				ProjectComment.setProjectCommentNum(projectCommentNum);
				projectListMapper.projectCommentInsert(ProjectComment);

			}
			
			//댓글 삭제
			public int projectCommentDelete(String projectCommentNum) {
				int projectCommentDelete = projectListMapper.projectCommentDelete(projectCommentNum);
				
				return projectCommentDelete;
			}
			
			//프로젝트 1개 조회값
			public ProjectBoard projectBoardOne(String projectBoardNum) {
				ProjectBoard projectBoardOne= projectListMapper.projectBoardOne(projectBoardNum);
				
				return projectBoardOne;
			}
			
			//프로젝트 게시글 수정
			public int projectboardUpdate(String projectBoardTitle,String projectBoardContent ,String projectBoardNum, String memberNum) {
				int projectboardUpdate = projectListMapper.projectboardUpdate(projectBoardTitle, projectBoardContent, projectBoardNum ,memberNum);
				
				return projectboardUpdate;
			}



//projectRequestService
			
			public List<ProjectRequest> projectRequestList(String projectNum){
				
				List<ProjectRequest> ProjectRequestList = projectListMapper.projectRequestList(projectNum);
				
				return ProjectRequestList;
			}
			
			
//projectListService
			public List<ProjectList> projectListSe(){
				
				List<ProjectList> projectList = projectListMapper.projectListSe();
				
				return projectList;
			}
			
			
			//프로젝트 등록
			public void ProjectInsert(ProjectList projectList) {
				String projectNumcode = projectListMapper.projectCode("tb_project", "project_num");
				projectList.setProjectNum(projectNumcode);
				projectListMapper.ProjectInsert(projectList);
				
			}
			
			
			//Project join projectUnit
			
			
			public List<ProjectUnit> ProjectUnit() {
				
				List<ProjectUnit> ProjectUnit = projectListMapper.ProjectUnit();
				
				return ProjectUnit;
			}
			
			//프로젝트 1개 조회
			public ProjectList ProjectListOne(String projectNum) {
				
				ProjectList projectListOne = projectListMapper.ProjectListOne(projectNum);
				
				return projectListOne;
			}
			

			
//projectUnitService
			public List<ProjectUnit> projectUnitList(){
				
				List<ProjectUnit> projectUnit = projectListMapper.projectUnitList();
				
				return projectUnit;
			}
			

}
