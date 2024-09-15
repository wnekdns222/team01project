package ks45team01.unity.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.dto.FileBoardCate;
import ks45team01.unity.service.FileBoardService;

@Controller
@RequestMapping("/fileBoardCate")
public class AdminFileBoardCateController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminFileBoardCateController.class);

	private final FileBoardService fileBoardService;
	public AdminFileBoardCateController(FileBoardService fileBoardService) {
		this.fileBoardService = fileBoardService;
	}
	
	@GetMapping("/fileBoardCateDelete")
	public String fileBoardCateDelete(@RequestParam(value = "fileCategoryCode", required = false) String fileCategoryCode) {
		
		fileBoardService.fileBoardCateDelete(fileCategoryCode);
		
		return "redirect:/fileBoardCate/fileBoardCateDeleteCheck";
	}
	
	@GetMapping("/fileBoardCateDeleteCheck")
	public String fileBoardCateDeleteCheck(Model model) {
		
		model.addAttribute("title", "삭제확인");
		
		return "fileBoardCate/fileBoardCateDeleteCheck";
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
		
		List<FileBoard> fileBoardCateList = fileBoardService.fileBoardCatePartList();
		
		model.addAttribute("title", "파일게시글 카테고리 목록");
		model.addAttribute("fileBoardCateList", fileBoardCateList);
		
		return "fileBoardCate/fileBoardCateList";
	}
	
	@GetMapping("/ajaxModify")
	@ResponseBody
	public List<FileBoardCate> ajaxModify(@RequestParam(value = "fileCategoryCode", required = false) String fileCategoryCode) {
		
		List<FileBoardCate> ajaxModify = fileBoardService.result(fileCategoryCode);
		
		return ajaxModify;
	}
		
}
