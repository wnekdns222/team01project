package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkUnusual;

@Mapper
public interface WorkMapper {

	//자동증가코드
	public String getCommonNewCode(String table, String column);
	
	//출근상태 등록
	public String getAttendanceStatus(String workTypeNum, String attendanceTime);
	
	//근태등록
	public void addWork(Work work);
	
	//전사원 근태조회
	public List<Work> getAllWorkInfo();
	
	//비정상 근태 등록 조회
	public List<WorkUnusual> getAuthorityWorkInfo();
	
	//특정사원 근태 조회
	public Work getWorkByNum(String memberNum, String attendanceDay);
	
	//퇴근 상태 등록
	public String getLeaveStatus(String workTypeNum, String leaveTime); 
	
	//퇴근 등록(수정)
	public void updateWorkLeaveTime(Work work);
	
	//외출 등록(수정)
	public void updateGoOut(Work work);
	
	//외출 복귀 등록(수정)
	public void updateComeBack(Work work);
	
	//특정사원 근태 조회
	public List<Work> getWorkInfoById(String memberNum);
	
	//특정부서 사원 근태 조회
	public List<Work> getWorkInfoByDepart(String departmentNum);
}
