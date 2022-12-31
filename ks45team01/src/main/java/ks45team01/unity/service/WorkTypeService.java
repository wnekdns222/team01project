package ks45team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team01.dto.WorkType;
import ks45team01.mapper.WorkTypeMapper;

@Service
public class WorkTypeService {
	
	
	private static final Logger log = LoggerFactory.getLogger(WorkTypeService.class);

	private final WorkTypeMapper workTypeMapper;
	
	public WorkTypeService(WorkTypeMapper workTypeMapper){
		this.workTypeMapper = workTypeMapper;
	}
	public List<WorkType> getAllWorkType(){
		
		
		List<WorkType> workTypeList = workTypeMapper.getAllWorkType();
		log.info("근무유형 조회: {}", workTypeList);
		
		return workTypeList;
	}
}
