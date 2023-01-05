package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.DepartmentManage;



@Mapper
public interface DepartmentManageMapper {
	
	//직급 사원 목록 관리
	List<DepartmentManage> departmentManageSe();
}
