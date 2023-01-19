package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 * 근태유형 조회,페이징
	 * @return workTypeList
	 */
	public Map<String, Object> getAllWorkType(int currentPage, String searchKey, String searchValue){
		
		//페이지당 보여질 행의 갯수(rowPerPage)
		int rowPerPage = 10;
		
		//로그인이력 테이블의 보여질 행의 시작점
		int startRowNum = (currentPage -1)*rowPerPage;
		
		//마지막페이지
		//1.근태유형 테이블의 전체 행의 개수
		double rowCnt = workTypeMapper.countAllWorkType();
		
		//2.마지막 페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = 10;
		
		//동적 페이지 번호 구현
		// 페이지번호 10페이지미만일 경우 처리
        if(currentPage > 6 && lastPage > 9){
        	startPageNum = currentPage - 5;
        	endPageNum = currentPage + 4;
            if(endPageNum >= lastPage){
            	startPageNum = lastPage - 9;
                endPageNum = lastPage;
            }
        }
		if(searchKey != null) {
			switch (searchKey) {
				case "memberName" : {
					searchKey = "m.member_name";
					break;
				}
				case "workDate" : {
					searchKey = "t.work_date";
					break;
				}
				case "workName" : {
					searchKey = "t.work_name";
					break;
				}
			}
		}
		//근태 유형 조회시 Limit 인수 파라미터 셋팅
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRowNum", startRowNum);
		paramMap.put("rowPerPage", rowPerPage);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchKey", searchKey);
		//근태유형 조회 data
		List<WorkType> workType = workTypeMapper.getAllWorkType(paramMap);
		
		//controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("workType", workType);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		return paramMap;
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
