package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	
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
