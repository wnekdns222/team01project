package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.unity.dto.FormBoard;
import ks45team01.unity.service.FormBoardService;

@Controller
@RequestMapping("/form")
public class FormController {
	
	private final FormBoardService formBoardService;
	public FormController(FormBoardService formBoardService) {
		this.formBoardService = formBoardService;
	}
	
	@PostMapping("/formUpdate")
	public String updateFormBoard(FormBoard formBoard) {
		
		formBoardService.updateFormBoard(formBoard);
		
		return "redirect:/form/formList";
	}
	
	@PostMapping("/addForm")
	public String addFormBoard(FormBoard formBoard) {
		
		formBoardService.addFormBoard(formBoard);
		
		return "redirect:/form/formList";
	}
	
	@GetMapping("/addForm")
	public String addFormBoardForm(Model model) {
		
		model.addAttribute("title", "서식등록");
		
		return "/form/addForm";
	}
	
	@GetMapping("/formView")
	public String formView(Model model
						  ,int formNum) {
		
		FormBoard formView = formBoardService.formView(formNum);
		
		model.addAttribute("title", "서식상세보기");
		model.addAttribute("formView", formView);
		
		return "/form/formView";
	}
	
	@GetMapping("/formList")
	public String formList(Model model) {
		
		int cnt = formBoardService.formBoardCount();
		List<FormBoard> formList = formBoardService.formList();
		
		model.addAttribute("title", "서식목록");
		model.addAttribute("cnt", cnt);
		model.addAttribute("formList", formList);
		
		return "form/formList";
	}
}
