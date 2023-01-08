package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.mapper.ProjectRequestMapper;

@Service
public class ProjectRequestService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final ProjectRequestMapper projectRequestMapper;
	public ProjectRequestService(ProjectRequestMapper projectRequestMapper) {
		this.projectRequestMapper = projectRequestMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectRequest> projectRequestList(){
		
		List<ProjectRequest> ProjectRequestList = projectRequestMapper.projectRequestList();
		
		return ProjectRequestList;
	}
	
	
}
