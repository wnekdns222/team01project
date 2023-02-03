package ks45team01.unity.worker.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks45team01.unity.dto.Approval;
import ks45team01.unity.dto.ApprovalLine;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.VacationApproval;
import ks45team01.unity.dto.VacationType;
import ks45team01.unity.dto.WorkCorrectApproval;
import ks45team01.unity.mapper.VacationMapper;
import ks45team01.unity.service.ApprovalService;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ApprovalController.class);

	private final ApprovalService approvalService;
	private final VacationMapper vacationMapper;
	
	public ApprovalController(ApprovalService approvalService,VacationMapper vacationMapper) {
		this.approvalService = approvalService;
		this.vacationMapper = vacationMapper;
	}
	/**
	 * 근태정정신청
	 * @param model
	 * @return
	 */
	@GetMapping("/workCorrectInsert")
	public String workCorrectInsert(Model model) {
		
		model.addAttribute("title", "근태정정신청");
		
		return "approval/workCorrectInsert";
	}
	
	@PostMapping("/workCorrectInsert")
	public String workCorrectInsert(WorkCorrectApproval workCorrectApproval
								   ,@RequestParam(value="attendanceDay", required=false)String attendanceDay
								   ,RedirectAttributes reAttr) {
		
		reAttr.addAttribute("registrantNum", workCorrectApproval.getMemberNum());
		approvalService.addWorkCorrectApproval(workCorrectApproval, attendanceDay);
		return "redirect:/approval/draftList";
	}
	/**
	 * 휴가 신청
	 * @param model
	 * @return
	 */
	
	@GetMapping("/vacationInsert")
	public String vacationInsert(Model model) {
		List<MemberList> memberList = vacationMapper.getMemberList();
		List<VacationType> vacationTypeList = vacationMapper.getVacationType();
		model.addAttribute("title", "휴가신청");
		model.addAttribute("memberList", memberList);
		model.addAttribute("vacationTypeList", vacationTypeList);
		return "approval/vacationInsert";
	}
	@PostMapping("/vacationInsert")
	public String vacationInsert(VacationApproval vacationApproval) {
		approvalService.addVacationApproval(vacationApproval);
		return "redirect:/approval/draftList";
	}
	/**
	 * 전결/대결 리스트
	 * @param model
	 * @return
	 */
	@GetMapping("/finalApproverList")
	public String finalApproverList(Model model) {
		
		model.addAttribute("title", "전결/대결 리스트");
		
		return "approval/finalApproverList";
	}
	/**
	 * 기안 작성 페이지
	 * @param model
	 * @return
	 */
	@PostMapping("/draftInsert")
	public String draftInsert(Approval approval
							 ,RedirectAttributes reAttr
							 ,String approvalLineNum
							 ,String draftDocNum, @RequestParam(name="approvalMemberNum", required = false) String[] approvalMemberNums) {
		
		if(approvalMemberNums != null) {
			List<ApprovalLine> approvalLineList = new ArrayList<ApprovalLine>();
			ApprovalLine approvalLine = null;
			for(String approvalMemberNum : approvalMemberNums) {
				approvalLine = new ApprovalLine();
				approvalLine.setDraftDocNum(draftDocNum);
				approvalLine.setApprovalLineNum(approvalLineNum);
				approvalLine.setApprovalMemberNum(approvalMemberNum);
				approvalLineList.add(approvalLine);
			}
			approvalService.addDraftInsert(approval);
			approvalService.addApprovalMember(approvalLineList);
			
		}
		reAttr.addAttribute("registrantNum", approval.getRegistrantNum());
		return "redirect:/approval/draftList";
	}
	
	@GetMapping("/draftInsert")
	public String draftInsertForm(Model model) {
		
		model.addAttribute("title", "기안작성");
		
		return "approval/draftInsert";
	}
	
	@PostMapping("/odInsert")
	public String odInsert(Approval approval) {
		
		approvalService.addDraftInsert(approval);
		return "redirect:/approval/draftList";
	}
	@GetMapping("/odInsert")
	public String odInsertForm(Model model) {
		
		model.addAttribute("title", "공문작성");
		
		return "approval/odInsert";
	}
	
	@PostMapping("/proposalInsert")
	public String proposalInsert(Approval approval) {
		
		approvalService.addDraftInsert(approval);
		return "redirect:/approval/draftList";
	}
	
	
	@GetMapping("/proposalInsert")
	public String proposalInsertForm(Model model) {
		
		model.addAttribute("title", "기획작성");
		
		return "approval/proposalInsert";
	}
	
	@PostMapping("/letterApprovalInsert")
	public String letterApprovalInsert(Approval approval) {
		
		approvalService.addDraftInsert(approval);
		return "redirect:/approval/draftList";
	}
	
	@GetMapping("/letterApprovalInsert")
	public String letterApprovalInsertForm(Model model) {
		
		model.addAttribute("title", "품의서작성");
		
		return "approval/letterApprovalInsert";
	}
	
	@GetMapping("/approvalDoneView")
	public String approvalDoneView(@RequestParam(value = "draftDocNum", required = false) String draftDocNum
								  ,Model model) {
		
		Approval approvalDoneList = approvalService.draftView(draftDocNum);
		model.addAttribute("title", "결재완료상세보기");
		model.addAttribute("approvalDoneList", approvalDoneList);
		
		return "approval/approvalDoneView";
	}
	
	@PostMapping("/approvalView")
	public String approvalDoneProcess(String approvalProcessNum, String draftDocNum, String processStatus) {
		
		approvalService.approvalApprove(draftDocNum, processStatus);
		approvalService.approvalDoneProcess(approvalProcessNum, draftDocNum);
		
		return "redirect:/approval/approvalList";
	}
	
	/**
	 * 결재완료함 
	 * @param model
	 * @return
	 */
	
	@GetMapping("/approvalDoneList")
	public String approvalDoneList(Model model) {
		
		List<Approval> approvalDoneList = approvalService.approvalDoneList();
		model.addAttribute("title", "결재완료함");
		model.addAttribute("approvalDoneList", approvalDoneList);
		
		return "approval/approvalDoneList";
	}
	
	@GetMapping("/approvalView")
	public String approvalView(String draftDocNum
							  ,Model model) {
		Approval draftView = approvalService.draftView(draftDocNum);
		model.addAttribute("title", "결재상세페이지");
		model.addAttribute("draftView", draftView);
		
		return "approval/approvalView";
	}
	/**
	 * 결재함 리스트 
	 * @param model
	 * @return
	 */
	
	@GetMapping("/approvalList")
	public String approvalList(Model model) {
		
		List<Approval> approvalList = approvalService.approvalList();
		model.addAttribute("title", "결재함");
		model.addAttribute("approvalList", approvalList);
		
		return "approval/approvalList";
	}
	
	/**
	 * 반려함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("/rejectList")
	public String rejectList(Model model) {
		
		List<Approval> rejectList = approvalService.rejectList();
		model.addAttribute("title", "반려함");
		model.addAttribute("rejectList", rejectList);
		
		return "approval/rejectList";
	}
	@GetMapping("/rejectView")
	public String rejectView(@RequestParam(value = "draftDocNum", required = false) String draftDocNum
							,Model model) {
		
		Approval rejectView = approvalService.rejectView(draftDocNum);
		model.addAttribute("title", "반려문서");
		model.addAttribute("rejectView", rejectView);
		
		return "approval/rejectView";
	}
	
	/**
	 * 회람함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("/circularList")
	public String circularList(Model model) {
		
		model.addAttribute("title", "회람함");
		
		return "approval/circularList";
	}
	
	@GetMapping("/referrerView")
	public String referrerView(Model model) {
		
		model.addAttribute("title", "참조문서 상세보기");
		
		return "approval/referrerView";
	}
	/**
	 * 참조함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("/referrerList")
	public String referrerList(Model model) {
		
		model.addAttribute("title", "참조함");
		
		return "approval/referrerList";
	}
	/**
	 * 수신문서 상세보기 
	 * @param model
	 * @return
	 */
	@GetMapping("/receiverView")
	public String receiverView(Model model) {
		
		model.addAttribute("title", "수신문서 상세보기");
		
		return "approval/receiverView";
	}
	
	/**
	 * 수신함 리스트
	 * @param model
	 * @return
	 */
	
	@GetMapping("/receiverList")
	public String receiverList(Model model) {
		
		model.addAttribute("title", "수신함");
		
		return "approval/receiverList";
	}
	
	/**
	 * 기안문서 상세보기
	 * @param model
	 * @return
	 */
	
	@GetMapping("/draftView")
	public String draftView(String draftDocNum
						   ,Model model) {
		
		Approval draftView = approvalService.draftView(draftDocNum);
		model.addAttribute("title", "기안상세보기");
		model.addAttribute("draftView", draftView);
		
		return "approval/draftView";
	}
	@PostMapping("/draftView")
	public String addRejectReason(String approvalFinalState, String draftDocNum, String approvalProcessNum, String rejectReasonMember, String rejectReason, String rejectDate) {
		approvalService.addRejectReason(draftDocNum, approvalProcessNum, rejectReasonMember, rejectReason, rejectDate);
		approvalService.rejectProcess(approvalFinalState, draftDocNum);
		log.info("반려등록 : {}", approvalProcessNum, rejectReasonMember, rejectReason, rejectDate);
		return "redirect:/approval/approvalList";
	}
	
	/**
	 * 기안함 리스트
	 * @param model
	 * @return
	 */
	@GetMapping("/draftList")
	public String draftList(Model model
						   ,@RequestParam(value = "registrantNum", required = false) String registrantNum) {

		List<Approval> draftList = approvalService.draftList(registrantNum);
		model.addAttribute("title", "기안함");
		model.addAttribute("draftList", draftList);
		
		return "approval/draftList";
	}
}
