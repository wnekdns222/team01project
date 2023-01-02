package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.File;

@Mapper
public interface FileMapper {
	// 파일 삭제
	int fileDelete(String fileNum);
	// 파일 수정
	int fileUpdate(File file);
	
	// 파일 등록
	void addFile(File file);
	
	// 파일 상세보기
	File fileView(String fileNum);
	
	// 파일 목록
	List<File> FileList();
}
