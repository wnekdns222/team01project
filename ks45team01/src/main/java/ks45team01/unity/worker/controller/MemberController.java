package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.service.MemberDepartmentListService;
import ks45team01.unity.service.MemberLevelService;

@Controller

@RequestMapping("/member")
public class MemberController {

	private final MemberLevelService memberLevelService;
	private final MemberDepartmentListService memberDepartmentListService;
	public MemberController(MemberLevelService memberLevelService
							,MemberDepartmentListService memberDepartmentListService) {
		this.memberLevelService = memberLevelService;
		this.memberDepartmentListService = memberDepartmentListService;
	}
	
	
	@GetMapping("/Member")
	public String GetMember(Model model) {
		model.addAttribute("title","사원리스트화면");
	return "member/member";
	}
	
	@GetMapping("/MemberInsert")
	public String GetMemberInsert(Model model) {
		model.addAttribute("title","사원등록화면");
	return "member/member_insert";
	}
	
	@GetMapping("/MemberModify")
	public String GetMemberModify(Model model) {
		model.addAttribute("title","사원수정화면");
	return "member/member_modify";
	}
	
	@GetMapping("/MemberDelete")
	public String GetMemberDelete(Model model) {
		model.addAttribute("title","사원삭제화면");
	return "member/member_delete";
	}
	
	@GetMapping("/MemberDepartmentList")
	public String GetMemberDepartmentList(Model model) {
		
		List<MemberDepartmentList> memberDepartmentList = memberDepartmentListService.memberDepartmentList(); 	
		model.addAttribute("title","부서목록화면");
		model.addAttribute("memberDepartmentList",memberDepartmentList);
		
		return "member/member_department_list";
	}
	
	@GetMapping("/MemberDepartmentInsert")
	public String GetMemberDepartmentInsert(Model model) {
		
		model.addAttribute("title","부서등록화면");
	return "member/member_department_insert";
	}
	
	
	@GetMapping("/MemberDepartmentModify")
	public String GetMemberDepartmentModify(Model model) {
		
		model.addAttribute("title", "부서수정화면");
		return "member/member_department_modify";
	}
	
	@GetMapping("/MemberPositionList")
	public String GetMemberPositionList(Model model) {
		model.addAttribute("title","직급리스트화면");
	return "member/member_position_list";
	}
	
	@GetMapping("/MemberPositionInsert")
	public String GetMemberPositionInsert(Model model) {
		model.addAttribute("title","직급등록화면");
	return "member/member_position_insert";
	}
	
	@GetMapping("/MemberPositionModify")
	public String GetMemberPositionModify(Model model) {
		model.addAttribute("title","직급수정화면");
	return "member/member_position_modify";
	}
	
	@GetMapping("/MemberLevelList")
	public String GetMemberLevelList(Model model) {
		
		List<MemberLevel> memberLevelList = memberLevelService.memberLevelList();
		
		model.addAttribute("title","사원권한리스트 화면");
		model.addAttribute("memberLevelList", memberLevelList);
	return "member/member_level_list";
	}
	
	@GetMapping("/MemberLevelInsert")
	public String GetMemberLevelInsert(Model model) {
		model.addAttribute("title","사원권환등록 화면");
	return "member/member_level_insert";
	}
	
	@GetMapping("/MemberLevelModify")
	public String GetMemberLevelModify(String levelCode
									   ,Model model) {
		MemberLevel memberLevelDetail = memberLevelService.memberLevelDetail(levelCode);
		model.addAttribute("title", "사원권한리스트 화면");
		model.addAttribute("memberLevelDetail", memberLevelDetail);
		
	return "member/member_level_modify";
	}
	
	
	@GetMapping("/MemberPasswordModify")
	public String GetMemberPasswordModify(Model model) {
		model.addAttribute("title","사원패스워드 변경 화면");
	return "member/member_password_modify";
	}
	
	@GetMapping("/MemberAdmin")
	public String GetMemberAdmin(Model model) {
		model.addAttribute("title","사원 관리페이지");
	return "member/memberAdmin";
	}
	
	
}
