package ks45team01.unity.worker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team01.unity.dto.Meetingroom;
import ks45team01.unity.dto.Reservation;
import ks45team01.unity.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
			
	
	private static final Logger log = LoggerFactory.getLogger(ReservationController.class);

	private final ReservationService reservationService;
	
	public ReservationController(ReservationService reservationService){
		this.reservationService = reservationService;
	}
	
	//예약 첫 화면
	@GetMapping("/meetingroomReservationList")
	public String meetingroomList(Model model) {
			
		
		List<Reservation> reservationList = reservationService.getReservationList();
		List<Meetingroom> meetingroomList = reservationService.getMeetingroomList();
		
		model.addAttribute("title", "회의실 목록");
		model.addAttribute("reservationList", reservationList);
		model.addAttribute("meetingroomList", meetingroomList);
		
		return "/reservation/meetingroom_reservation_list";
	}
	
	//예약하기 화면
	@GetMapping("/meetingroomReservationInsert")
	public String insertReservation(@RequestParam(value="reservationNum",required=false) String reservationNum,Model model) {
		
		Reservation reservation = reservationService.getReservationById(reservationNum);
		List<Reservation> reservationList = reservationService.getReservationList();

		model.addAttribute("title", "회의실 목록");
		model.addAttribute("reservation", reservation);
		model.addAttribute("reservationList", reservationList);

		return "/reservation/meetingroom_reservation_insert";
	}
	
	// 예약
	@PostMapping("/meetingroomReservationInsert")
	@ResponseBody
	public String insertReservation(@RequestBody Reservation reservation) {
		
		log.info("reservation : {}", reservation);
		
		return "/reservation/meetingroomReservationList";
	}
	
	//내 예약확인화면
	@GetMapping("/meetingroomReservationMine")
	public String getReservationList(Model model) {
		
		List<Reservation> reservationList = reservationService.getReservationList();
		
		model.addAttribute("reservationList", reservationList);
		
		return "/reservation/meetingroom_reservation_mine";
	}
	
	//예약 수정화면
	@GetMapping("/meetingroomReservationModify")
	public String modifyMeetingroomReservation(@RequestParam(value="reservationNum", required=false) String reservationNum,Model model) {
		
		log.info("meetingroomReservation: {}", reservationNum);
		
		Reservation reservation = reservationService.getReservationById(reservationNum);
		
		model.addAttribute("reservation", reservation);

		return "reservation/meetingroom_reservation_modify";
	}
	
	
}
