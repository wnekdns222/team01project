package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.MemberPositionList;


@Mapper
public interface MemberModifyMapper {
	
	//회원조회
	List<MemberList> memberModifyList(Map<String, Object> paramMap);
	
	//부서조회
	List<MemberDepartmentList>  memberModifyDepartmentList();
	
	//직급 조회
		List<MemberPositionList>  MemberModifyPositionList();
	

}
