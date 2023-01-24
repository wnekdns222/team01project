package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.WorkType;

@Mapper
public interface WorkTypeMapper {

	
	//근무유형 조회
	public List<WorkType> getAllWorkType(Map<String,Object>	 paramMap);
	
	//근태유형 테이블 전체 행의 개수
	public int countAllWorkType();
	
	//근무유형 입력
	public void addWorkType(WorkType workType);
	
	//근무유형 번호로 조회
	public WorkType getWorkTypeById(String workTypeNum);
	
	//근무유형 수정
	public void updateWorkType(WorkType workType);
	
	//근무유형 근무일,사원번호로 조회
	public String getWorkTypeNum(String workDate, String memberNum);
}
