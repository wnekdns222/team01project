package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.ProjectList;
import ks45team01.unity.mapper.MemberListMapper;
import ks45team01.unity.mapper.ProjectListMapper;

@Service
public class MemberListService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final MemberListMapper memberListMapper;
	public MemberListService(MemberListMapper memberListMapper) {
		this.memberListMapper = memberListMapper;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<MemberList> memberListSe(){
		
		List<MemberList> memberList = memberListMapper.memberListSe();
		
		return memberList;
	}
	
	
}
