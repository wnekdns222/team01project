package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.dto.FileBoardCate;
import ks45team01.unity.dto.FileDto;
import ks45team01.unity.mapper.FileBoardMapper;
import ks45team01.unity.mapper.FileMapper;
import ks45team01.unity.util.FileUtil;

@Service
@Transactional
public class FileBoardService {
	
	private final FileBoardMapper fileBoardMapper;
	private final FileUtil fileUtil;
	private final FileMapper fileMapper;
	
	public FileBoardService(FileBoardMapper fileBoardMapper, FileUtil fileUtil, FileMapper fileMapper) {
		this.fileBoardMapper = fileBoardMapper;
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
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
	 * 파일 등록
	 * @param uploadfile
	 * @param fileRealPath
	 * @param fileBoard
	 */
	
	public void addBoardFile(MultipartFile[] uploadfile, FileBoard fileBoard) {
		
		List<FileDto> fileList= fileUtil.parseFileInfo(uploadfile);
		
		System.out.println(fileList);
		
		if(fileList != null) fileMapper.addFile(fileList);
		
		fileMapper.addFile(fileList);
		fileBoardMapper.addBoardFile(fileBoard);
		System.out.println("insert >>> "+fileBoard);
		// file_control insert
	}
	
	/**
	 * 파일 게시글 상세보기
	 * @param fileBoardNum
	 * @return boardFileView
	 */
	public FileBoard boardFileView(String fileBoardNum) {
		
		FileBoard boardFileView = fileBoardMapper.boardFileView(fileBoardNum);
		System.out.println(">>>>>>"+boardFileView);
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
	
	public List<FileBoard> fileBoardCateList(){
		
		List<FileBoard> fileBoardCateList = fileBoardMapper.fileBoardCateList();
		
		return fileBoardCateList;
	}
	
	/**
	 * 카테고리 부분 조회 (중복제거)
	 * @return fileBoardCateList
	 */
	public List<FileBoard> fileBoardCatePartList(){
		
		List<FileBoard> fileBoardCateList = fileBoardMapper.fileBoardCatePartList();
		
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
	
	public List<FileBoard> fileBoardList(){
		
		List<FileBoard> fileBoardList = fileBoardMapper.fileBoardList();
		
		return fileBoardList;
	}
	
	/**
	 * 파일 목록 조회
	 * @return fileMapper.getFileList
	 */
	public List<FileDto> getFileList(){
		return fileBoardMapper.getFileList();
	}
	
	/**
	 * 하나의 파일 조회
	 * @param fileIdx
	 * @return fileMapper.getFileInfoByIdx(fileIdx)
	 */
	public FileDto getFileInfoByIdx(String fileIdx) {
		return fileBoardMapper.getFileInfoByIdx(fileIdx);
	}
	
	public List<FileBoardCate> result(String fileCategoryCode){
		
		return fileBoardMapper.result(fileCategoryCode);
	}
	
	
//	/**
//	 * 파일 등록처리
//	 * @param uploadfile
//	 * @param fileRealPath
//	 */
//	public void fileUpload(MultipartFile[] uploadfile, String fileRealPath) {
//		
//		List<FileDto> fileList= fileUtil.parseFileInfo(uploadfile, fileRealPath);
//		
//		System.out.println(fileList);
//		
//		if(fileList != null) fileMapper.addFile(fileList);
//		
//	}

}
