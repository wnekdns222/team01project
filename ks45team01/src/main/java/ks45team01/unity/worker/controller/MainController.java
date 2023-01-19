package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	@GetMapping("/")
	public String login(Model model) {
		return "redirect:/Login/loginMain";
	}
	
	@GetMapping("/main")
	public String main(Model model) {
		return "main";
	}
}
