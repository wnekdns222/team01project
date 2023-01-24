package ks45team01.unity.worker.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.VacationApproval;
import ks45team01.unity.dto.VacationInformation;
import ks45team01.unity.service.VacationService;

@Controller
public class VacationController {

	
	private static final Logger log = LoggerFactory.getLogger(VacationController.class);

	private final VacationService vacationService;
	
	public VacationController(VacationService vacationService) {
		this.vacationService = vacationService;
	}
	/**
	 * 특정 사원 연차 조회
	 * @return
	 */
		@GetMapping("vacation/vacationInfoList")
		public String getVacationInfoById(Model model,
										  @RequestParam(value="memberNum", required=false)String memberNum) {
			
				Map<String,Object> vacationInfo = vacationService.getVacationInfoBymemberNum(memberNum);
				log.info("컨트롤러로 가져온 vacationInfoMap{}:",vacationInfo);
				List<VacationInformation> vacationInformation = (List<VacationInformation>) vacationInfo.get("info");
				List<VacationApproval> vacationApproval = (List<VacationApproval>) vacationInfo.get("approval");
				
				log.info("휴가 정보 조회:{}",vacationInformation);
				log.info("휴가 사용정보 조회:{}",vacationApproval);
				model.addAttribute("vacationInformation", vacationInformation);
				model.addAttribute("vacationApproval", vacationApproval);
			
			return "vacation/vacation_info_list";
		}
}
