package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.mapper.MemberListMapper;




@Service
public class MemberLevelService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final MemberListMapper memberListMapper;
	public MemberLevelService(MemberListMapper memberListMapper) {
		this.memberListMapper = memberListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<MemberLevel> memberLevelList(){
		
		List<MemberLevel> memberLevelList = memberListMapper.memberLevelList();
		
		return memberLevelList;
	}
	
	/**
	 * 특정회원 권한 조회
	 * @param levelCode
	 * @return
	 */
	public MemberLevel memberLevelDetail(String levelCode) {
		
		MemberLevel memberLevelDetail = memberListMapper.memberLevelDetail(levelCode);
		
		return memberLevelDetail;
	}
}
