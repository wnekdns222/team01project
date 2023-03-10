package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.dto.FileBoardCate;

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
	
	// 파일 서비스별 목록
	List<FileBoard> fileServiceTypeList(String serviceType);
	
	// 파일 카테고리 부분목록(중복제거)
	List<FileBoard> fileBoardCatePartList();
	
	// 파일 카테고리 전체 조회
	List<FileBoard> fileBoardCateList();
	
	// 파일 카테고리 등록
	void addFileBoardCate(FileBoardCate fileBoardCate);
	
	// 파일 카테고리 수정
	int fileBoardCateModify(FileBoardCate fileBoardCate);
	
	// 하나의 파일 카테고리 조회
	FileBoardCate fileBoardCateModifyForm(String fileCategoryCode);
	
	// 파일 카테고리 삭제
	int fileBoardCateDelete(String fileCategoryCode);
	
	// 파일 게시글 전체목록 조회
	List<FileBoard> fileBoardList();
	
	List<FileBoardCate> result(String fileCategoryCode);
}
