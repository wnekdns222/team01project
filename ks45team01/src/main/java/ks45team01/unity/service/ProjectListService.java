package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class ProjectListService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final ProjectListMapper projectListMapper;
	public ProjectListService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectList> projectListSe(){
		
		List<ProjectList> projectList = projectListMapper.projectListSe();
		
		return projectList;
	}
	
	
}
