package ks45team01.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CommunityController {

	//캘린더 화면
			@GetMapping("/scheduelList")
			public String getScheduel(Model model) {   
				model.addAttribute("title", "캘린더화면");
				
				return "calender/scheduelList";
			}
}
