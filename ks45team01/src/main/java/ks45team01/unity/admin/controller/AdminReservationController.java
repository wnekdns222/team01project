package ks45team01.unity.admin.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/reservation")
public class AdminReservationController {


	//회의실 관리 첫 화면
	@GetMapping("/meetingroomList")
	public String addMeetingroom() {

		return "reservation/meetingroom_list";
	}
	
}
