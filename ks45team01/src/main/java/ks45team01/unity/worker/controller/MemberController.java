package ks45team01.unity.worker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.DepartmentManage;
import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.dto.PositionManage;
import ks45team01.unity.service.DepartmentManageService;
import ks45team01.unity.service.MemberDepartmentListService;
import ks45team01.unity.service.MemberLevelService;
import ks45team01.unity.service.MemberListService;
import ks45team01.unity.service.MemberModifyService;
import ks45team01.unity.service.MemberPositionListService;
import ks45team01.unity.service.PositionManageService;

@Controller

@RequestMapping("/member")
public class MemberController {

	
	
	
	
	private final MemberLevelService memberLevelService;
	private final MemberDepartmentListService memberDepartmentListService;
	private final MemberPositionListService memberPositionListService;
	private final MemberListService memberListService;
	private final PositionManageService positionManageService;
	private final DepartmentManageService departmentManageService;
	private final MemberModifyService memberModifyService;
	
	public MemberController(MemberLevelService memberLevelService
							,MemberDepartmentListService memberDepartmentListService
							,MemberPositionListService memberPositionListService
							,MemberListService memberListService
							,PositionManageService positionManageService
							,DepartmentManageService departmentManageService
							,MemberModifyService memberModifyService) {
		
		this.memberLevelService = memberLevelService;
		this.memberDepartmentListService = memberDepartmentListService;
		this.memberPositionListService = memberPositionListService;
		this.memberListService = memberListService;
		this.positionManageService = positionManageService;
		this.departmentManageService = departmentManageService;
		this.memberModifyService = memberModifyService;
	}
	
	
	@GetMapping("/Member")
	public String GetMember(Model model
						   ,@RequestParam(value="currentPage", required = false, defaultValue="1") int currentPage
						   ,@RequestParam(value="searchKey", required = false) String searchKey
						   ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {
		
		List<MemberList> memberList = memberListService.memberListSe(searchKey, searchValue);
		Map<String, Object> paramMap = memberListService.getMemberList(currentPage);
		
		
		int lastPage = (int) paramMap.get("lastPage");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");

		
		model.addAttribute("title","사원리스트화면");
		model.addAttribute("memberList",memberList);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		

	return "member/member";
	}
	
	@GetMapping("/MemberInsert")
	public String getMemberInsert(Model model) {
		model.addAttribute("title","사원등록화면");
	return "member/member_insert";
	}
	
	@GetMapping("/MemberModify")
	public String getMemberModify(Model model) {
		
		List<MemberList> memberModifyList = memberModifyService.memberModifyList();
		
		model.addAttribute("title","사원수정화면");
		model.addAttribute("memberModifyList", memberModifyList);
	return "member/member_modify";
	}
	
	@GetMapping("/MemberDelete")
	public String getMemberDelete(Model model) {
		model.addAttribute("title","사원삭제화면");
	return "member/member_delete";
	}
	
	@GetMapping("/MemberDepartmentList")
	public String getMemberDepartmentList(Model model) {
		
		List<MemberDepartmentList> memberDepartmentList = memberDepartmentListService.memberDepartmentList(); 	
		model.addAttribute("title","부서목록화면");
		model.addAttribute("memberDepartmentList",memberDepartmentList);
		
		return "member/member_department_list";
	}
	
	@GetMapping("/MemberDepartmentInsert")
	public String getMemberDepartmentInsert(Model model) {
		
		model.addAttribute("title","부서등록화면");
	return "member/member_department_insert";
	}
	
	
	@GetMapping("/MemberDepartmentModify")
	public String getMemberDepartmentModify(Model model) {
		
		model.addAttribute("title", "부서수정화면");
		return "member/member_department_modify";
	}
	
	@GetMapping("/MemberPositionList")
	public String getMemberPositionList(Model model) {
		
		List<MemberPositionList> memberPositionList = memberPositionListService.memberPositionList();
		
		model.addAttribute("title","직급리스트화면");
		model.addAttribute("memberPositionList",memberPositionList);
	return "member/member_position_list";
	}
	
	@GetMapping("/MemberPositionInsert")
	public String getMemberPositionInsert(Model model) {
		model.addAttribute("title","직급등록화면");
	return "member/member_position_insert";
	}
	
	@GetMapping("/MemberPositionModify")
	public String getMemberPositionModify(Model model) {
		model.addAttribute("title","직급수정화면");
	return "member/member_position_modify";
	}
	
	@GetMapping("/MemberLevelList")
	public String getMemberLevelList(Model model) {
		
		List<MemberLevel> memberLevelList = memberLevelService.memberLevelList();
		
		model.addAttribute("title","사원권한리스트 화면");
		model.addAttribute("memberLevelList", memberLevelList);
	return "member/member_level_list";
	}
	
	@GetMapping("/MemberLevelInsert")
	public String getMemberLevelInsert(Model model) {
		model.addAttribute("title","사원권환등록 화면");
	return "member/member_level_insert";
	}
	
	@GetMapping("/MemberLevelModify")
	public String getMemberLevelModify(String levelCode
									   ,Model model) {
		
		MemberLevel memberLevelDetail = memberLevelService.memberLevelDetail(levelCode);
		
		model.addAttribute("title", "사원권한리스트 화면");
		model.addAttribute("memberLevelDetail", memberLevelDetail);
		
	return "member/member_level_modify";
	}
	
	
	@GetMapping("/MemberPasswordModify")
	public String getMemberPasswordModify(Model model) {
		model.addAttribute("title","사원패스워드 변경 화면");
	return "member/member_password_modify";
	}
	
	@GetMapping("/MemberAdmin")
	public String getMemberAdmin(Model model) {
		model.addAttribute("title","사원 관리페이지");
	return "member/memberAdmin";
	}
	
	@GetMapping("/MemberDepartMentManige")
	public String getMemberDepartMentManige(Model model) {
		
		List<DepartmentManage> departmentManage = departmentManageService.departmentManageSe();
		
		model.addAttribute("title","부서사원전체관리");
		model.addAttribute("departmentManage",departmentManage);
	return "member/member_department_manige";
	}
	
	@GetMapping("/MemberPositionManige")
	public String getMemberPositionManige(Model model) {
		
		List<PositionManage> positionManage = positionManageService.positionManageSe();
		
		model.addAttribute("title","직급사원전체관리");
		model.addAttribute("positionManage",positionManage);
	return "member/member_position_manige";
	}
	
}
