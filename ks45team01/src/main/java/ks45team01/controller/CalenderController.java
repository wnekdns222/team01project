package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calender")
public class CalenderController {
		
		//캘린더 화면
		@GetMapping("/scheduelList")
		public String getScheduel(Model model) {   
			model.addAttribute("title", "캘린더화면");
			
			return "calender/scheduelList";
		}
		//캘린더 화면
		/*
		 * @GetMapping("scheduel_list") public String getScheduel(Model model) {
		 * model.addAttribute("title", "캘린더화면");
		 * 
		 * return "calender/scheduel_list"; }
		 */

}
