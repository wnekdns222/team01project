package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employment")
public class EmploymentController {
	
	//채용공고 생성
	@GetMapping("/announcementInsert")
	public String addAnnouncement() {
	
		return "employment/announcement_insert";
	}
	
	//채용공고 확인
	@GetMapping("/announcementList")
	public String getAnnouncementList() {
		
		return "employment/announcement_list";
	}
	
	//채용공고 수정
	@GetMapping("/announcementModify")
	public String modifyAnnouncement() {
			
		return "employment/announcement_modify";
	}
	
	//지원자 정보 확인
	@GetMapping("/applicantList")
	public String getApplicantList() {
		
		return "employment/applicant_list";
	}
	
	//채용 카테고리 생성
	@GetMapping("/employmentCategoryInsert")
	public String addEmploymentCategory() {
		
		return "employment/category_insert";
	}

	
}
