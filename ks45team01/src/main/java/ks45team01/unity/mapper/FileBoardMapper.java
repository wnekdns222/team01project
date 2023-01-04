package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.FileBoard;

@Mapper
public interface FileBoardMapper {
	// 파일 삭제
	int boardFileDelete(String fileBoardNum);
	// 파일 수정
	int boardFileUpdate(FileBoard fileBoard);
	
	// 파일 등록
	void addBoardFile(FileBoard fileBoard);
	
	// 파일 상세보기
	FileBoard boardFileView(String fileBoardNum);
	
	// 파일 서비스별 (인사, 마케팅) 목록
	List<FileBoard> fileServiceTypeList(String serviceType);
	
}
