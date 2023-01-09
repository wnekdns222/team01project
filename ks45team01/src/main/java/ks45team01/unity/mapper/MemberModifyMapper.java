package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


import ks45team01.unity.dto.MemberList;


@Mapper
public interface MemberModifyMapper {
	
	//회원조회
	List<MemberList> memberModifyList(Map<String, Object> paramMap);
	
	

}
