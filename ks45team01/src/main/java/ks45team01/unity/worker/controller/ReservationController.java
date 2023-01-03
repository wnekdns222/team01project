package ks45team01.unity.worker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.unity.dto.Reservation;
import ks45team01.unity.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
			
	
	private final ReservationService reservationService;
	
	public ReservationController(ReservationService reservationService){
		this.reservationService = reservationService;
	}
	
	//예약 첫 화면
	@GetMapping("/meetingroomReservationList")
	public String getMeetingroomReservationList(Model model) {
			
		List<Reservation> reservationList = reservationService.getReservationList();
		
		model.addAttribute("title", "회의실 목록");
		model.addAttribute("reservationList", reservationList);
		
		return "/reservation/meetingroom_reservation_list";
	}
	
	//예약하기 화면
	@GetMapping("/meetingroomReservationInsert")
	public String MeetingroomReservationInsert() {
		
		return "/reservation/meetingroom_reservation_insert";
	}
	
}
