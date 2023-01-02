package ks45team01.unity.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.WorkType;

@Mapper
public interface WorkTypeMapper {

	
	//근무유형 조회
	public List<WorkType> getAllWorkType();
	
	//근무유형 입력
	public void addWorkType(WorkType workType);
	
	//근무유형 번호로 조회
	public WorkType getWorkTypeById(String workTypeNum);
	
	//근무유형 수정
	public void updateWorkType(WorkType workType);
	
}
