package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkUnusual;
import ks45team01.unity.mapper.WorkMapper;

@Service
public class WorkService {

	private final WorkMapper workMapper;
	
	public WorkService(WorkMapper workMapper) {
		this.workMapper = workMapper;
	}
	/**
	 * 자동증가코드
	 * return newCode;
	 */
	public String getCommonNewCode(String table, String column) {
		String newCode = workMapper.getCommonNewCode(table, column);
		
		return newCode;
	}
	
	/**
	 * 근태등록
	 */
	public void addWork(Work work) {
		workMapper.addWork(work);
	}
	
	/**
	 * 전사원 근태조회
	 * return workInfoList;
	 */
	
	public List<Work> getAllWorkInfo(){
		
		List<Work> workInfoList = workMapper.getAllWorkInfo();
		return workInfoList;
	}
	
	/**
	 * 비정상 근태 등록 조회
	 */
	public List<WorkUnusual> getAuthorityWorkInfo(){
		
		List<WorkUnusual> unusualList = workMapper.getAuthorityWorkInfo(); 
		return unusualList;
	}
}
