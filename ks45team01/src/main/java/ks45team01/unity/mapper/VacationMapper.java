package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;

@Mapper
public interface VacationMapper {
	
	//휴가대분류 목록 조회
	public List<VacationCategory> getVacationCategory();
	
	//휴가중분류 목록 조회
	public List<VacationSort> getVacationSort();
	
	//휴가종류 목록
	public List<VacationType> getVacationType();
	
	//휴가기준 목록
	public List<VacationStandard> getVacationStandard();
}
