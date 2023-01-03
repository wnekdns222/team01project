package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.mapper.MemberLevelMapper;

@Service
public class MemberLevelService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final MemberLevelMapper memberLevelMapper;
	public MemberLevelService(MemberLevelMapper memberLevelMapper) {
		this.memberLevelMapper = memberLevelMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<MemberLevel> memberLevelList(){
		
		List<MemberLevel> memberLevelList = memberLevelMapper.memberLevelList();
		
		return memberLevelList;
	}
}
