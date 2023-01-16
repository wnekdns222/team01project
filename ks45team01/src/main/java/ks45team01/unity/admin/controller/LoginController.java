package ks45team01.unity.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.mapper.LoginMapper;
import ks45team01.unity.service.LoginService;

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	private final LoginService loginService;
	private final LoginMapper loginMapper;
	
	public LoginController(LoginService loginservice, LoginMapper loginMapper) {
		this.loginService  = loginservice;
		this.loginMapper = loginMapper;
	}

//	@PostMapping("/loginMain")
//	public String login(	@RequestParam(name="memberNum") String memberNum
//							   ,@RequestParam(name="memberPw") String memberPw
//							   ,RedirectAttributes reAttr
//							   ,HttpSession session
//							   ,HttpServletRequest request
//							   ,HttpServletResponse response) {
//		
//		log.info("memberId : {}, memberPw : {}", memberNum, memberPw);
//		
//		Map<String,Object> checkResult = LoginService.checkPwByMemberId(memberNum, memberPw);
//		
//		boolean isChecked = (boolean) checkResult.get("result");
//		
//		String redirectURI = "redirect:/";
//		
//		// 1. 비밀번호가 일치하지 않을 시에는 로그인 폼으로 리다이렉트
//		// /member/removeMember?memberId=id001
//		if(!isChecked) {			
//			redirectURI = "redirect:/member/login";
//			reAttr.addAttribute("msg", "입력하신 회원의 정보가 일치하지 않습니다.");
//		}else {
//			// 2. 비밀번호 일치 시 세션 저장 
//			Member member = (Member) checkResult.get("memberInfo");
//			session.setAttribute("SID", 		memberNum);
//			session.setAttribute("SPOSITION", departmentNum());
//			session.setAttribute("SNAME", getMemberName());
//			session.setAttribute("SDEPARTMENT", getMemberDepartmentNum());
//			
//		}
//		return redirectURI;
//	}
//	
	@GetMapping("/loginMain")
	public String login(Model model
							  ,@RequestParam(value="msg", required = false) String msg) {
		
		model.addAttribute("title","로그인");
		if(msg != null) model.addAttribute("msg", msg);
		
		return "login/login";
	}

			//로그인 화면(회원가입 화면)
			@GetMapping("/loginInsert")
			public String getLoginInsert(Model model) {   
				model.addAttribute("title", "회원가입화면");
				
				return "login/loginInsert";
			}
			
			//회원 가입 
			@PostMapping("/loginInsert")
			public String getLoginInsert(MemberList memberList) {
				
				loginService.addMember(memberList);
				
				return "redirect:/Login/loginMain";
			}
			
			//회원가입 아이디 유효성 검사
			@GetMapping("/checkId")
			@ResponseBody
			public boolean checkMemberNum(@RequestParam(value="memberNum") String memberNum) {
				boolean isChecked = false;
				
				isChecked = loginMapper.checkMemberNum(memberNum);
				
				return isChecked;
			}
			
//			@GetMapping("/logout")
//			public String logout(HttpSession session) {
//				
//				session.invalidate();
//				
//				return "redirect:/member/login";
//			}
//			
//			
//			
//			@GetMapping("/loginHistory")
//			@SuppressWarnings("unchecked")
//			public String getLoginHistory(Model model
//													 ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage) {
//				
//				Map<String, Object> paramMap = LoginService.getLoginHistory(currentPage);
//				int lastPage = (int) paramMap.get("lastPage");
//				List<LoginHistory> loginHistory = (List<LoginHistory>) paramMap.get("loginHistory");
//				int startPageNum = (int) paramMap.get("startPageNum");
//				int endPageNum = (int) paramMap.get("endPageNum");
//				
//				model.addAttribute("title", "로그인이력");
//				model.addAttribute("currentPage", currentPage);
//				model.addAttribute("loginHistory", loginHistory);
//				model.addAttribute("lastPage", lastPage);
//				model.addAttribute("startPageNum", startPageNum);
//				model.addAttribute("endPageNum", endPageNum);
//				
//				return "login/loginHistory";
//			}
//			
			
}
