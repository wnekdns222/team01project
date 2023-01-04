package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.ProjectList;

@Mapper
public interface ProjectListMapper {
	
	// 마케팅 파일 목록
	List<ProjectList> projectListSe();
}
