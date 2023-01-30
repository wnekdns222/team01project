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
	
	//비정상 근태 등록
	public void addWorkUnusual(WorkUnusual workUnusual);
	
	//특정 workNum 조회
	public String getWorkNum(String memberNum, String attendanceDay);
	
	//특정 workUnusual 조회
	public WorkUnusual getUnusualWorkByNum(String workNum);
	
	//퇴근시간 저장값 조회
	public int getLeaveWorkTime(String workDate, String memberNum);
	
	//외출시간 저장값 조회
	public int getGoOut(String memberNum, String workDate);
	
	//복귀시간 저장값 조회
	public int getComeback(String memberNum, String workDate);
	
	//근태정정 신청서 입력시 수정
	public void updateWorkUnusual(String workNum);
}
