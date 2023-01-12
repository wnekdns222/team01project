package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.LoginHistory;

@Service
@Transactional
public class LoginService {
//private static final Logger log = LoggerFactory.getLogger(MemberService.class);
//	
//	private final MemberMapper memberMapper;
//	
//	public MemberService(MemberMapper memberMapper) {
//		this.memberMapper = memberMapper;
//	}
//	public Map<String, Object> getLoginHistory(int currentPage){
//		// 보여질 행의 갯수
//		int rowPerPage = 10;
//		
//		// 로그인이력 테이블의 보여질 행의 시작점
//		int startRowNum = (currentPage - 1) * rowPerPage;
//		
//		// 마지막페이지 
//		// 1. 로그인이력 테이블의 전체 행의 갯수 
//		double rowCnt = memberMapper.getLoginHistoryCnt();
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
//		List<LoginHistory> loginHistory = memberMapper.getLoginHistory(paramMap);
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
}
