package ks45team01.unity.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkType;
import ks45team01.unity.service.WorkService;
import ks45team01.unity.service.WorkTypeService;

/**
 * 관리자 전사원 근태 조회
 * @author KJY
 *
 */
@Controller
@RequestMapping("/")
public class AdminWorkController {

	
	private static final Logger log = LoggerFactory.getLogger(AdminWorkController.class);

	
	private final WorkTypeService workTypeService;
	private final WorkService workService;
	
	public AdminWorkController(WorkTypeService workTypeService, WorkService workService) {
		this.workTypeService = workTypeService;
		this.workService = workService;
	}
	//전사원 근무내역 조회
	@GetMapping("work/workAllList")
	public String getAllWorkInfo(Model model) {   
		
		List<Work> workInfoList = workService.getAllWorkInfo();
		model.addAttribute("workInfoList",workInfoList);
		
		return "work/work_all_list";
	}
	//비정상 근태 직권등록
	@GetMapping("work/workAuthorityInsert")
	public String addAuthorityWorkInfo() {
		
		return "work/work_authority_Insert";
	}
	//비정상 근태 조회
	@GetMapping("work/workAuthorityList")
	public String getAuthorityWorkInfo() {
		
		return "work/work_authority_list";
	}
	/**
	 * 근무유형 수정
	 * @return "settings/work_type_modify";
	 */
	@GetMapping("settings/workTypeModify")
	public String updateWorkType(@RequestParam(value="workTypeNum", required=false)String workTypeNum, Model model) {
		
		log.info("workType: {}", workTypeNum);
		WorkType workType = workTypeService.getWorkTypeById(workTypeNum);
		model.addAttribute("workType", workType);
		
		return "settings/work_type_modify";
	}
	
	/**
	 * 근무유형 수정처리
	 * @param workType
	 * @return 
	 */
	@PostMapping("settings/workTypeModify")
	public String updateWorkType(WorkType workType) {
		
		log.info("근무유형 수정: {}",workType);
		workTypeService.updateWorkType(workType);
		return "redirect:/settings/workTypeList";
	}
	
	/**
	 * 근무유형 입력
	 * @return "settings/work_type_insert";
	 */
	@GetMapping("settings/workTypeInsert")
	public String addWorkType() {
		
		return "settings/work_type_insert";
	}
	
	/**
	 * 근무유형 입력처리
	 * @return "redirect:/settings/workTypeList";
	 */
	@PostMapping("settings/workTypeInsert")
	public String addWorkType(WorkType workType) {
		
		log.info("근무유형 입력: {}",workType);
		workTypeService.addWorkType(workType);
		
		return "redirect:/settings/workTypeList";
	}
	/**
	 * 전직원근무유형 조회
	 * @param model
	 * @return
	 */
	@GetMapping("settings/workTypeList")
	public String getAllWorkType(Model model) {
		
		List<WorkType> workTypeList = workTypeService.getAllWorkType();
		
		log.info("근무유형 조회: {}", workTypeList);
		
		model.addAttribute("workTypeList", workTypeList);
		
		return "settings/work_type_list";
	}
	
	//전직원 연차내역조회
	@GetMapping("vacation/vacationInfoAllList")
	public String getAllVacationInfo() {
		
		return "vacation/vacation_info_all_list";
	}
	//사내 휴가종류입력
	@GetMapping("settings/vacationVarietyInsert")
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
