package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.service.FileBoardService;

@Controller
@RequestMapping("/fileBoard")
public class FileBoardController {
		
	
	private final FileBoardService fileBoardService;
	public FileBoardController(FileBoardService fileBoardService) {
		this.fileBoardService = fileBoardService;
	}
	
	
	@GetMapping("/fileBoardDelete")
	public String fileDelete(String fileBoardNum) {
		
		fileBoardService.boardFileDelete(fileBoardNum);
		
		return "redirect:/file/fileList";
	}
	
	/**
	 * 파일 수정 처리과정
	 * @param fileBoard
	 * @return
	 */
	@PostMapping("/fileBoardUpdate")
	public String fileBoardUpdate(FileBoard fileBoard) {
		
		fileBoardService.boardFileUpdate(fileBoard);
		
		return "redirect:/file/fileList";
	}
	
	/**
	 * 파일 수정
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileBoardUpdate")
	public String fileUpdateForm(@RequestParam(value = "fileBoardNum", required = false) String fileBoardNum
							,Model model) {
		
		FileBoard boardFileView = fileBoardService.boardFileView(fileBoardNum);
		
		model.addAttribute("title", "파일게시글수정");
		model.addAttribute("boardFileView", boardFileView);
		
		return "fileBoard/fileBoardUpdate";
	}
	
	/**
	 * 파일 상세보기
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileBoardView")
	public String fileView(String fileBoardNum
						  ,Model model) {
		
		FileBoard boardFileView = fileBoardService.boardFileView(fileBoardNum);
		
		model.addAttribute("title", "파일상세보기");
		model.addAttribute("boardFileView", boardFileView);
		
		return "fileBoard/fileBoardView";
	}
	
	/**
	 * 파일 등록
	 * @param model
	 * @return
	 */
	
	@PostMapping("/addBoardFile")
	public String addBoardFile(FileBoard fileBoard) {
		
		fileBoardService.addBoardFile(fileBoard);
		
		return "redirect:/file/fileList";
	}
	
	@GetMapping("/addFileBoardForm")
	public String addFileBoardForm(Model model) {
		
		
		model.addAttribute("title", "파일게시글등록");
		
		return "fileBoard/addBoardFile";
	}
	
	@GetMapping("/{serviceType}")
	public String marketingList(@PathVariable(name="serviceType") String serviceType
								,Model model) {
		List<FileBoard> servieList = null;
		String title = null;
		if(serviceType != null) {
			switch (serviceType) {
				case "planningDept" ->{
					servieList = fileBoardService.fileServiceTypeList("file_catecode_4");
					title = "기획실";
					break;
				}
				case "managementSupportList" ->{
					servieList = fileBoardService.fileServiceTypeList("file_catecode_3");
					title = "경영지원부서";
					break;
				}
				case "marketingList" ->{
					servieList = fileBoardService.fileServiceTypeList("file_catecode_2");
					title = "마케팅부서";
					break;
				}
				case "hrList" ->{
					servieList = fileBoardService.fileServiceTypeList("file_catecode_1");
					title = "인사부서";
					break;
				}
			}
			
		}

		model.addAttribute("title", title);
		model.addAttribute(serviceType, servieList);
		
		return "fileBoard/" + serviceType;
		
	}
	
	/**
	 * 인사파일 목록 
	 * @param model
	 * @return
	 */
	/*
	@GetMapping("/hrList")
	public String ResourcesList(Model model) {
		
		List<File> hrList = fileService.hrList();
		
		model.addAttribute("title", "파일목록");
		model.addAttribute("hrList", hrList);
		
		return "file/hrList";
	}
	*/
}
