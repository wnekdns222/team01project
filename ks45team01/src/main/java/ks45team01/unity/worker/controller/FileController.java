package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.File;
import ks45team01.unity.service.FileService;

@Controller
@RequestMapping("/file")
public class FileController {
		
	
	private final FileService fileService;
	public FileController(FileService fileService) {
		this.fileService = fileService;
	}
	
	
	@GetMapping("/fileDelete")
	public String fileDelete(String fileNum) {
		
		fileService.fileDelete(fileNum);
		
		return "redirect:/file/fileList";
	}
	
	/**
	 * 파일 수정 처리과정
	 * @param file
	 * @return
	 */
	@PostMapping("/fileUpdate")
	public String fileUpdate(File file) {
		
		fileService.fileUpdate(file);
		
		return "redirect:/file/fileList";
	}
	
	/**
	 * 파일 수정
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileUpdate")
	public String fileUpdateForm(@RequestParam(value = "fileNum", required = false) String fileNum
							,Model model) {
		
		File fileUpdate = fileService.fileView(fileNum);
		
		model.addAttribute("title", "파일수정");
		model.addAttribute("fileUpdate", fileUpdate);
		
		return "file/fileUpdate";
	}
	
	/**
	 * 파일 상세보기
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileView")
	public String fileView(String fileNum
						  ,Model model) {
		
		File fileView = fileService.fileView(fileNum);
		
		model.addAttribute("title", "파일상세보기");
		model.addAttribute("fileView", fileView);
		
		return "file/fileView";
	}
	
	/**
	 * 파일 등록
	 * @param model
	 * @return
	 */
	
	@PostMapping("/addFile")
	public String addFile(File file) {
		
		fileService.addFile(file);
		
		return "redirect:/file/fileList";
	}
	
	@GetMapping("/addFile")
	public String addFileForm(Model model) {
		
		
		model.addAttribute("title", "파일등록");
		
		return "file/addFile";
	}
	
	@GetMapping("/{serviceType}")
	public String marketingList(@PathVariable(name="serviceType") String serviceType
								,Model model) {
		List<File> servieList = null;
		String title = null;
		if(serviceType != null) {
			switch (serviceType) {
				case "marketingList" ->{
					servieList = fileService.fileServiceTypeList("file_catecode_2");
					title = "마케팅부서";
					break;
				}
				case "hrList" ->{
					servieList = fileService.fileServiceTypeList("file_catecode_1");
					title = "인사부서";
					break;
				}
			}
			
		}

		model.addAttribute("title", title);
		model.addAttribute(serviceType, servieList);
		
		return "file/" + serviceType;
		
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
