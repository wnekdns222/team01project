package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.VacationApproval;
import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationInformation;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;

@Mapper
public interface VacationMapper {
	
	//자동코드 생성
	public String getCommonNewCode(String table, String column);
	
	//휴가대분류 목록 조회
	public List<VacationCategory> getVacationCategory();
	
	//휴가중분류 목록 조회
	public List<VacationSort> getVacationSort();
	
	//휴가종류 목록
	public List<VacationType> getVacationType();
	
	//휴가기준 목록
	public List<VacationStandard> getVacationStandard();
	
	//휴가 종류 등록
	public void addVacationType(VacationType vacationType);
	
	//특정 휴가 종류 조회
	public VacationType getVacationTypeByNum(String vacationTypeNum);
	
	//특정 휴가 종류 수정
	public void updateVacationType(VacationType vacationType);
	
	//휴가 대분류 입력
	public void addVacationCategory(VacationCategory vacationCategory);
	
	//휴가 대분류 특정 조회
	public VacationCategory getVacationCategoryByNum(String vacationCategoryNum);
	
	//휴가 대분류 수정
	public void updateVacationCategory(VacationCategory vacationCategory);
	
	//휴가 중분류 입력
	public void addVacationSort(VacationSort vacationSort);
	
	//특정 휴가 중분류 조회
	public VacationSort getVacationSortByNum(String vacationSortNum);
	
	//휴가 중분류 수정
	public void updateVacationSort(VacationSort vacationSort);
	
	//근속연수에 따른 사원이름 조회
	public List<MemberList> getMemberNameByLength(String lenth);
	
	//연차 등록
	public void addVacationInfo(VacationInformation vacationInformation);
	
	//총연차 등록
	public void updateRemainVacation(String vacationInfoNum);
	
	//특정 휴가기준 조회
	public VacationStandard getVacationStandardByLength(String lengthOfService);
	
	//전사원 휴가 정보 조회
	public List<VacationInformation> getVacationInfoAll();
	
	//사원 이름 조회
	public List<MemberList> getMemberList();
	
	//특정 사원 휴가 정보 조회
	public String getVacationInfoByNameAndYear(VacationInformation vacationInformation);
	
	//기타 휴가 등록
	public void updateVacationInfo(VacationInformation vacationInformation);
	
	//휴가 기준 등록
	public void addVacationStandard(VacationStandard vacationStandard);
	
	//특정 휴가 기준 조회
	public VacationStandard getVacationStandardByServiceNum(String serviceNum);
	
	//특정 휴가 기준 수정
	public void updateVacationStandard(VacationStandard vacationStandard);
	
	//특정 휴가 조회 
	public List<VacationInformation> getVacationInfoByInfoNum(String memberNum); 
	
	//특정 휴가 사용 조회
	public List<VacationApproval> getVacationApprovalBymemberNum(String memberNum);
	
	//특정 부서 휴가 사용 조회
	public List<VacationApproval> getVacationApprovalByDepart(String departmentNum);
	
}
