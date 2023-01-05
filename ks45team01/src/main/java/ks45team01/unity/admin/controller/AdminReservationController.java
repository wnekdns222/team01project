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

import ks45team01.unity.dto.Meetingroom;
import ks45team01.unity.service.ReservationService;



@Controller
@RequestMapping("/reservation")
public class AdminReservationController {

	
	private static final Logger log = LoggerFactory.getLogger(AdminReservationController.class);

	
	private final ReservationService reservationService;
	
	public AdminReservationController(ReservationService reservationService){
		this.reservationService = reservationService;
	}
	
	//회의실 관리 첫 화면
	@GetMapping("/meetingroomList")
	public String meetingroomList(Model model) {
		
		List<Meetingroom> meetingroomList = reservationService.getMeetingroomList();
		
		model.addAttribute("title", "회의실 목록");
		model.addAttribute("meetingroomList", meetingroomList);
		

		return "reservation/meetingroom_list";
	}
	
	//회의실 수정
		@GetMapping("/meetingroomModify")
		public String modifyMeetingroom(@RequestParam(value="meetNum", required=false) String meetNum,Model model) {
			
			log.info("meetingroom: {}", meetNum);
			Meetingroom meetingroom = reservationService.getMeetingroomById(meetNum);
			model.addAttribute("meetingroom", meetingroom);

			return "reservation/meetingroom_modify";
		}
		
	//회의실 수정
		@PostMapping("/meetingroomModify")
		public String modifyMeetingroom(Meetingroom meetingroom) {
			
			log.info("meetingroom: {}", meetingroom);
			reservationService.modifyMeetingroom(meetingroom);
			
			return "redirect:/reservation/meetingroomList";
		
		
		}
	//회의실 삭제
		@GetMapping("/meetingroomDelete")
		public String deleteMeetingroom(Meetingroom meetingroom) {
			
			reservationService.deleteMeetingroom(meetingroom);
			
			return "redirect:/reservation/meetingroomList";
			
		}
	
}
