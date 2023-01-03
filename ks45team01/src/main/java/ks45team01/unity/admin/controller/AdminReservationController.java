package ks45team01.unity.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.unity.dto.Meetingroom;
import ks45team01.unity.service.ReservationService;



@Controller
@RequestMapping("/reservation")
public class AdminReservationController {

	
	private final ReservationService reservationService;
	
	public AdminReservationController(ReservationService reservationService){
		this.reservationService = reservationService;
	}
	
	//회의실 관리 첫 화면
	@GetMapping("/meetingroomList")
	public String MeetingroomList(Model model) {
		
		List<Meetingroom> meetingroomList = reservationService.getMeetingroomList();
		
		model.addAttribute("title", "회의실 목록");
		model.addAttribute("meetingroomList", meetingroomList);
		

		return "reservation/meetingroom_list";
	}
	
}
