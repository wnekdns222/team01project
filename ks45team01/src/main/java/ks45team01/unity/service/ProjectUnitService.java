package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ks45team01.unity.dto.ProjectUnit;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class ProjectUnitService {

	
	private final ProjectListMapper projectListMapper;
	public ProjectUnitService(ProjectListMapper projectListMapper) {
		this.projectListMapper = projectListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectUnit> projectUnitList(){
		
		List<ProjectUnit> projectUnit = projectListMapper.projectUnitList();
		
		return projectUnit;
	}
	
	
}
