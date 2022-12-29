package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.FormBoard;
import ks45team01.unity.mapper.FormBoardMapper;

@Service
@Transactional
public class FormBoardService {

	private final FormBoardMapper formBoardMapper;
	public FormBoardService(FormBoardMapper formBoardMapper) {
		this.formBoardMapper = formBoardMapper; 
	}
	public int updateFormBoard(FormBoard formBoard) {
		
		int updateForm = formBoardMapper.updateFormBoard(formBoard);
		
		return updateForm;
	}
	
	
	public void addFormBoard(FormBoard formBoard) {
		
		formBoardMapper.addFormBoard(formBoard);
	}
	
	public FormBoard formView(int formNum) {
		
		FormBoard formView = formBoardMapper.getFormBoard(formNum);
		
		return formView;
	}
	
	public List<FormBoard> formList(){
		
		List<FormBoard> formList = formBoardMapper.formList();
		
		return formList;
	}
	public int formBoardCount() {
		
		
		int formCount = formBoardMapper.formBoardCount();
		
		return formCount;
	}
}
