package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.FileBoard;
import ks45team01.unity.mapper.FileBoardMapper;

@Service
public class FileBoardService {
	
	private final FileBoardMapper fileBoardMapper;
	public FileBoardService(FileBoardMapper fileBoardMapper) {
		this.fileBoardMapper = fileBoardMapper;
	}
	
	public int boardFileDelete(String fileBoardNum) {
		
		int boardFileDelete = fileBoardMapper.boardFileDelete(fileBoardNum);
		
		return boardFileDelete;
	}
	
	public int boardFileUpdate(FileBoard fileBoard) {
		
		int boardFileUpdate = fileBoardMapper.boardFileUpdate(fileBoard);
		
		return boardFileUpdate;
		
	}
	
	public void addBoardFile(FileBoard fileBoard) {
		
		fileBoardMapper.addBoardFile(fileBoard);
	}
	
	public FileBoard boardFileView(String fileBoardNum) {
		
		FileBoard boardFileView = fileBoardMapper.boardFileView(fileBoardNum);
		
		return boardFileView;
	}
	
	public List<FileBoard> fileServiceTypeList(String serviceType){
		
		List<FileBoard> serviceTypeList = fileBoardMapper.fileServiceTypeList(serviceType);
		
		return serviceTypeList;
	}
	
	/*
	public List<File> hrList(){
		
		List<File> hrList = fileMapper.hrList();
		
		return hrList;
	}
	*/
}
