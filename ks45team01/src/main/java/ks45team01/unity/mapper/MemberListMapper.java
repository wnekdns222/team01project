package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberList;


@Mapper
public interface MemberListMapper {
	
	//회원조회
	List<MemberList> memberListSe(Map<String, Object> paramMap);
	
	//회원 전체 갯수 조회
	int getMemberListCnt();
	
	
	// 서식글 상세보기
	MemberList memberlistOne(String memberNum);
	
}
