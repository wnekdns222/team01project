package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/member")
public class MemberController {

	
	@GetMapping("/Member")
	public String GetMember(Model model) {
		model.addAttribute("Member","사원리스트화면");
	return "member/member";
	}
	
	@GetMapping("/MemberInsert")
	public String GetMemberInsert(Model model) {
		model.addAttribute("MemberInsert","사원등록화면");
	return "member/member_insert";
	}
	
	@GetMapping("/MemberModify")
	public String GetMemberModify(Model model) {
		model.addAttribute("MemberModify","사원수정화면");
	return "member/member_modify";
	}
	
	@GetMapping("/MemberDelete")
	public String GetMemberDelete(Model model) {
		model.addAttribute("MemberDelete","사원삭제화면");
	return "member/member_delete";
	}
	
	@GetMapping("/MemberDepartmentList")
	public String GetMemberDepartmentList(Model model) {
		model.addAttribute("MemberDepartmentList","부서목록화면");
	return "member/member_department_list";
	}
	
	@GetMapping("/MemberDepartmentInsert")
	public String GetMemberDepartmentInsert(Model model) {
		model.addAttribute("MemberDepartmentInsert","부서등록화면");
	return "member/member_department_insert";
	}
	
	@GetMapping("/MemberDepartmentDelete")
	public String GetMemberDepartmentDelete(Model model) {
		model.addAttribute("MemberDepartmentDelete","부서삭제화면");
	return "member/member_department_delete";
	}
	
	@GetMapping("/MemberPositionList")
	public String GetMemberPositionList(Model model) {
		model.addAttribute("MemberPositionList","직급리스트화면");
	return "member/member_position_list";
	}
	
	@GetMapping("/MemberPositionInsert")
	public String GetMemberPositionInsert(Model model) {
		model.addAttribute("MemberPositionInsert","직급등록화면");
	return "member/member_position_insert";
	}
	
	@GetMapping("/MemberPositionModify")
	public String GetMemberPositionModify(Model model) {
		model.addAttribute("MemberPositionModify","직급수정화면");
	return "member/member_position_modify";
	}
	
	@GetMapping("/MemberLevelList")
	public String GetMemberLevelList(Model model) {
		model.addAttribute("MemberLevelList","사원권한리스트 화면");
	return "member/member_level_list";
	}
	
	@GetMapping("/MemberLevelInsert")
	public String GetMemberLevelInsert(Model model) {
		model.addAttribute("MemberLevelInsert","사원권한리스트 화면");
	return "member/member_level_insert";
	}
	
	@GetMapping("/MemberLevelModify")
	public String GetMemberLevelModify(Model model) {
		model.addAttribute("MemberLevelModify","사원권한리스트 화면");
	return "member/member_level_modify";
	}
	
	
	@GetMapping("/MemberPasswordModify")
	public String GetMemberPasswordModify(Model model) {
		model.addAttribute("MemberPasswordModify","사원패스워드 변경 화면");
	return "member/member_password_modify";
	}
}
