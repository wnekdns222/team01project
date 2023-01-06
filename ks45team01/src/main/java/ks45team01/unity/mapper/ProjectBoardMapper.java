package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ks45team01.unity.dto.ProjectBoard;


@Mapper
public interface ProjectBoardMapper {
	
	// 회원 멤버전체 조회
	List<ProjectBoard> projectBoardList();
}
