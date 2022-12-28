package ks45team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ks45team01.dto.WorkType;

@Mapper
public interface WorkTypeMapper {

	
	//근무유형 조회
	public List<WorkType> getAllWorkType();
}
