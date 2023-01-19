package ks45team01.unity.worker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.FormBoard;
import ks45team01.unity.service.FormBoardService;

@Controller
@RequestMapping("/form")
public class FormController {

	private final FormBoardService formBoardService;

	public FormController(FormBoardService formBoardService) {
		this.formBoardService = formBoardService;
	}
	
	@GetMapping("/formDelete")
	public String deleteFormBoard(int formNum) {
		
		formBoardService.deleteFormBoard(formNum);
		
		return "redirect:/form/formList"; 
	}
	
	@PostMapping("/formUpdate")
	public String updateFormBoard(FormBoard formBoard) {
	  
		formBoardService.updateFormBoard(formBoard);
		  
		return "redirect:/form/formList";
	}
	  


	@GetMapping("/formUpdate")
	public String updateFormBoardForm(Model model
									 ,@RequestParam(value = "formNum", required = false) int formNum) {

		FormBoard formUpdate = formBoardService.formView(formNum);

		model.addAttribute("title", "서식 수정");
		model.addAttribute("formUpdate", formUpdate);

		return "form/formUpdate";
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
	public String formView(Model model, int formNum) {

		FormBoard formView = formBoardService.formView(formNum);

		model.addAttribute("title", "서식상세보기");
		model.addAttribute("formView", formView);

		return "/form/formView";
	}
	/**
	 * 페이징처리 및 서식 목록 조회
	 * @param model
	 * @param currentPage
	 * @param searchKey
	 * @param searchValue
	 * @return
	 */
	@GetMapping("/formList")
	public String formList(Model model
							,@RequestParam(value="currentPage", required = false, defaultValue="1") int currentPage
							,@RequestParam(value="searchKey", required = false) String searchKey
			   				,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue) {

		int cnt = formBoardService.formBoardCount();
		List<FormBoard> formList = formBoardService.fomeList(searchKey, searchValue);
		Map<String, Object> paramMap = formBoardService.formListPage(currentPage);
		
		int lastPage = (int) paramMap.get("lastPage");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");
		if(paramMap.get("formListPage") != null) formList = (List<FormBoard>) paramMap.get("formListPage");
		// Map에서 List를 꺼내 오지 않아서 위와 같은 조건문으로 꺼내왔습니다.


		model.addAttribute("title", "서식목록");
		model.addAttribute("cnt", cnt);
		model.addAttribute("formList", formList);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);

		return "form/formList";
	}
}
