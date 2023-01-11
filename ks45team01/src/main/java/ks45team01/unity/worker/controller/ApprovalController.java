package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	
	@GetMapping("workCorrectInsert")
	public String workCorrectInsert(Model model) {
		
		model.addAttribute("title", "근태정정신청");
		
		return "approval/workCorrectInsert";
	}
	
	/**
	 * 휴가 신청
	 * @param model
	 * @return
	 */
	
	@GetMapping("vacationInsert")
	public String vacationInsert(Model model) {
		
		model.addAttribute("title", "휴가신청");
		
		return "approval/vacationInsert";
	}
	
	/**
	 * 전결/대결 리스트
	 * @param model
	 * @return
	 */
	@GetMapping("finalApproverList")
	public String finalApproverList(Model model) {
		
		model.addAttribute("title", "전결/대결 리스트");
		
		return "approval/finalApproverList";
	}
	/**
	 * 기안 작성 페이지
	 * @param model
	 * @return
	 */
	
	@GetMapping("draftInsert")
	public String draftInsert(Model model) {
		
		model.addAttribute("title", "기안작성");
		
		return "approval/draftInsert";
	}
	
	@GetMapping("odInsert")
	public String odInsert(Model model) {
		
		model.addAttribute("title", "공문작성");
		
		return "approval/odInsert";
	}
	
	@GetMapping("proposalInsert")
	public String proposalInsert(Model model) {
		
		model.addAttribute("title", "기획작성");
		
		return "approval/proposalInsert";
	}
	
	@GetMapping("letterApprovalInsert")
	public String letterApprovalInsert(Model model) {
		
		model.addAttribute("title", "품의서작성");
		
		return "approval/letterApprovalInsert";
	}
	
	@GetMapping("approvalDoneView")
	public String approvalDoneView(Model model) {
		
		model.addAttribute("title", "결재완료상세보기");
		
		return "approval/approvalDoneView";
	}
	
	/**
	 * 결재완료함 
	 * @param model
	 * @return
	 */
	
	@GetMapping("approvalDoneList")
	public String approvalDoneList(Model model) {
		
		model.addAttribute("title", "결재완료함");
		
		return "approval/approvalDoneList";
	}
	
	/**
	 * 결재함 리스트 
	 * @param model
	 * @return
	 */
	
	@GetMapping("approvalList")
	public String approvalList(Model model) {
		
		model.addAttribute("title", "결재함");
		
		return "approval/approvalList";
	}
	
	/**
	 * 반려함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("rejectList")
	public String rejectList(Model model) {
		
		model.addAttribute("title", "반려함");
		
		return "approval/rejectList";
	}
	
	/**
	 * 회람함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("circularList")
	public String circularList(Model model) {
		
		model.addAttribute("title", "회람함");
		
		return "approval/circularList";
	}
	
	@GetMapping("referrerView")
	public String referrerView(Model model) {
		
		model.addAttribute("title", "참조문서 상세보기");
		
		return "approval/referrerView";
	}
	/**
	 * 참조함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("referrerList")
	public String referrerList(Model model) {
		
		model.addAttribute("title", "참조함");
		
		return "approval/referrerList";
	}
	/**
	 * 수신문서 상세보기 
	 * @param model
	 * @return
	 */
	@GetMapping("receiverView")
	public String receiverView(Model model) {
		
		model.addAttribute("title", "수신문서 상세보기");
		
		return "approval/receiverView";
	}
	
	/**
	 * 수신함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("receiverList")
	public String receiverList(Model model) {
		
		model.addAttribute("title", "수신함");
		
		return "approval/receiverList";
	}
	
	/**
	 * 기안문서 상세보기
	 * @param model
	 * @return
	 */
	
	@GetMapping("draftView")
	public String draftView(Model model) {
		
		model.addAttribute("title", "기안상세보기");
		
		return "approval/draftView";
	}
	
	/**
	 * 기안함 리스트
	 * @param model
	 * @return
	 */
	@GetMapping("/draftList")
	public String draftList(Model model) {
		
		model.addAttribute("title", "기안함");
		
		return "approval/draftList";
	}
}
