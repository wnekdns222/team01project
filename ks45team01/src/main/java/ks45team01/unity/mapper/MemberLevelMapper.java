package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberLevel;


@Mapper
public interface MemberLevelMapper {

	// 회원 권한 조회
	List<MemberLevel> memberLevelList();
}
