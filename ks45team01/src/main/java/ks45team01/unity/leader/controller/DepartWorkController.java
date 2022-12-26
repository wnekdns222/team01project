package ks45team01.unity.leader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 부서장 부서내 사원 근태 조회
 * @author KJY
 *
 */
@Controller
@RequestMapping("/")
public class DepartWorkController {

	@GetMapping("work/workDepartmentList")
	public String getDepartWorkInfo() {
		
		return "work/work_department_list";
	}
	//부서 연차정보조회
		@GetMapping("vacation/vacationInfoDepartmentList")
		public String getDepartVacationInfo() {
			
			return "vacation/vacation_info_department_list";
		}
}
