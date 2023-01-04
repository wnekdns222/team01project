package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;
import ks45team01.unity.mapper.VacationMapper;

@Service
public class VacationService {

	
	private final VacationMapper vacationMapper;
	public VacationService(VacationMapper vacationMapper) {
		this.vacationMapper = vacationMapper;
	}
	/**
	 *  휴가대분류 목록 조회
	 */
	public Map<String, Object> getVacationVariety(){
		
		Map<String, Object> variety = new HashMap();
		
		List<VacationCategory> category = vacationMapper.getVacationCategory();
		List<VacationSort> sort = vacationMapper.getVacationSort();
		List<VacationType> type = vacationMapper.getVacationType();
		List<VacationStandard> standard = vacationMapper.getVacationStandard();
		
		variety.put("category", category);
		variety.put("sort", sort);
		variety.put("type", type);
		variety.put("standard", standard);
		return variety;
	}
	
	
}
