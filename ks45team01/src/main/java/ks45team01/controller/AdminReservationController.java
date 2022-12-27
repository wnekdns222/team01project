package ks45team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminReservationController {

	
	
	@PostMapping("/meetingroomInsert")
	public String addMeetingroom() {  
		
		
		return "redirect:/Meetingroom/MeetingroomList";
	}
	//회의실 추가
	@GetMapping("/meetingroomInsert")
	public String addMeetingroom(Model model) {
		
//		List<MemberLevel> memberLevelList = memberService.getMemberLevelList();
//		
//		model.addAttribute("title", "회원가입");
//		model.addAttribute("memberLevelList", memberLevelList);
		
		return "reservation/addMeetingroom";
	}
	
}
