package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationInformation;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;
import ks45team01.unity.mapper.VacationMapper;

@Service
@Transactional
public class VacationService {

	
	private static final Logger log = LoggerFactory.getLogger(VacationService.class);

	
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
	/**
	 * 휴가 대분류 비동기 수정
	 */
	public void updateVacationCategoryA(String vacationCategoryNum, String vacationUse) {
		
		vacationMapper.updateVacationCategoryA();
	}
	/**
	 * 휴가 중분류 비동기 수정
	 */
	public void updateVacationSortA(String vacationSortNum, String vacationUse) {
		
		vacationMapper.updateVacationSortA();
	}
	/**
	 * 휴가 종류 비동기 수정
	 */
	public void updateVacationTypeA(String vacationTypeNum, String vacationUse) {
		
		vacationMapper.updateVacationTypeA();
	}
	/**
	 * 휴가 기준 비동기 수정
	 */
	public void updateVacationStandardA(String vacationStandardNum, String vacationStandardUse) {
		
		vacationMapper.updateVacationStandardA();
	}
	/**
	 * 휴가 종류 등록
	 * 
	 */
	public void addVacationType(VacationType vacationType) {
		
		String vacationTypeNum =vacationMapper.getCommonNewCode("tb_vacation_type", "vacation_type_num");
		vacationType.setVacationTypeNum(vacationTypeNum);
		vacationMapper.addVacationType(vacationType);
		
	}
	/**
	 * 특정 휴가 종류 조회
	 * 
	 */
	public VacationType getVacationTypeByNum(String vacationTypeNum) {
			VacationType vacationType = vacationMapper.getVacationTypeByNum(vacationTypeNum);
			
		return vacationType;
	}
	/**
	 * 특정 휴가 종류 수정
	 * 
	 */
	public void updateVacationType(VacationType vacationType) {
		vacationMapper.updateVacationType(vacationType);
	
	}
	/**
	 * 휴가 대분류 입력 처리
	 */
	public void addVacationCategory(VacationCategory vacationCategory) {
		String vacationCategoryNum = vacationMapper.getCommonNewCode("tb_vacation_category", "vacation_category_num");
		vacationCategory.setVacationCategoryNum(vacationCategoryNum);
		vacationMapper.addVacationCategory(vacationCategory);
	}
	/**
	 * 특정 휴가 대분류 수정 
	 * 
	 */
	public VacationCategory getVacationCategoryByNum(String vacationCategoryNum) {
		VacationCategory vacationCategory = vacationMapper.getVacationCategoryByNum(vacationCategoryNum);
		return vacationCategory;
	}
	/**
	 * 특정 휴가 대분류 수정 처리
	 * 
	 */
	public void updateVacationCategory(VacationCategory vacationCategory) {
		vacationMapper.updateVacationCategory(vacationCategory);
	}
	/**
	 * 휴가 중분류 입력 처리
	 */
	public void addVacationSort(VacationSort vacationSort) {
		String vacationSortNum = vacationMapper.getCommonNewCode("tb_vacation_sort", "vacation_sort_num");
		vacationSort.setVacationSortNum(vacationSortNum);
		vacationMapper.addVacationSort(vacationSort);
	}
	/**
	 * 특정 휴가 중분류 조회
	 */
	public VacationSort getVacationSortByNum(String vacationSortNum) {
		
		VacationSort vacationSort = vacationMapper.getVacationSortByNum(vacationSortNum);
		
		return vacationSort;
	}
	/**
	 * 특정 휴가 중분류 수정
	 */
	public void updateVacationSort(VacationSort vacationSort) {
		vacationMapper.updateVacationSort(vacationSort);
	}
	/**
	 * 근속연수에 따른 사원이름 조회
	 */
	public List<MemberList> getMemberNameByLength(String length) {
		List<MemberList> memberNameList = vacationMapper.getMemberNameByLength(length);
		return memberNameList;
	}
	/**
	 * 휴가 정보 등록
	 */
	public void addVacationInfo(VacationInformation vacationInformation) {
		
		String vacationInfoNum = vacationMapper.getCommonNewCode("tb_vacation_information", "vacation_info_num");	
		log.info("휴가입력 pk:{}",vacationInfoNum);
		vacationInformation.setVacationInfoNum(vacationInfoNum);
		VacationStandard vacationStandard  = vacationMapper.getVacationStandardByLength(vacationInformation.getLengthOfService());
		vacationInformation.setServiceNum(vacationStandard.getServiceNum());
		vacationMapper.addVacationInfo(vacationInformation);
	}
}	

