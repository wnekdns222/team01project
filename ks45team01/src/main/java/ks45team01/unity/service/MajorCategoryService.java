package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.MajorCateGory;
import ks45team01.unity.mapper.MajorCategoryMapper;

@Service
@Transactional
public class MajorCategoryService {
	
	private final MajorCategoryMapper majorCategoryMapper;
	public MajorCategoryService(MajorCategoryMapper majorCategoryMapper) {
		this.majorCategoryMapper = majorCategoryMapper;
	}
	
	public List<MajorCateGory> majorCateList(){
		
		List<MajorCateGory> majorCateList = majorCategoryMapper.majorCategoryList();
		
		return majorCateList;
	}
}
