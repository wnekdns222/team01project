package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/community")
public class CommunityController {

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
		//게시판 화면 Board
		@GetMapping("/boardList")
		public String getBoard(Model model) {   
			model.addAttribute("title", "게시판 화면");
			
			return "community/boardList";
		}
		//게시판 등록화면 Notice
		@GetMapping("/boardInsert")
		public String boardInsert(Model model) {   
			model.addAttribute("title", "게시판 등록 화면");
			
			return "community/boardInsert";
		}

}
