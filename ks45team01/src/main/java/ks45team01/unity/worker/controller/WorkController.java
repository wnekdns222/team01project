package ks45team01.unity.worker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team01.unity.dto.Work;
import ks45team01.unity.service.WorkService;

/**
 * 일반사원 근태 컨트롤러
 * @author KJY
 *
 */

@Controller
@RequestMapping("/")
public class WorkController {
	
	private static final Logger log = LoggerFactory.getLogger(WorkController.class);

	private final WorkService workService;
	public WorkController(WorkService workService) {
		this.workService = workService;
	}
	
	//근태 입력처리(출근)
	@PostMapping("work/workInsert")
	@ResponseBody
	public Work addWork(@RequestParam(value="SID", required=false) String SID,
						@RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
						@RequestParam(value="attendanceDay", required=false) String attendanceDay,
						@RequestParam(value="workTime", required=false) String workTime) {
		
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setAttendanceTime(workTime);
		log.info("근태입력 정보:{}",work);
		Work workInfo = workService.addWork(work);
		log.info("근태 입력 후 조회:{}",workInfo);
		return  workInfo;
	}
	
	//근태 수정처리(퇴근)
	@PostMapping("work/workUpdate")
	@ResponseBody
	public Work updateLeaveWork(@RequestParam(value="SID", required=false) String SID,
								 @RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
								 @RequestParam(value="attendanceDay", required=false) String attendanceDay,
								 @RequestParam(value="leaveTime", required=false)String leaveTime) {	
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setLeaveworkTime(leaveTime);
		Work workInfo = workService.updateLeaveWork(work);
		log.info("퇴근 입력 후 조회:{}",workInfo);
		return workInfo;
	}
	//근태 수정처리(외출시작)
	@PostMapping("work/updateGoOutStart")
	public Work updateGoOut(@RequestParam(value="gooutWorkoutStartTime", required=false)String gooutWorkoutStartTime,
							@RequestParam(value="SID", required=false) String SID,
							@RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
							@RequestParam(value="attendanceDay", required=false) String attendanceDay) {	
		
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setGooutWorkoutStartTime(gooutWorkoutStartTime);
		Work workInfo = workService.updateGoOut(work);
		return workInfo;
	}
	//근태 수정처리(외출시작)
	@GetMapping("work/updateComeback")
	public String updateComeback(@RequestParam(value="gooutWorkoutComebackTime", required=false)String gooutWorkoutComebackTime) {	
	
		return "redirect:/";
	}
	//근태조회
	@GetMapping("work/workList")
	public String getWorkInfoById() {
		
		return "work/work_List";
	}
	
}