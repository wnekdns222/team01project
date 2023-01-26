package ks45team01.unity.worker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
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
						@RequestParam(value="workTime", required=false) String workTime,
						HttpSession session) {
		
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setAttendanceTime(workTime);
		log.info("근태입력 정보:{}",work);
		Work workInfo = workService.addWork(work);
		log.info("근태 입력 후 조회:{}",workInfo);
		
		session.setAttribute("attendance", workInfo.getAttendanceTime());
		return  workInfo;
	}
	
	//근태 수정처리(퇴근)
	@PostMapping("work/workUpdate")
	@ResponseBody
	public Work updateLeaveWork(@RequestParam(value="SID", required=false) String SID,
								 @RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
								 @RequestParam(value="attendanceDay", required=false) String attendanceDay,
								 @RequestParam(value="leaveTime", required=false)String leaveTime,
								 HttpSession session) {	
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setLeaveworkTime(leaveTime);
		log.info("퇴근 버튼 누른 후 조회:{}",work);
		Work workInfo = workService.updateLeaveWork(work);
		log.info("퇴근 입력 후 조회:{}",workInfo);
		session.setAttribute("leaveTime", workInfo.getLeaveworkTime());
		return workInfo;
	}
	//근태 수정처리(외출시작)
	@PostMapping("work/updateGoOutStart")
	@ResponseBody
	public Work updateGoOut(@RequestParam(value="SID", required=false) String SID,
							@RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
							@RequestParam(value="attendanceDay", required=false) String attendanceDay,
							@RequestParam(value="workTime", required=false)String workTime,
							HttpSession session) {	
		
		Work work = new Work();
		
		work.setMemberNum(SID);
		work.setDepartmentNum(SDEPARTMENTNUM);
		work.setAttendanceDay(attendanceDay);
		work.setGooutWorkoutStartTime(workTime);
		Work workInfo = workService.updateGoOut(work);
		session.setAttribute("startTime", workInfo.getGooutWorkoutStartTime());
		return workInfo;
	}
	//근태 수정처리(외출시작)
	@PostMapping("work/updateComeback")
	@ResponseBody
	public Work updateComeback(@RequestParam(value="SID", required=false) String SID,
			@RequestParam(value="SDEPARTMENTNUM", required=false) String SDEPARTMENTNUM,
			@RequestParam(value="attendanceDay", required=false) String attendanceDay,
			@RequestParam(value="workTime", required=false)String workTime,
			HttpSession session) {	

			Work work = new Work();
			
			work.setMemberNum(SID);
			work.setDepartmentNum(SDEPARTMENTNUM);
			work.setAttendanceDay(attendanceDay);
			work.setGooutWorkoutComebackTime(workTime);
			Work workInfo = workService.updateComeBack(work);
			session.setAttribute("comebackTime", workInfo.getGooutWorkoutComebackTime());
			return workInfo;
	}
	
	//근태조회
	@GetMapping("work/workList")
	public String getWorkInfoById(Model model,
							      @RequestParam(value="memberNum", required=false)String memberNum) {
		List<Work> workList = workService.getWorkInfoById(memberNum);
		
		model.addAttribute("title", "근태조회");
		model.addAttribute("workList", workList);
		return "work/work_list";
	}
	
	//부서 사원 근태 조회
	@GetMapping("work/workDepartmentList")
	public String getDepartWorkInfo(@RequestParam(value="departmentNum", required=false)String departmentNum
									,Model model) {
	
		List<Work> workList = workService.getWorkInfoByDepart(departmentNum);
		model.addAttribute("title", "부서 근태 조회");
		model.addAttribute("workList", workList);
		return "work/work_department_list";
	}
	
}