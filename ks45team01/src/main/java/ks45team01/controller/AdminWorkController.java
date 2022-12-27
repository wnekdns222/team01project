package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 관리자 전사원 근태 조회
 * @author KJY
 *
 */
@Controller
@RequestMapping("/")
public class AdminWorkController {

	//전사원 근무내역 조회
	@GetMapping("work/workAllList")
	public String getAllWorkInfo() {   
		
		return "work/work_all_list";
	}
	//비정상 근태 직권등록
	@GetMapping("work/workAuthorityInsert")
	public String addAuthorityWorkInfo() {
		
		return "work/work_authority_Insert";
	}
	//근무유형 입력
	@GetMapping("settings/workTypeInsert")
	public String updateWorkType() {
		
		return "settings/work_type_modify";
	}
	//근무유형 수정
	@GetMapping("settings/workTypeModify")
	public String addWorkType() {
		
		return "settings/work_type_insert";
	}

	//전직원근무유형 조회
	@GetMapping("settings/workTypeList")
	public String getAllWorkType() {
		
		return "settings/work_type_list";
	}
	
	//전직원 연차내역조회
	@GetMapping("vacation/vacationInfoAllList")
	public String getAllVacationInfo() {
		
		return "vacation/vacation_info_all_list";
	}
	//사내 휴가종류입력
	@GetMapping("settings/vacationVrietyInsert")
	public String addVacationVariety() {
		
		return "settings/vacation_variety_insert";
	}
	//사내 휴가종류목록
		@GetMapping("settings/vacationVarietyList")
		public String getVacationVariety() {
			
			return "settings/vacation_variety_list";
		}
	//휴가종류수정
	@GetMapping("settings/vacationVarietyModify")
	public String updateVacationVariety() {
		
		return "settings/vacation_variety_modify";
	}
	//휴가부여
	@GetMapping("settings/vacationInsert")
	public String addVacation() {
		
		return "settings/vacation_insert";
	}
	
		
}
