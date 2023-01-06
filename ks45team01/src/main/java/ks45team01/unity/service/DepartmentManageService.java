package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.DepartmentManage;
import ks45team01.unity.mapper.DepartmentManageMapper;

@Service
public class DepartmentManageService {


	/*
	 * private final FileMapper fileMapper;
	 *  public FileService(FileMapper
	 * fileMapper) { this.fileMapper = fileMapper; }
	 */
	
	
	private final DepartmentManageMapper departmentManageMapper;
	public DepartmentManageService(DepartmentManageMapper departmentManageMapper) {
		this.departmentManageMapper = departmentManageMapper;
	}
	
	/**
	 * 직급 사원 목록 관리
	 * @return
	 */
	public List<DepartmentManage> departmentManageSe(){
		
		List<DepartmentManage> departmentManage = departmentManageMapper.departmentManageSe();
		
		return departmentManage;
	}
	
	
}
