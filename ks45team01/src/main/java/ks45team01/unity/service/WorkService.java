package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkUnusual;
import ks45team01.unity.mapper.WorkMapper;
import ks45team01.unity.mapper.WorkTypeMapper;

@Service
public class WorkService {

	private final WorkMapper workMapper;
	private final WorkTypeMapper workTypeMapper;
	
	public WorkService(WorkMapper workMapper, WorkTypeMapper workTypeMapper) {
		this.workMapper = workMapper;
		this.workTypeMapper = workTypeMapper;
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
	public Work addWork(Work work) {
		String workDate = work.getAttendanceDay();
		String memberNum = work.getMemberNum();
		String attendanceTime = work.getAttendanceTime();
		String workTypeNum = workTypeMapper.getWorkTypeNum(workDate,memberNum);
		work.setWorkTypeNum(workTypeNum);
		String attendanceStatus = workMapper.getAttendanceStatus(workTypeNum,attendanceTime);
		work.setAttendanceStatus(attendanceStatus);
		String workNum = workMapper.getCommonNewCode("tb_work", "work_num");
		work.setWorkNum(workNum);
		workMapper.addWork(work);
		Work workInfo = workMapper.getWorkByNum(memberNum, workDate);
		return workInfo;
	}
	/**
	 * 근태수정(퇴근)
	 */
	public Work updateLeaveWork(Work work) {
		String workDate = work.getAttendanceDay();
		String memberNum = work.getMemberNum();
		String leaveTime = work.getLeaveworkTime();
		String workTypeNum = workTypeMapper.getWorkTypeNum(workDate,memberNum);
		work.setWorkTypeNum(workTypeNum);
		String leaveStatus = workMapper.getLeaveStatus(workTypeNum, leaveTime);
		work.setLeaveworkStatus(leaveStatus);
		workMapper.updateWorkLeaveTime(work);
		Work workInfo = workMapper.getWorkByNum(memberNum, workDate);
		return workInfo;
	}
	/**
	 * 근태 수정(외출)
	 */
	public Work updateGoOut(Work work) {
		String workDate = work.getAttendanceDay();
		String memberNum = work.getMemberNum();
		workMapper.updateGoOut(work);
		Work workInfo = workMapper.getWorkByNum(memberNum, workDate);
		return workInfo;
	}
	/**
	 * 근태 수정(복귀)
	 */
	public Work updateComeBack(Work work) {
		String workDate = work.getAttendanceDay();
		String memberNum = work.getMemberNum();
		workMapper.updateComeBack(work);
		Work workInfo = workMapper.getWorkByNum(memberNum, workDate);
		return workInfo;
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
