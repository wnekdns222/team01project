package ks45team01.unity.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.mapper.LoginMapper;

@Service
@Transactional
public class LoginService {
	private static final Logger log = LoggerFactory.getLogger(LoginService.class);
	
	private final LoginMapper loginMapper;

	public LoginService(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}
	/**
	 * 회원정보(비밀번호) 확인
	 * @param memberId, memberPw
	 * @return
	 */
	public Map<String, Object> checkPwByMemberId(String memberNum, String memberPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		boolean result = false;
		
		MemberList memberList = loginMapper.checkPwById(memberNum);
		if(memberList != null) {
			String checkPw = memberList.getMemberPw();
			if(memberPw.equals(checkPw)) {
				result = true;
			}
		}
		
		resultMap.put("result", result);
		resultMap.put("memberInfo", memberList);
		
		return resultMap;
	}
	//회원 가입
	public void addMember(MemberList memberList) {
		loginMapper.addMember(memberList);
	}
//	public Map<String, Object> getLoginHistory(int currentPage){
//		// 보여질 행의 갯수
//		int rowPerPage = 10;
//		
//		// 로그인이력 테이블의 보여질 행의 시작점
//		int startRowNum = (currentPage - 1) * rowPerPage;
//		
//		// 마지막페이지 
//		// 1. 로그인이력 테이블의 전체 행의 갯수 
//		double rowCnt = loginMapper.getLoginHistoryCnt();
//		// 2. 마지막페이지
//		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
//		
//		// 보여질 페이지 번호 구현
//		// 보여질 페이지 번호 초기화
//		int startPageNum = 1;
//		int endPageNum = 10;
//		
//		// 동적 페이지 번호 구현
//		// 페이지 번호 (동적) 10페이지 미만일 경우 처리
//		if(currentPage > 6 && lastPage > 9) {
//			startPageNum = currentPage - 5;
//			endPageNum = currentPage +4;
//			if(endPageNum >= lastPage) {
//				startPageNum = lastPage - 9;
//				endPageNum = lastPage;
//			}
//		}
//		
//		
//		// 로그인이력 조회 시 Limit 인수 파라미터 셋팅
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("startRowNum",startRowNum);
//		paramMap.put("rowPerPage",rowPerPage);
//		
//		// 로그인 이력 data
//		List<LoginHistory> loginHistory = loginMapper.getLoginHistory(paramMap);
//		
//		// controller에 전달하기 위한 파라미터 셋팅
//		paramMap.clear();
//		paramMap.put("loginHistory", loginHistory);
//		paramMap.put("lastPage", lastPage);
//		paramMap.put("startPageNum", startPageNum);
//		paramMap.put("endPageNum", endPageNum);
//		
//		return paramMap;
//	}
//	
}
