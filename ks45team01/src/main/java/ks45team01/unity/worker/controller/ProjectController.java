package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//리퀘스트메핑 /project로 잡음
@RequestMapping("/project")

public class ProjectController {

	/**
	 *  http://localhost/project/projectList접속시  
	 *  "project/project" 로 연결됨
	 * @param model
	 * @return
	 */
	
	
	
	
	@GetMapping("/projectList")
	public String GetProjectList(Model model) {
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
	public String GetProjectInsert(Model model) {
		model.addAttribute("projectInsert","프로젝트등록화면");
		/**모델 프로젝트 인서트 등록 가져오기
		 * model.addAttribute("projectInsert",projectInsert);
		 */
		return "project/project_insert";
	}
	
	
	@GetMapping("/projectModify")
	public String GetProjectModify(/* 등록자 아이디에 따른 수정권한 하기
			 */Model model) {
		
		/**
		 *객체 만들어서 서비스랑 연결하기  
		 *Member memberInfo = memberService.getMemberInfoById(memberId);
		 *ex)List<Member> memberList = memberService.getMemberList();
		 * 
		 * 모델 프로젝트 리스트 가져오기
		 * model.addAttribute("projectList",projectList);
		 * model.addAttribute("memberInfo", memberInfo);
		 * model.addAttribute("memberLevelList", memberLevelList);		
		 */
		
		model.addAttribute("projectModify","프로젝트수정화면");
		return "project/project_modify";
	}
	
	@GetMapping("/projectMember")
	public String GetProjectMemberList(Model model) {
		model.addAttribute("projectMember","프로젝트멤버리스트화면");
	return "project/project_member";
	}
	
	
	@GetMapping("/projectMemberInsert")
	public String GetProjectMemberInsert(Model model) {
		model.addAttribute("projectMemberInsert","프로젝트멤버리스트등록화면");
	return "project/project_member_insert";
	}
	
	
	@GetMapping("/projectMemberModify")
	public String GetProjectMemberModify(Model model) {
		model.addAttribute("projectMemberModify","프로젝트멤버리스트수정화면");
	return "project/project_member_modify";
	}
	
	@GetMapping("/projectUnit")
	public String GetProjectUnit(Model model) {
		model.addAttribute("projectUnit","프로젝트단위업무화면");
	return "project/project_unit";
	}
	
	@GetMapping("/projectUnitInsert")
	public String GetProjectUnitInsert(Model model) {
		model.addAttribute("projectUnitInsert","프로젝트단위업무등록화면");
	return "project/project_unit_insert";
	}
	
	@GetMapping("/projectUnitModify")
	public String GetProjectUnitModify(Model model) {
		model.addAttribute("projectUnitModify","프로젝트단위업무수정화면");
	return "project/project_unit_Modify";
	}
	
	@GetMapping("/projectUnitMemberInsert")
	public String GetProjectUnitMemberInsert(Model model) {
		model.addAttribute("projectUnitMemberInsert","프로젝트단위업무인원배정화면");
	return "project/project_unit_member_insert";
	}
	
	@GetMapping("/projectUnitMemberModify")
	public String GetProjectUnitMemberModify(Model model) {
		model.addAttribute("projectUnitMemberModify","프로젝트단위업무인원배정수정화면");
	return "project/project_unit_member_modify";
	}
	
	@GetMapping("/projectDetail")
	public String GetProjectDetail(Model model) {
		model.addAttribute("projectDetail","프로젝트내부 홈 화면");
	return "project/project_detail";
	}
	
	@GetMapping("/projectBoardInsert")
	public String projectBoardInsert(Model model) {
		model.addAttribute("projectBoardInsert","프로젝트내부 게시글 생성화면");
	return "project/project_board_insert";
	}
	
	@GetMapping("/projectBoardModify")
	public String projectBoardModify(Model model) {
		model.addAttribute("projectBoardModify","프로젝트내부 게시글 수정화면");
	return "project/project_board_modify";
	}
	
	@GetMapping("/projectTaskInsert")
	public String projectTaskInsert(Model model) {
		model.addAttribute("projectTaskInsert","프로젝트내부 업무요청 등록화면");
	return "project/project_task_insert";
	}
	
	@GetMapping("/projectTaskModify")
	public String projectTaskModify(Model model) {
		model.addAttribute("projectTaskModify","프로젝트내부 업무요청 수정화면");
	return "project/project_task_modify";
	}
	
	@GetMapping("/projectCalender")
	public String projectCalender(Model model) {
		model.addAttribute("projectCalender","프로젝트내부 캘린더 화면");
	return "project/project_calender";
	}
	
	@GetMapping("/projectCalenderInsert")
	public String projectCalenderInsert(Model model) {
		model.addAttribute("projectCalenderInsert","프로젝트내부 캘린더 입력 화면");
	return "project/project_calender_insert";
	}
	
	@GetMapping("/projectCalenderModify")
	public String projectCalenderModify(Model model) {
		model.addAttribute("projectCalenderModify","프로젝트내부 캘린더 수정 화면");
	return "project/project_calender_modify";
	}
	
	@GetMapping("/projectFiles")
	public String projectFiles(Model model) {
		model.addAttribute("projectFiles","프로젝트 첨부파일 화면");
	return "project/project_files";
	}
	
	@GetMapping("/projectFilesInsert")
	public String projectFilesInsert(Model model) {
		model.addAttribute("projectFilesInsert","프로젝트 첨부파일 등록화면");
	return "project/project_files_insert";
	}
}
