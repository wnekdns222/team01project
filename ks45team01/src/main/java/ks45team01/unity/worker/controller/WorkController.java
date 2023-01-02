package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.unity.dto.WorkType;

/**
 * 일반사원 근태 컨트롤러
 * @author KJY
 *
 */

@Controller
@RequestMapping("/")
public class WorkController {

	//근태입력
	@GetMapping("work/workInsert")
	public String addWork(Model model) {
		
		return "work/work_insert";
	}
	//근태 입력처리
	@PostMapping("work/workInsert")
	public String addWork() {
		
		
		return "work/work_insert";
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