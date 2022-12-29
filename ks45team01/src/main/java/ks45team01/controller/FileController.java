package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@GetMapping("fileList")
	public String fileList(Model model) {
		
		model.addAttribute("title", "파일목록");
		
		return "file/fileList";
	}
}
