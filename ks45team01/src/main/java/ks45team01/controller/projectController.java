package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//리퀘스트메핑 /project로 잡음
@RequestMapping("/project")

public class projectController {

	/**
	 *  http://localhost/project/projectList접속시  
	 *  "project/project" 로 연결됨
	 * @param model
	 * @return
	 */
	
	
	@GetMapping("/projectList")
	public String GetMemberList(Model model) {
		model.addAttribute("project","프로젝트메인화면");
		/**
		 *객체 만들어서 서비스랑 연결하기  
		 *ex)List<Member> memberList = memberService.getMemberList();
		 * 
		 * 모델 프로젝트 리스트 가져오기
		 * model.addAttribute("projectList",projectList);
		 */
		return "project/project";
	}
	
	
	/*
	 * 정보를 가지고 db쪽에 보내는 포스트 맵핑 하기
	 * @PostMapping("/projectInsert") 
	 * public String addMember(Member member) {
	 * log.info("회원가입 쿼리파라미터: {}" , member); 
	 * memberService.addMember(member);
	 * 
	 * return "redirect:/member/memberList"; }
	 */
	
	@GetMapping("/projectInsert")
	public String GetMemberInsert(Model model) {
		model.addAttribute("projectInsert","프로젝트등록화면");
		/**모델 프로젝트 인서트 등록 가져오기
		 * model.addAttribute("projectInsert",projectInsert);
		 */
		return "project/project_insert";
	}
	
	
	
	
	
}
