package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.mapper.ProjectBoardMapper;
@Service
public class ProjectBoardService {



	
	private final ProjectBoardMapper projectBoardMapper;
	public ProjectBoardService(ProjectBoardMapper projectBoardMapper) {
		this.projectBoardMapper = projectBoardMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectBoard> projectBoardList(){
		
		List<ProjectBoard> projectBoard = projectBoardMapper.projectBoardList();
		
		return projectBoard;
	}
	
	
}
