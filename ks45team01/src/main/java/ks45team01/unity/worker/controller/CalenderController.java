package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/calender")
public class CalenderController {
	//캘린더
		@GetMapping("calender/scheduel")
		public String getScheduel(Model model) {   
			model.addAttribute("title", "메인화면");
			
			return "calender/scheduel";
		}

}
