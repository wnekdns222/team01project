package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import ks45team01.unity.dto.LoginHistory;

public interface LoginMapper {
	
	//로그인 이력 조회
	public List<LoginHistory> getLoginHistory(Map<String, Object> paramMap);
	//로그인 이력 테이블의 전체 행의 갯수
	public int getLoginHistoryCnt();
	
	//사원 로그인 이력 삭제
	public int removeLoginHistoryById(String memberNum);
	
	
}
