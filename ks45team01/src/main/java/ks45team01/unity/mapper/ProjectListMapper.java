package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.dto.ProjectUnit;

@Mapper
public interface ProjectListMapper {
	
	// 프로젝트 리스트
	List<ProjectList> projectListSe();

	//Project join projectUnit
	List<ProjectUnit> ProjectUnit();
	
	//프로젝트 한개 조회값
	ProjectList ProjectListOne(String projectNum);
}
