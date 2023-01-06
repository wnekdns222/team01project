package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ks45team01.unity.dto.PositionManage;
import ks45team01.unity.mapper.PositionManageMapper;

@Service
public class PositionManageService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final PositionManageMapper positionManageMapper;
	public PositionManageService(PositionManageMapper positionManageMapper) {
		this.positionManageMapper = positionManageMapper;
	}
	
	/**
	 * 직급 사원 목록 관리
	 * @return
	 */
	public List<PositionManage> positionManageSe(){
		
		List<PositionManage> positionManage = positionManageMapper.positionManageSe();
		
		return positionManage;
	}
	
	
}
