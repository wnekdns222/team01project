package ks45team01.unity.worker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.service.FileBoardService;

@Controller
@RequestMapping("/fileBoard")
public class FileBoardController {
		
	
	private final FileBoardService fileBoardService;
	public FileBoardController(FileBoardService fileBoardService) {
		this.fileBoardService = fileBoardService;
	}
	
	
	private static final Logger log = LoggerFactory.getLogger(FileBoardController.class);

	
	@GetMapping("/fileBoardDelete")
	public String fileDelete(String fileBoardNum) {
		
		fileBoardService.boardFileDelete(fileBoardNum);
		
		return "redirect:/fileBoard/fileList";
	}
	
	/**
	 * 파일 수정 처리과정
	 * @param fileBoard
	 * @return
	 */
	@PostMapping("/fileBoardUpdate")
	public String fileBoardUpdate(FileBoard fileBoard) {
		
		fileBoardService.boardFileUpdate(fileBoard);
		
		return "redirect:/fileBoard/fileList";
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
		
		log.info("fileBoardNum : {}" , fileBoardNum);
		
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
	public String addBoardFile(@RequestParam MultipartFile[] uploadfile, Model model, HttpServletRequest request
							  ,FileBoard fileBoard) {
		String serverName = request.getServerName();
		String fileRealPath = "";
		if("localhost".equals(serverName)) {				
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}else {
			// 실제 배포 파일 패스
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
				
		fileBoardService.addBoardFile(uploadfile, fileRealPath, fileBoard);
		
		return "redirect:/fileBoard/fileBoardList";
	}
	
	@GetMapping("/addBoardFile")
	public String addFileBoardForm(Model model) {
		
		List<FileBoard> fileBoardCatePartList = fileBoardService.fileBoardCatePartList();
			
		model.addAttribute("title", "파일게시글등록");
		model.addAttribute("fileBoardCatePartList", fileBoardCatePartList);
		
		return "fileBoard/addBoardFile";
	}
	
	@GetMapping("/{serviceType}")
	public String marketingList(@PathVariable(name="serviceType") String serviceType
								,Model model) {
		
		List<FileBoard> fileBoardList = fileBoardService.fileBoardList();
		
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
		model.addAttribute("fileBoardList", fileBoardList);
		
		return "fileBoard/" + serviceType;
		
	}
	
	/**
	 * 파일 전체 목록 조회
	 * @param model
	 * @return
	 */
	
	@GetMapping("/fileList")
	public String fileBoardList(Model model) {
		
		List<FileBoard> fileBoardList = fileBoardService.fileBoardList();
		
		model.addAttribute("title", "파일전체목록");
		model.addAttribute("fileBoardList", fileBoardList);
		
		return "fileBoard/fileList";
	}
}
