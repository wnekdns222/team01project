package ks45team01.unity.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.unity.dto.MajorCateGory;
import ks45team01.unity.service.MajorCategoryService;

@Controller
@RequestMapping("/manageCate")
public class AdminMajorCateGoryController {
	
	private final MajorCategoryService majorCategoryService;
	public AdminMajorCateGoryController(MajorCategoryService majorCategoryService) {
		this.majorCategoryService = majorCategoryService;
	}
	
	@GetMapping("/majorCateList")
	public String majorCateList(Model model) {
		
		List<MajorCateGory> majorCateList = majorCategoryService.majorCateList();
		
		model.addAttribute("title", "대분류 카테고리 리스트");
		model.addAttribute("majorCateList", majorCateList);
		
		
		return "manageCate/majorCateList";
	}
}
