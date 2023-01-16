package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team01.unity.dto.CommunityBoard;
import ks45team01.unity.dto.CommunityNotice;
import ks45team01.unity.service.CommunityBoardService;
import ks45team01.unity.service.CommunityNoticeService;

@Controller
@RequestMapping("/community")
public class CommunityController {
	
		private final CommunityBoardService communityBoardService;
		private final CommunityNoticeService communityNoticeService; 
		
		public CommunityController(CommunityBoardService communityBoardService, CommunityNoticeService communityNoticeService) {
			this.communityBoardService = communityBoardService;
			this.communityNoticeService = communityNoticeService;
		}
		/**
		 * 공지사항 삭제 
		 * @param noticeCode
		 * @return
		 */
		@GetMapping("/noticeDelete")
		public String noticeDelete(String noticeCode) {
			communityNoticeService.communityNoticeDelete(noticeCode);
			
			return "redirect:/community/noticeList";
		}
		/**
		 * 공지사항 수정 처리
		 * @param communityNotice
		 * @return
		 */
		@PostMapping("/noticeModify")
		public String noticeModify(CommunityNotice communityNotice) {
			communityNoticeService.communityNoticeModify(communityNotice);
			
			return "redirect:/community/noticeList";
		}
		
		
		/**
		 * 공지사항 수정 
		 * @param noticeCode
		 * @param model
		 * @return
		 */
		@GetMapping("/noticeModify")
		public String noticeModifyForm (@RequestParam(value = "noticeCode", required = false) String noticeCode
								   ,Model model) {
			
			CommunityNotice noticeDetail = communityNoticeService.communityNoticeDetail(noticeCode);
			
			List<CommunityNotice> noticeList = communityNoticeService.noticeList();
			System.out.println(noticeList);
			
			model.addAttribute("title", "공지사항 수정 화면");
			model.addAttribute("noticeDetail", noticeDetail);
			model.addAttribute("noticeList", noticeList);
			
			return "community/noticeModify";
		}
		
		/**
		 * 공지사항 상세 화면
		 * @param noticeCode
		 * @param model
		 * @return
		 */
		@GetMapping("/noticeDetail")
		public String noticeDetail(@RequestParam(value = "noticeCode", required = false) String noticeCode
								 ,Model model) {
			
			CommunityNotice noticeDetail = communityNoticeService.communityNoticeDetail(noticeCode);
			
			model.addAttribute("title", "공지사항 상세 화면");
			model.addAttribute("noticeDetail", noticeDetail);
			
			return "community/noticeDetail";
			
		}
		
		/**
		 * 공지사항 리스트 조회
		 * @param model
		 * @return
		 */
		@GetMapping("/noticeList")
		public String getNotice(@RequestParam(value="searchKey", required = false) String searchKey
   								,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue
								,Model model) { 
			
			List<CommunityNotice> communityNoticeList = communityNoticeService.getNoticeCode(searchKey, searchValue);			
			
			model.addAttribute("title", "공지사항 화면");
			model.addAttribute("communityNoticeList", communityNoticeList);
			
			return "community/noticeList";
		}
		
		/**
		 * 공지사항 등록
		 * @param model
		 * @return
		 */
		@GetMapping("/noticeInsert")
		public String noticeInsert(Model model) {  
			
			List<CommunityNotice> communityNoticeList = communityNoticeService.communityNoticeList();
			
			model.addAttribute("title", "공지사항 등록 화면");
			model.addAttribute("communityNoticeList", communityNoticeList);
			
			return "community/noticeInsert";
		}
		
		/**
		 * 공지사항 등록 처리
		 * @param communityNotice
		 * @return
		 */
		@PostMapping("/noticeInsert")
			public String communityNoticeAdd(CommunityNotice communityNotice) {
				
				communityNoticeService.communityNoticeAdd(communityNotice);
				
				return "redirect:/community/noticeList";
		}
		/**
		 * 게시판 삭제 
		 * @param boardCode
		 * @return
		 */
		@GetMapping("/boardDelete")
		public String boardDelete(String boardCode) {
			communityBoardService.communityBoardDelete(boardCode);
			
			return "redirect:/community/boardList";
		}
		/**
		 * 게시판 수정 처리
		 * @param communityBoard
		 * @return
		 */
		@PostMapping("/boardModify")
		public String boardModify(CommunityBoard communityBoard) {
			communityBoardService.communityBoardModify(communityBoard);
			
			return "redirect:/community/boardList";
		}
		
		/**
		 * 게시판 수정 
		 * @param boardCode
		 * @param model
		 * @return
		 */
		@GetMapping("/boardModify")
		public String boardModifyForm (@RequestParam(value = "boardCode", required = false) String boardCode
								   ,Model model) {
			
			CommunityBoard boardDetail = communityBoardService.communityBoardDetail(boardCode);
			model.addAttribute("title", "게시판 수정 화면");
			model.addAttribute("boardDetail", boardDetail);
			
			return "community/boardModify";
		}
		
		/**
		 * 게시판 상세 화면
		 * @param boardCode
		 * @param model
		 * @return
		 */
		@GetMapping("/boardDetail")
		public String boardDetail(@RequestParam(value = "boardCode", required = false) String boardCode
								 ,Model model) {
			
			CommunityBoard boardDetail = communityBoardService.communityBoardDetail(boardCode);
			
			model.addAttribute("title", "게시판 상세 화면");
			model.addAttribute("boardDetail", boardDetail);
			
			return "community/boardDetail";
			
		}
		
		/**
		 * 게시판 리스트 조회
		 * @param model
		 * @return
		 */
		@GetMapping("/boardList")
		public String getBoard(Model model) { 
			
			List<CommunityBoard> communityBoardList = communityBoardService.communityBoardList();
			
			model.addAttribute("title", "게시판 화면");
			model.addAttribute("communityBoardList", communityBoardList);
			
			return "community/boardList";
		}
		
		/**
		 * 게시판 등록
		 * @param model
		 * @return
		 */
		@GetMapping("/boardInsert")
		public String boardInsert(Model model) {  
			
			List<CommunityBoard> communityBoardList = communityBoardService.communityBoardList();
			
			model.addAttribute("title", "게시판 등록 화면");
			model.addAttribute("communityBoardList", communityBoardList);
			
			return "community/boardInsert";
		}
		
		/**
		 * 게시판 등록 처리
		 * @param communityBoard
		 * @return
		 */
		@PostMapping("/boardInsert")
			public String communityBoardAdd(CommunityBoard communityBoard) {
				
				communityBoardService.communityBoardAdd(communityBoard);
				
				return "redirect:/community/boardList";
		}
	}



