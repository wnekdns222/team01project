package ks45team01.unity.worker.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
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
	@GetMapping("work/workInsert")
	public String addWork(HttpSession session, RedirectAttributes reAttr) {
		
		log.info("사용자 정보: {}", session);
		
		//String memberNum = session.getAttribute(MemberNum);
		//String departName = session.getAttribute(departName);
		//String newCode = workService.getCommonNewCode("tb_work","work_num");
		
		//List<String> work = new ArrayList();
		
		//work.add(memberNum);
		//work.add(departName);
		//work.add(newCode);
		
		//workService.addWork(work);
	
		//reAttr.addAttribute();
		
		return "redirect:/";
	}
	//근태 수정처리(퇴근)
	@GetMapping("work/updateLeaveWork")
	public String updateLeaveWork(@RequestParam(value="leaveworkTime", required=false)String leaveworkTime) {	
		
		return "redirect:/";
	}
	//근태 수정처리(외출시작)
	@GetMapping("work/updateGoOutStart")
	public String updateGoOut(@RequestParam(value="gooutWorkoutStartTime", required=false)String gooutWorkoutStartTime) {	
		
		return "redirect:/";
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
	//연차정보조회
	@GetMapping("vacation/vacationInfoList")
	public String getVacationInfoById() {
		
		return "vacation/vacation_info_list";
	}
}