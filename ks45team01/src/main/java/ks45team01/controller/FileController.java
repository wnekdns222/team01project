package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@GetMapping("/fileUpdate")
	public String fileUpdate(Model model) {
		
		model.addAttribute("title", "파일수정");
		
		return "file/fileUpdate";
	}
	
	@GetMapping("/fileView")
	public String fileView(Model model) {
		
		model.addAttribute("title", "파일상세보기");
		
		return "file/fileView";
	}
	
	/**
	 * 파일 등록
	 * @param model
	 * @return
	 */
	
	@GetMapping("/addFile")
	public String addFile(Model model) {
		
		model.addAttribute("title", "파일등록");
		
		return "file/addFile";
	}
	
	/**
	 * 파일 목록 
	 * @param model
	 * @return
	 */
	
	@GetMapping("fileList")
	public String fileList(Model model) {
		
		model.addAttribute("title", "파일목록");
		
		return "file/fileList";
	}
}
