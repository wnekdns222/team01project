package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectBoard;
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
	
	
}
