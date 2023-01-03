package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team01.unity.dto.File;
import ks45team01.unity.mapper.FileMapper;

@Service
public class FileService {
	
	private final FileMapper fileMapper;
	public FileService(FileMapper fileMapper) {
		this.fileMapper = fileMapper;
	}
	
	public int fileDelete(String fileNum) {
		
		int fileDelete = fileMapper.fileDelete(fileNum);
		
		return fileDelete;
	}
	
	public int fileUpdate(File file) {
		
		int fileUpdate = fileMapper.fileUpdate(file);
		
		return fileUpdate;
		
	}
	
	public void addFile(File file) {
		
		fileMapper.addFile(file);
	}
	
	public File fileView(String fileNum) {
		
		File fileView = fileMapper.fileView(fileNum);
		
		return fileView;
	}
	
	/**
	 * 파일 목록
	 * @return
	 */
	public List<File> hrList(){
		
		List<File> hrList = fileMapper.hrList();
		
		return hrList;
	}
}
