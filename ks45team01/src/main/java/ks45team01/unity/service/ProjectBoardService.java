package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectBoard;
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
}
