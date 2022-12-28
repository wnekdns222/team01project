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
	
}
