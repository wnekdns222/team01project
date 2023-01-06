package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todolist")
public class TodoController {
	
	@GetMapping("/todoList")
	public String getLogin(Model model) {   
		model.addAttribute("title", "todolist");
		
		return "todolist/todoList";
	}

}
