package ks45team01.unity.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;
import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkType;
import ks45team01.unity.dto.WorkUnusual;
import ks45team01.unity.service.VacationService;
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

	private final VacationService vacationService;
	private final WorkTypeService workTypeService;
	private final WorkService workService;
	
	public AdminWorkController(WorkTypeService workTypeService, WorkService workService,VacationService vacationService) {
		this.workTypeService = workTypeService;
		this.workService = workService;
		this.vacationService = vacationService;
	}
	/**
	 * 전사원 근태내역 조회
	 * @param model
	 * @return
	 */
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
	/**
	 * 비정상 근태 조회
	 * @return "work/work_authority_list"
	 */
	@GetMapping("work/workAuthorityList")
	public String getAuthorityWorkInfo(Model model) {
		
		List<WorkUnusual> unusualList = workService.getAuthorityWorkInfo();
		model.addAttribute("unusualList", unusualList);
		
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
	 * 전직원근무유형 조회, 페이징
	 * @param model, requestParam
	 * @return
	 */
	@GetMapping("settings/workTypeList")
	public String getAllWorkType(Model model
								,@RequestParam(value="currentPage", required=false, defaultValue="1") int currentPage) {
		
		Map<String, Object> paramMap = workTypeService.getAllWorkType(currentPage);
		int lastPage = (int)paramMap.get("lastPage");
		List<WorkType> workTypeList = (List<WorkType>) paramMap.get("workType");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");
		
		log.info("근무유형 조회: {}", workTypeList);
		
		model.addAttribute("workTypeList", workTypeList);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		
		return "settings/work_type_list";
	}
	
	//전직원 연차내역조회
	@GetMapping("vacation/vacationInfoAllList")
	public String getAllVacationInfo() {
		
		return "vacation/vacation_info_all_list";
	}
	/**
	 * 휴가종류 입력 화면
	 * @param model
	 * @return
	 */
	@GetMapping("settings/vacationTypeInsert")
	public String addVacationType(Model model) {
		
		model.addAttribute("title","휴가종류등록");
		return "settings/vacation_type_insert";
	}
	/**
	 * 휴가종류 입력 처리
	 * @param vacationType
	 * @return
	 */
	@PostMapping("settings/vacationTypeInsert")
	public String addVacationVariety(VacationType vacationType) {
		
		log.info("휴가종류 입력:{}",vacationType);
		
		vacationService.addVacationType(vacationType);
		
		
		return "redirect:/settings/vacationVarietyList";
	}
	//사내 휴가종류목록
	@GetMapping("settings/vacationVarietyList")
	public String getVacationVariety(Model model) {
		
		Map<String, Object> variety = vacationService.getVacationVariety();
		List<VacationCategory> category = (List<VacationCategory>)variety.get("category");
		List<VacationSort> sort =(List<VacationSort>)variety.get("sort");
		List<VacationType> type =(List<VacationType>)variety.get("type");
		List<VacationStandard> standard = (List<VacationStandard>)variety.get("standard");
		model.addAttribute("title", "휴가설정");
		model.addAttribute("category", category);
		model.addAttribute("sort", sort);
		model.addAttribute("type", type);
		model.addAttribute("standard", standard);
		
		return "settings/vacation_variety_list";
	}
	/**
	 * 휴가종류 수정 처리
	 * @param model
	 * @return
	 */
	@PostMapping("settings/vacationTypeModify")
	public String updateVacationType(VacationType vacationType, Model model) {
		
		log.info("특정휴가종류 수정:{}",vacationType);
		
		vacationService.updateVacationType(vacationType);
		
		model.addAttribute("title", "휴가종류 수정");
		model.addAttribute("vacationType", vacationType);
		
		return "redirect:/settings/vacationVarietyList";
	}
	/**
	 * 휴가 종류 수정 처리
	 * @param vacationValue
	 * @param model
	 * @return
	 */
	@GetMapping("settings/vacationTypeModify")
	public String updateVacationType(@RequestParam(value="vacationTypeNum", required=false)String vacationTypeNum, Model model) {
		
		VacationType vacationType = vacationService.getVacationTypeByNum(vacationTypeNum);
		model.addAttribute("title", "휴가종류 수정");
		model.addAttribute("vacationType", vacationType);
		
		log.info("특정휴가종류 조회:{}",vacationType);
		
		return "settings/vacation_type_modify";
	}

	/**
	 * 휴가 대분류 입력 화면
	 * @return
	 */
	@GetMapping("settings/vacationCategoryInsert")
	public String addVacationCategory(Model model) {
		
		model.addAttribute("title", "휴가대분류 입력");
		return "settings/vacation_category_insert";
	}
	/**
	 * 휴가 대분류 입력 처리
	 * @return
	 */
	@PostMapping("settings/vacationCategoryInsert")
	public String addVacationCategory(VacationCategory vacationCategory, Model model) {
		
		vacationService.addVacationCategory(vacationCategory);
		return "redirect:/settings/vacationVarietyList";
	}
	/**
	 * 휴가 대분류 수정 화면
	 * @return
	 */
	@GetMapping("settings/vacationCategoryModify")
	public String updateVacationCategory(@RequestParam(value="vacationCategoryNum", required=false)String vacationCategoryNum, Model model) {
		log.info("휴가대분류 넘버:{}",vacationCategoryNum);
		
		VacationCategory vacationCategory = vacationService.getVacationCategoryByNum(vacationCategoryNum);
		
		model.addAttribute("title", "휴가대분류 수정");
		model.addAttribute("vacationCategory", vacationCategory);
		return "settings/vacation_category_modify";
	}
	/**
	 * 휴가 대분류 수정 처리
	 * @return
	 */
	@PostMapping("settings/vacationCategoryModify")
	public String updateVacationCategory(VacationCategory vacationCategory, Model model) {
		
		vacationService.updateVacationCategory(vacationCategory);
		return "redirect:/settings/vacationVarietyList";
	}
	
	//휴가부여
	@GetMapping("settings/vacationInsert")
	public String addVacation() {
		
		return "settings/vacation_insert";
	}
	/**
	 * 휴가 중분류 입력 화면
	 */
	@GetMapping("settings/vacationSortInsert")
	public String addVacationSort(Model model) {
		
		model.addAttribute("title", "휴가 중분류 입력");
		
		return "settings/vacation_sort_insert";
	}
	/**
	 * 휴가 중분류 입력 처리
	 */
	@PostMapping("settings/vacationSortInsert")
	public String addVacationSort(VacationSort vacationSort) {
		
		log.info("휴가 중분류 입력:{}",vacationSort);
		
		vacationService.addVacationSort(vacationSort);
		
		return "redirect:/settings/vacationVarietyList";
	}
	/**
	 * 휴가 중분류 수정 화면
	 * 
	 */
	@GetMapping("settings/vacationSortModify")
	public String updateVacationSort(@RequestParam(value="vacationSortNum", required=false)String vacationSortNum, Model model) {
		
			log.info("휴가 중분류 번호:{}",vacationSortNum);
			
			VacationSort vacactionSort = vacationService.getVacationSortByNum(vacationSortNum);
			
			model.addAttribute("title", "휴가 중분류 수정");
			model.addAttribute("vacactionSort", vacactionSort);
		return "settings/vacation_sort_modify";
	}
	
	/**
	 * 휴가 중분류 수정 처리
	 */
	@PostMapping("settings/vacationSortModify")
	public String updateVacation(VacationSort vacationSort) {
		
			log.info("휴가 중분류 수정:{}",vacationSort);
			vacationService.updateVacationSort(vacationSort);
		return "redirect:/settings/vacationVarietyList";
	}
}
