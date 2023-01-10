package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.CommunityBoard;
import ks45team01.unity.service.CommunityBoardService;

@Controller
@RequestMapping("/community")
public class CommunityController {
	
		private final CommunityBoardService communityBoardService;
		public CommunityController(CommunityBoardService communityBoardService) {
			this.communityBoardService = communityBoardService;
		}
	
		//공지사항 화면 Notice
		@GetMapping("/noticeList")
		public String getNotice (Model model) {   
			model.addAttribute("title", "공지사항 화면");
			
			return "community/noticeList";
		}
		//공지사항 등록화면 Notice
		@GetMapping("/noticeInsert")
		public String noticeInsert(Model model) {   
			model.addAttribute("title", "공지사항 등록 화면");
			
			return "community/noticeInsert";
		}
		
		@GetMapping("/boardDetail")
		public String boardDetail(@RequestParam(value = "boardCode", required = false) String boardCode
								 ,Model model) {
			
			CommunityBoard boardDetail = communityBoardService.communityBoardDetail(boardCode);
			
			model.addAttribute("title", "게시판 상세 화면");
			model.addAttribute("boardDetail", boardDetail);
			
			return "community/boardDetail";
			
		}
		
		//게시판 화면 Board
		@GetMapping("/boardList")
		public String getBoard(Model model) { 
			
			List<CommunityBoard> communityBoardList = communityBoardService.communityBoardList();
			
			model.addAttribute("title", "게시판 화면");
			model.addAttribute("communityBoardList", communityBoardList);
			
			return "community/boardList";
		}
		//게시판 등록화면 Board
		@GetMapping("/boardInsert")
		public String boardInsert(Model model) {  
			
			List<CommunityBoard> communityBoardList = communityBoardService.communityBoardList();
			
			model.addAttribute("title", "게시판 등록 화면");
			model.addAttribute("communityBoardList", communityBoardList);
			
			return "community/boardInsert";
		}
		
		@PostMapping("/boardInsert")
			public String communityBoardAdd(CommunityBoard communityBoard) {
				
				communityBoardService.communityBoardAdd(communityBoard);
				
				return "redirect:/community/boardList";
		}
	}



