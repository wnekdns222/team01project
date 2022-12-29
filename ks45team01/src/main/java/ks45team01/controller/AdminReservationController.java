package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team01.dto.Meetingroom;

@Controller
@RequestMapping("/reservation")
public class AdminReservationController {


	//회의실 추가
	@GetMapping("/meetingroomInsert")
	public String addMeetingroom() {

		return "reservation/meetingroom_insert";
	}
	
	
	//회의실 수정
	@GetMapping("/meetingroomList")
	public String modifyMeetingroom() {
			

		
		return "reservation/meetingroom_modify";
	}
	
}
