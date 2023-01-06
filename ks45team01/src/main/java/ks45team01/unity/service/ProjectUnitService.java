package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ks45team01.unity.dto.ProjectUnit;
import ks45team01.unity.mapper.ProjectUnitMapper;

@Service
public class ProjectUnitService {

	
	private final ProjectUnitMapper projectUnitMapper;
	public ProjectUnitService(ProjectUnitMapper projectUnitMapper) {
		this.projectUnitMapper = projectUnitMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<ProjectUnit> projectUnitList(){
		
		List<ProjectUnit> projectUnit = projectUnitMapper.projectUnitList();
		
		return projectUnit;
	}
	
	
}
