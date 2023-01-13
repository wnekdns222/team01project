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
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.dto.VacationCategory;
import ks45team01.unity.dto.VacationInformation;
import ks45team01.unity.dto.VacationSort;
import ks45team01.unity.dto.VacationStandard;
import ks45team01.unity.dto.VacationType;
import ks45team01.unity.mapper.VacationMapper;
import ks45team01.unity.service.VacationService;

@Controller
@RequestMapping("/")
public class AdminVacationController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminWorkController.class);

	private final VacationService vacationService;
	private final VacationMapper vacationMapper;
	
	public AdminVacationController(VacationService vacationService,VacationMapper vacationMapper) {
		this.vacationService = vacationService;
		this.vacationMapper = vacationMapper;
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
		/**
		 * 사내 휴가종류 조회
		 * @param model
		 * @return
		 */
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
		/**
		 * 휴가 부여 화면
		 */
		
		  @GetMapping("settings/vacationInsertAll") 
		  public String GetVacationInserAll(Model model) { 
			  List<VacationStandard> standard = vacationMapper.getVacationStandard(); model.addAttribute("title","휴가부여");
			  model.addAttribute("standard", standard); List<MemberList> memberList =
					  vacationService.getMemberList(); log.info("사원정보 조회 :{}",memberList);
					  model.addAttribute("memberList", memberList); 
					  return "settings/vacation_insert_all"; 
		  }
		 
		/**
		 * 연차등록 화면
		 * @return
		 */
		@GetMapping("settings/vacation_insert:: vacationInsert")
		public String addVacation(Model model) {
			List<VacationStandard> standard = vacationMapper.getVacationStandard();
			
			log.info("휴가기준 조회:{}",standard);
			model.addAttribute("standard", standard);
			model.addAttribute("title", "연차등록");
			return "settings/vacation_insert";
		}
		/**
		 * 근속연수에 따른 사원이름
		 * @return
		 */
		@GetMapping("settings/checkMember")
		@ResponseBody
		public List<MemberList> checkMember(@RequestParam(value="length", required=false)String length, Model model) {
						log.info("근속연수:{}",length);
						List<MemberList> memberNameList = vacationService.getMemberNameByLength(length);
						log.info("근속연수에 따른 사원이름:{}",memberNameList);
						return memberNameList;
		}
		/**
		 * 연차등록 처리
		 * @return
		 */
		@PostMapping("settings/vacationInsert")
		public String addVacation(VacationInformation vacationInformation) {
				
			log.info("휴가등록 정보:{}",vacationInformation);
			vacationService.addVacationInfo(vacationInformation);
			
			return "redirect:/vacation/vacationInfoAllList";
		}
		/**
		 * 기타 휴가 등록 화면
		 */
		@GetMapping("settings/vacation_insert_other:: vacationInsertOther")
		public String addVacationOthers(Model model) {
			List<MemberList> memberList = vacationService.getMemberList();
			log.info("사원정보 조회 :{}",memberList);
			model.addAttribute("memberList", memberList);
			return "settings/vacation_insert_other";
		}
		/**
		 * 기타 휴가 등록 처리
		 */
		@PostMapping("settings/vacationInsertOther")
		public String addVacationOthers(VacationInformation vacationInformation) { 
			log.info("기타 휴가 등록 정보:{}",vacationInformation);
			vacationService.updateVacationInfo(vacationInformation);
			return "redirect:/vacation/vacationInfoAllList";
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
		/**
		 * 전사원 휴가 정보 조회 화면
		 */
		@GetMapping("vacation/vacationInfoAllList")
		public String getAllVacationInfo(Model model) {
			List<VacationInformation> infoList = vacationService.getVacationInfoAll();
				log.info("휴가정보 조회:{}",infoList);
				model.addAttribute("infoList", infoList);
				model.addAttribute("title", "전사원 휴가 조회");
				
			return "vacation/vacation_info_all_list";
		}
}
