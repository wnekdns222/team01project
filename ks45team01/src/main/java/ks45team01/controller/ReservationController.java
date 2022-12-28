package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	//예약하기
	@GetMapping("/meetingroomReservationInsert")
	public String addMeetingroomReservation() {
		
		return "/reservation/meetingroom_reservation_insert";
	}
	
	//예약확인
	@GetMapping("/meetingroomReservationList")
	public String getMeetingroomReservationList() {
		
		return "/reservation/meetingroom_reservation_list";
	}
	
}
