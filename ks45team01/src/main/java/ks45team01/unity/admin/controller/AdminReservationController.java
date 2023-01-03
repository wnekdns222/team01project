package ks45team01.unity.admin.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/reservation")
public class AdminReservationController {


	//회의실 추가
	@GetMapping("/meetingroomInsert")
	public String addMeetingroom() {

		return "reservation/meetingroom_insert";
	}
	
	
	//회의실 수정
	@GetMapping("/meetingroomAdminList")
	public String getMeetingroomAdminList() {
			

		
		return "reservation/meetingroom_admin_list";
	}
	
}
