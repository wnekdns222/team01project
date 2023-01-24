package ks45team01.unity.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.service.MemberListService;
import ks45team01.unity.service.MemberModifyService;


@Controller

@RequestMapping("/AdminMember")
public class AdminMemberController {

	
	
	
	

	private final MemberModifyService memberModifyService;
	private final MemberListService memberListService;
	
	public AdminMemberController(MemberModifyService memberModifyService
								,MemberListService memberListService) {
		
		this.memberModifyService = memberModifyService;
		this.memberListService = memberListService;
	}
	
	
	@GetMapping("/AdminMemberList")
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
	
		
		return "member/memberAdmin";
	}
	
	
	
	@GetMapping("/MemberAdminModify")
	public String GetMemberModify(String memberNum
								  ,Model model) {
		
		List<MemberDepartmentList> memberModifyDepartmentList = memberModifyService.memberModifyDepartmentList();
		List<MemberPositionList> memberModifyPositionList = memberModifyService.memberModifyPositionList();
		List<MemberList> memberModifyList = memberModifyService.memberModifyList();
		MemberList memberListOne = memberListService.memberlistOne(memberNum);
		
		model.addAttribute("title","사원수정화면");
		model.addAttribute("memberModifyList", memberModifyList);
		model.addAttribute("memberListOne", memberListOne);
		model.addAttribute("memberModifyDepartmentList" ,memberModifyDepartmentList);
		model.addAttribute("memberModifyPositionList" ,memberModifyPositionList);
	return "member/member_admin_modify";
	}
	
	
}
