package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.dto.MemberList;


@Mapper
public interface MemberListMapper {
	
	// 회원 멤버전체 조회
	List<MemberList> memberListSe();
}
