package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.MemberList;
import ks45team01.unity.mapper.MemberModifyMapper;

@Service
public class MemberModifyService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final MemberModifyMapper memberModifyMapper;
	public MemberModifyService(MemberModifyMapper memberModifyMapper) {
		this.memberModifyMapper = memberModifyMapper;
	}
	
	
	
public List<MemberList> memberModifyList(){
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		
		List<MemberList> memberModifyList = memberModifyMapper.memberModifyList(paramMap);
		return memberModifyList;
	}
	



}
