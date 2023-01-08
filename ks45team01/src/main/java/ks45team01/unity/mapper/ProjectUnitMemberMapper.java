package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ks45team01.unity.dto.ProjectUnitMember;


@Mapper
public interface ProjectUnitMemberMapper {
	
	// 회원 멤버전체 조회
	List<ProjectUnitMember> projectUnitMemberList(); 
}
