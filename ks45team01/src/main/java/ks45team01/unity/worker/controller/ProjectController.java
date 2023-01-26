package ks45team01.unity.worker.controller;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectBoard;
import ks45team01.unity.dto.ProjectComment;
import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.dto.ProjectListPost;
import ks45team01.unity.dto.ProjectMember;
import ks45team01.unity.dto.ProjectRequest;
import ks45team01.unity.dto.ProjectUnit;
import ks45team01.unity.service.MemberListService;

import ks45team01.unity.service.ProjectService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
//리퀘스트메핑 /project로 잡음
@RequestMapping("/project")

public class ProjectController {

	
	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	/**
	 *  http://localhost/project/projectList접속시  
	 *  "project/project" 로 연결됨
	 * @param model
	 * @return
	 */
	
	private final MemberListService memberListService;
	private final ProjectService projectService;
	public ProjectController(MemberListService memberListService
							,ProjectService projectService) {
		
		this.projectService = projectService;
		this.memberListService = memberListService;
		
	}
	
/*프로젝트 홈 화면*/
	@GetMapping("/projectList")
	public String getProjectList(Model model
								,String projectNum) {
		
		//ProjectListMapper.xml 프로젝트 전체 검색문
		List<ProjectList> projectList = projectService.projectListSe();
		//ProjectListMapper.xml 프로젝트 단위업무 전체 조회문
		List<ProjectUnit> ProjectUnit = projectService.ProjectUnit();
		//ProjectListMapper.xml 프로젝트 한개 조회명령문
		ProjectList projectListOne = projectService.ProjectListOne(projectNum);
		
		model.addAttribute("projectListOne",projectListOne);
		model.addAttribute("projectList", projectList);
		model.addAttribute("ProjectUnit",ProjectUnit);
		model.addAttribute("title","프로젝트메인화면");
		return "project/project";
	}
	
	
	
	@PostMapping("/projectInsert")
	public String setProjectInsert(ProjectList projectList) {
		projectService.ProjectInsert(projectList);
		
		log.info("projectList{}:",projectList);
		
		return "redirect:/project/projectList";
	}
	
//프로젝트 등록 컨트롤러
	@GetMapping("/projectInsert")
	public String getProjectInsert(Model model
									,ProjectList projectList
								  ,HttpSession session
								  ,HttpServletRequest request) {
		String SID = (String)session.getAttribute("SID");
		
		
		log.info("SID:",SID);
		
		model.addAttribute("projectInsert","프로젝트등록화면");
		return "project/project_insert";
	}
	

//프로젝트 수정 컨트롤러
	@GetMapping("/projectModify")
	public String getProjectModify(Model model) {
		
		model.addAttribute("projectModify","프로젝트수정화면");
		return "project/project_modify";
	}
	
	
//프로젝트 멤버 리스트화면 인데 등록화면처럼 되있는데 어따 쓰이는지 모르겟음
	@GetMapping("/projectMember")
	public String getProjectMemberList(Model model) {
		model.addAttribute("projectMember","프로젝트멤버리스트화면");
	return "project/project_member";
	}
	
	
//프로젝트 인원설정 삭제 
	@RequestMapping("/projectMemberDelete")
	public String getProjectMemberDelete(@RequestParam(value="projectJoinNum") String projectJoinNum
										,@RequestParam(value="projectNum") String projectNum
										,RedirectAttributes reAttr
										) {
		
		projectService.ProjectListOne(projectNum);
		projectService.projectMemberDelete(projectJoinNum);
		log.info("프로젝트 멤버 추가 정보:{}",projectJoinNum);
		reAttr.addAttribute("projectNum", projectNum);
		
		
		return "redirect:/project/projectMemberInsert";
	}
	
	
	@PostMapping("/projectMemberInsert")
	public String getProjectMemberInsert(ProjectMember projectMember
										,String projectNum
										,RedirectAttributes reAttr
										,Model model) {
		
		projectService.ProjectListOne(projectNum);
		projectService.ProjectMemberInsert(projectMember);
		projectService.projectMemberCntUpdate(projectNum);
		log.info("프로젝트 멤버 추가 정보:{}",projectMember);
		reAttr.addAttribute("projectNum", projectNum);
		
		
		return "redirect:/project/projectMemberInsert";
	}
	
	@GetMapping("/projectMemberInsert")
	public String getProjectMemberInsertForm(String projectNum
											,Model model
											,@RequestParam(value="currentPage", required = false, defaultValue="1") int currentPage) {
		
		List<ProjectMember> projectMember = projectService.projectMemberList(projectNum);
		List<MemberDepartmentList> memberDepartmentList = projectService.memberDepartmentList();
		ProjectList projectListOne = projectService.ProjectListOne(projectNum);
		List<MemberList> memberList = projectService.memberList(null);
		int ProjectmemberCnt = projectService.ProjectmemberCnt(projectNum);
		
		
		System.out.println(projectNum + "<-- projectNum GetProjectMemberInsertForm");
		
		model.addAttribute("title","프로젝트멤버리스트등록화면");
		model.addAttribute("memberDepartmentList",memberDepartmentList);
		model.addAttribute("projectMember",projectMember);
		model.addAttribute("memberList",memberList);
		model.addAttribute("projectListOne",projectListOne);
		model.addAttribute("ProjectmemberCnt",ProjectmemberCnt);
		
		
		
	return "project/project_member_insert";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/idOverlap", method = RequestMethod.POST)
	public int projectIdCnt(String memberNum
							,String projectNum) {
		int result = projectService.projectIdCnt(memberNum, projectNum);
		return result;
	}
	
	
	
	
	@GetMapping("/projectMemberModify")
	public String GetProjectMemberModify(Model model) {
		model.addAttribute("projectMemberModify","프로젝트멤버리스트수정화면");
	return "project/project_member_modify";
	}
	
	@GetMapping("/projectUnit")
	public String GetProjectUnit(Model model) {
		model.addAttribute("projectUnit","프로젝트단위업무화면");
	return "project/project_unit";
	}
	
	@GetMapping("/projectUnitInsert")
	public String GetProjectUnitInsert(Model model) {
		
List<ProjectUnit> projectUnit = projectService.projectUnitList();
		
		
		model.addAttribute("projectUnitInsert","프로젝트단위업무등록화면");
		model.addAttribute("projectUnit",projectUnit);
	return "project/project_unit_insert";
	}
	
	@GetMapping("/projectUnitModify")
	public String GetProjectUnitModify(Model model) {
		model.addAttribute("projectUnitModify","프로젝트단위업무수정화면");
	return "project/project_unit_Modify";
	}
	
	@GetMapping("/projectUnitMemberInsert")
	public String GetProjectUnitMemberInsert(Model model) {
		model.addAttribute("projectUnitMemberInsert","프로젝트단위업무인원배정화면");
	return "project/project_unit_member_insert";
	}
	
	@GetMapping("/projectUnitMemberModify")
	public String GetProjectUnitMemberModify(Model model) {
		model.addAttribute("projectUnitMemberModify","프로젝트단위업무인원배정수정화면");
	return "project/project_unit_member_modify";
	}
	
	
	@RequestMapping("/projectCommentDelete")
		public String getProjectCommentDelete(@RequestParam(value="projectCommentNum") String projectCommentNum
																					  ,String projectNum
																					,RedirectAttributes reAttr) {
		
		projectService.projectCommentDelete(projectCommentNum);
		reAttr.addAttribute("projectNum",projectNum);
		
		return "redirect:/project/projectDetail";
	}
	
	
	@PostMapping("/projectDetail")
		public String getProjectDetail(ProjectComment ProjectComment
				 					  ,String projectNum
									  ,RedirectAttributes reAttr) {
		projectService.projectCommentInsert(ProjectComment);
		reAttr.addAttribute("projectNum", projectNum);
		
		log.info("프로젝트 댓글{}:",ProjectComment);
		
		return "redirect:/project/projectDetail";
	}
	
	
	@GetMapping("/projectDetail")
	public String GetProjectDetail(Model model
								  ,String projectNum
								  ,RedirectAttributes reAttr) {
		List<ProjectBoard> projectBoardList = projectService.projectBoardList(projectNum);
		List<ProjectRequest> projectRequestList = projectService.projectRequestList(projectNum);
		List<MemberList> memberList = memberListService.memberListSe("","");
		
		List<ProjectListPost> projectListPost = projectService.projectListPostList(projectNum);
		
		
		log.info("projectListPost : {}", projectListPost);
		
		model.addAttribute("title","프로젝트내부 디테일 화면");
		model.addAttribute("projectNum",projectNum);
		model.addAttribute("projectBoardList",projectBoardList);
		model.addAttribute("projectRequestList",projectRequestList);
		model.addAttribute("memberList",memberList);
		model.addAttribute("projectListPost",projectListPost);
	
		
		reAttr.addAttribute("projectNum", projectNum);
	return "project/project_detail";
	}
	
	@GetMapping("/project_home:: projectHomeTab1")
	public String GetProjectHome(Model model
								,String projectNum) {
		
		List<ProjectBoard> projectBoardList = projectService.projectBoardList(projectNum);
		List<ProjectRequest> projectRequestList = projectService.projectRequestList(projectNum);

		
		
		model.addAttribute("title","프로젝트내부 홈 화면");
		model.addAttribute("projectNum",projectNum);
		model.addAttribute("projectBoardList",projectBoardList);
		model.addAttribute("projectRequestList",projectRequestList);

		
		
	
	return "project/project_home";
	}
	
	
	@PostMapping("/projectBoardInsert")
	public String getProjectBoardInsert(ProjectBoard projectBoard
										,String projectNum
										,RedirectAttributes reAttr) {
		
		
		projectService.projectBoardInsert(projectBoard);
		
		System.out.println(projectBoard + "<-- projectBoard GetProjectMemberInsertForm");
		reAttr.addAttribute("projectNum", projectNum);
		return "redirect:/project/projectDetail";
		
	}
	
	@GetMapping("/projectBoardInsert")
	public String getprojectBoardInsert(Model model, @RequestParam(value="projectNum", required = false) String projectNum) {
		model.addAttribute("projectBoardInsert","프로젝트내부 게시글 생성화면");
		model.addAttribute("projectNum", projectNum);
	return "project/project_home/project_board_insert";
	}
	
	
	@PostMapping ("/projectBoardModify")
	public String setprojectBoardModify(String projectNum,
										String projectBoardTitle,
										String projectBoardContent,
										String projectBoardNum,
										String memberNum,
										RedirectAttributes reAttr
										) {
		
		
		projectService.projectboardUpdate(projectBoardTitle, projectBoardContent, projectBoardNum, memberNum);
		reAttr.addAttribute("projectNum", projectNum);
		
		
		
		return "redirect:/project/projectDetail";
	}
	
	
	@GetMapping("/projectBoardModify")
	public String getprojectBoardModify(Model model, 
									String projectNum, 
									String projectBoartNum,
									RedirectAttributes reAttr,
									HttpSession session) {
		List<ProjectBoard> projectBoardList = projectService.projectBoardList(projectNum);
		List<ProjectRequest> projectRequestList = projectService.projectRequestList(projectNum);
		List<MemberList> memberList = memberListService.memberListSe("", "");
		
		List<ProjectListPost> projectListPost = projectService.projectListPostList(projectNum);
		ProjectBoard projectBoardOne = projectService.projectBoardOne(projectBoartNum);
		String SID = (String)session.getAttribute("SID");
		
		projectBoardOne.setMemberNum(SID);

		model.addAttribute("title", "프로젝트내부 디테일 화면");
		model.addAttribute("projectNum", projectNum);
		model.addAttribute("projectBoardList", projectBoardList);
		model.addAttribute("projectRequestList", projectRequestList);
		model.addAttribute("memberList", memberList);
		model.addAttribute("projectListPost", projectListPost);
		model.addAttribute("projectBoardOne",projectBoardOne);
		
	
		reAttr.addAttribute("projectNum", projectNum);
		model.addAttribute("projectBoardModify", "프로젝트내부 게시글 수정화면");
		
		
		log.info("projectListOne : {}", projectBoardOne);
		log.info("projectListPost : {}", projectListPost);
		
		return "project/project_board_modify";
	}
	
	
	@GetMapping("/projectTaskInsert")
	public String projectTaskInsert(Model model) {
		model.addAttribute("projectTaskInsert","프로젝트내부 업무요청 등록화면");
	return "project/project_home/project_task_insert";
	}
	
	@GetMapping("/projectTaskModify")
	public String projectTaskModify(Model model) {
		model.addAttribute("projectTaskModify","프로젝트내부 업무요청 수정화면");
	return "project/project_task_modify";
	}
	
	@GetMapping("/projectCalender")
	public String projectCalender(Model model) {
		model.addAttribute("projectCalender","프로젝트내부 캘린더 화면");
	return "project/project_calender";
	}
	
	@GetMapping("/projectCalenderInsert")
	public String projectCalenderInsert(Model model) {
		model.addAttribute("projectCalenderInsert","프로젝트내부 캘린더 입력 화면");
	return "project/project_home/project_calender_insert";
	}
	
	@GetMapping("/projectCalenderModify")
	public String projectCalenderModify(Model model) {
		model.addAttribute("projectCalenderModify","프로젝트내부 캘린더 수정 화면");
	return "project/project_calender_modify";
	}
	
	@GetMapping("/projectFiles")
	public String projectFiles(Model model) {
		model.addAttribute("projectFiles","프로젝트 첨부파일 화면");
	return "project/project_files";
	}
	
	@GetMapping("/projectFilesInsert")
	public String projectFilesInsert(Model model) {
		model.addAttribute("projectFilesInsert","프로젝트 첨부파일 등록화면");
	return "project/project_files_insert";
	}
	
	@GetMapping("/projectTodo")
	public String projectTodo(Model model) {
		model.addAttribute("projectTodo","프로젝트내부 todo");
	return "project/project_home/project_todo";
	}
}

