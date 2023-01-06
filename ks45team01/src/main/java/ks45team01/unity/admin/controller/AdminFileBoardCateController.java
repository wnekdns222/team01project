package ks45team01.unity.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.dto.FileBoardCate;
import ks45team01.unity.service.FileBoardService;

@Controller
@RequestMapping("/fileBoardCate")
public class AdminFileBoardCateController {
	
	private final FileBoardService fileBoardService;
	public AdminFileBoardCateController(FileBoardService fileBoardService) {
		this.fileBoardService = fileBoardService;
	}
	
	@GetMapping("fileBoardCateDelete")
	public String fileBoardCateDelete(String fileCategoryCode) {
		
		fileBoardService.fileBoardCateDelete(fileCategoryCode);
		
		return "redirect:/fileBoardCate/fileBoardCateList";
	}
	
	/**
	 * 카테고리 수정 처리
	 * @param fileBoardCate
	 * @return
	 */
	@PostMapping("/fileBoardCateModify")
	public String fileBoardCateModify(FileBoardCate fileBoardCate) {
		
		fileBoardService.fileBoardCateModify(fileBoardCate);
		
		return "redirect:/fileBoardCate/fileBoardCateList";
	}
	
	/**
	 * 카테고리 수정 화면
	 * @param fileCategoryCode
	 * @param model
	 * @return
	 */
	@GetMapping("/fileBoardCateModify")
	public String fileBoardCateModifyForm(@RequestParam(value = "fileCategoryCode", required = false) String fileCategoryCode
									  ,Model model) {
		
		FileBoardCate fileBoardCateModify =  fileBoardService.fileBoardCateModifyForm(fileCategoryCode);
		
		model.addAttribute("title", "카테고리 수정");
		model.addAttribute("fileBoardCateModify", fileBoardCateModify);
		
		return "fileBoardCate/fileBoardCateModify"; 
	}
	
	/**
	 * 카테고리 등록
	 * @param fileBoardCate
	 * @return
	 */
	
	@PostMapping("/addFileBoardCate")
	public String addFileBoardCate(FileBoardCate fileBoardCate) {
		
		fileBoardService.addFileBoardCate(fileBoardCate);
		
		return "redirect:/fileBoardCate/fileBoardCateList";
	}
	
	@GetMapping("/addFileBoardCate")
	public String addFileBoardCateForm(Model model) {
		
		model.addAttribute("title", "파일카테고리 등록");
		
		return "fileBoardCate/addFileBoardCate";
	}
	
	/**
	 * 카테고리 목록 조회
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileBoardCateList")
	public String fileBoardCateList(Model model) {
		
		List<FileBoard> fileBoardCateList = fileBoardService.fileBoardCateList();
		
		model.addAttribute("title", "파일게시글 카테고리 목록");
		model.addAttribute("fileBoardCateList", fileBoardCateList);
		
		return "fileBoardCate/fileBoardCateList";
	}
}
