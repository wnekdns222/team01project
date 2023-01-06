package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MajorCateGory;

@Mapper
public interface MajorCategoryMapper {

	public List<MajorCateGory> majorCategoryList();
}
