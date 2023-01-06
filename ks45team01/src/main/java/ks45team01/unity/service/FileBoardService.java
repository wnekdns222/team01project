package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.dto.FileBoardCate;
import ks45team01.unity.mapper.FileBoardMapper;

@Service
public class FileBoardService {
	
	private final FileBoardMapper fileBoardMapper;
	public FileBoardService(FileBoardMapper fileBoardMapper) {
		this.fileBoardMapper = fileBoardMapper;
	}
	
	public void addFileBoardCate(FileBoardCate fileBoardCate) {
		
		fileBoardMapper.addFileBoardCate(fileBoardCate);
	}
	
	
	
	/**
	 * 파일게시글 삭제
	 * @param fileBoardNum
	 * @return boardFileDelete
	 */
	public int boardFileDelete(String fileBoardNum) {
		
		int boardFileDelete = fileBoardMapper.boardFileDelete(fileBoardNum);
		
		return boardFileDelete;
	}
	
	/**
	 * 파일 게시글 수정
	 * @param fileBoard
	 * @return boardFileUpdate
	 */
	public int boardFileUpdate(FileBoard fileBoard) {
		
		int boardFileUpdate = fileBoardMapper.boardFileUpdate(fileBoard);
		
		return boardFileUpdate;
		
	}
	
	/**
	 * 파일 게시글 등록
	 * @param fileBoard
	 */
	public void addBoardFile(FileBoard fileBoard) {
		
		fileBoardMapper.addBoardFile(fileBoard);
	}
	
	/**
	 * 파일 게시글 상세보기
	 * @param fileBoardNum
	 * @return boardFileView
	 */
	public FileBoard boardFileView(String fileBoardNum) {
		
		FileBoard boardFileView = fileBoardMapper.boardFileView(fileBoardNum);
		
		return boardFileView;
	}
	
	/**
	 * 파일 카테고리별 게시글 목록조회
	 * @param serviceType
	 * @return serviceTypeList
	 */
	public List<FileBoard> fileServiceTypeList(String serviceType){
		
		List<FileBoard> serviceTypeList = fileBoardMapper.fileServiceTypeList(serviceType);
		
		return serviceTypeList;
	}
	
	/**
	 * 카테고리 및 전체 목록 조회
	 * @return fileBoardCateList
	 */
	public List<FileBoard> fileBoardCateList(){
		
		List<FileBoard> fileBoardCateList = fileBoardMapper.fileBoardCateList();
		
		return fileBoardCateList;
	}
	
	/**
	 * 파일 수정 화면 
	 * @param fileCategoryCode
	 * @return fileBoardCateModify
	 */
	public FileBoardCate fileBoardCateModifyForm(String fileCategoryCode) {
		
		FileBoardCate fileBoardCateModify = fileBoardMapper.fileBoardCateModifyForm(fileCategoryCode);
		
		return fileBoardCateModify;
	}
	
	/**
	 * 파일 수정 처리
	 * @param fileBoardCate
	 * @return fileBoardCateModify
	 */
	public int fileBoardCateModify(FileBoardCate fileBoardCate) {
		
		int fileBoardCateModify = fileBoardMapper.fileBoardCateModify(fileBoardCate);
		
		return fileBoardCateModify;
		
	}
	
	public int fileBoardCateDelete(String fileCategoryCode) {
		
		int fileBoardCateDelete = fileBoardMapper.fileBoardCateDelete(fileCategoryCode);
		
		return fileBoardCateDelete;
	}
}
