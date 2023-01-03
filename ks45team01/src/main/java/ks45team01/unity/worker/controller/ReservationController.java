package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
			
	//예약 첫 화면
	@GetMapping("/meetingroomReservationList")
	public String getMeetingroomReservationList() {
		
		return "/reservation/meetingroom_reservation_list";
	}
	
	//예약하기 화면
	@GetMapping("/meetingroomReservationInsert")
	public String MeetingroomReservationInsert() {
		
		return "/reservation/meetingroom_reservation_insert";
	}
	
}
