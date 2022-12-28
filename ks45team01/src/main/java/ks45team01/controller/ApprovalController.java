package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	
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
		
		return "approval/circularList";
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
