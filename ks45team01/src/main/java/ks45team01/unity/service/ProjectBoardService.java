package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.dto.ProjectComment;
import ks45team01.unity.dto.ProjectListPost;
import ks45team01.unity.mapper.ProjectListMapper;
@Service
public class ProjectBoardService {



	
	private final ProjectListMapper projectListMapper;
	public ProjectBoardService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectBoard> projectBoardList(String projectNum){
		
		List<ProjectBoard> projectBoard = projectListMapper.projectBoardList(projectNum);
		
		return projectBoard;
	}
	
	
	public List<ProjectListPost> projectListPostList(String projectNum){
		List<ProjectListPost> projectListPostList = projectListMapper.projectListPostList(projectNum);
		return projectListPostList;
	}
	
	
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
}
