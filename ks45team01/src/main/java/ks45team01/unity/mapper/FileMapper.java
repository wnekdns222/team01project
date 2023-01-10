package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.FileDto;


@Mapper
public interface FileMapper {

	public int addFile(List<FileDto> fileList); 
	
	public List<FileDto> getFileList();
	
	public FileDto getFileInfoByIdx(String fileIdx);
}
