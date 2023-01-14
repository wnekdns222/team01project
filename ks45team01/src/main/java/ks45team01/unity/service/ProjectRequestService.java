package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class ProjectRequestService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final ProjectListMapper projectListMapper;
	public ProjectRequestService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectRequest> projectRequestList(){
		
		List<ProjectRequest> ProjectRequestList = projectListMapper.projectRequestList();
		
		return ProjectRequestList;
	}
	
	
}
