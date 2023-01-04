package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ks45team01.unity.dto.MemberDepartmentList;

@Mapper
public interface MemberDepartmentListMapper {

	
	// 부서사용 목록
	List<MemberDepartmentList> memberDepartmentList();
}
