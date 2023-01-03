package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class LoginController {
			//로그인 화면
			@GetMapping("/loginMain")
			public String getLogin(Model model) {   
				model.addAttribute("title", "로그인화면");
				
				return "login/login";
			}
			//로그인 화면
			@GetMapping("/loginInsert")
			public String getLoginInsert(Model model) {   
				model.addAttribute("title", "회원가입화면");
				
				return "login/loginInsert";
			}
}
