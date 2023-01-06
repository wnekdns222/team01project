package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.mapper.MemberPositionListMapper;


@Service
public class MemberPositionListService {
	
	private final MemberPositionListMapper memberPositionListMapper;
	public MemberPositionListService(MemberPositionListMapper memberPositionListMapper) {
		this.memberPositionListMapper = memberPositionListMapper;
	}
	
	
	public List<MemberPositionList> memberPositionList() {
		
		List<MemberPositionList> memberPositionList = memberPositionListMapper.memberPositionList();
		
		return memberPositionList;
	}

}
