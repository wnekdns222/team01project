package ks45team01.unity.service;

import java.util.List;


import org.springframework.stereotype.Service;

import ks45team01.unity.dto.WorkType;
import ks45team01.unity.mapper.WorkTypeMapper;

@Service
public class WorkTypeService {
	
	

	private final WorkTypeMapper workTypeMapper;
	
	public WorkTypeService(WorkTypeMapper workTypeMapper){
		this.workTypeMapper = workTypeMapper;
	}
	
	/**
	 * 근태유형 조회
	 * @return workTypeList
	 */
	public List<WorkType> getAllWorkType(){
		
		
		List<WorkType> workTypeList = workTypeMapper.getAllWorkType();
		
		return workTypeList;
	}
	
	/**
	 * 근태유형 입력
	 * @param workType
	 */
	public void addWorkType(WorkType workType){
		workTypeMapper.addWorkType(workType);
		
	}
	
	/**
	 * 근태유형 번호로 조회
	 * return 
	 */
	public WorkType getWorkTypeById(String workTypeNum) {
		
		WorkType workType = workTypeMapper.getWorkTypeById(workTypeNum);
		
		return workType;
	}
	
	/**
	 * 근태 유형 수정
	 * 
	 */
	public void updateWorkType(WorkType workType) {
		workTypeMapper.updateWorkType(workType);
	}
}
