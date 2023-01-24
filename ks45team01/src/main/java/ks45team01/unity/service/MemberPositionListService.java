package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.mapper.MemberListMapper;


@Service
public class MemberPositionListService {
	
	private final MemberListMapper memberListMapper;
	public MemberPositionListService(MemberListMapper memberListMapper) {
		this.memberListMapper = memberListMapper;
	}
	
	
	public List<MemberPositionList> memberPositionList() {
		
		List<MemberPositionList> memberPositionList = memberListMapper.memberPositionList();
		
		return memberPositionList;
	}

}
