package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {
	
	@GetMapping("/formList")
	public String getFormList(Model model) {
		
		model.addAttribute("title", "서식목록");
		
		return "form/formList";
	}
}
