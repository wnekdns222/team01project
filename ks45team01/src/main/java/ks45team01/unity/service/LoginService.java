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

}
