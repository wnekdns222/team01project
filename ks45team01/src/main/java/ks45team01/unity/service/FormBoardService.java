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
	
	/**
	 * 서식 삭제
	 * @param fornNum
	 * @return result
	 */
	
	public int deleteFormBoard(int fornNum) {
		
		int result = formBoardMapper.deleteFormBoard(fornNum);
		
		return result;
	}
	
	/**
	 * 서식 수정
	 * @param formBoard
	 * @return updateForm
	 */
	
	public int updateFormBoard(FormBoard formBoard) {
		
		int updateForm = formBoardMapper.updateFormBoard(formBoard);
		
		return updateForm;
	}
	
	/**
	 * 서식 등록
	 * @param formBoard
	 */
	
	public void addFormBoard(FormBoard formBoard) {
		
		formBoardMapper.addFormBoard(formBoard);
	}
	
	/**
	 * 서식글 상세보기
	 * @param formNum
	 * @return formView
	 */
	
	public FormBoard formView(int formNum) {
		
		FormBoard formView = formBoardMapper.getFormBoard(formNum);
		
		return formView;
	}
	
	/**
	 * 서식글 리스트 조회
	 * @return formList
	 */
	
	public List<FormBoard> formList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch(searchKey) {
			case "formName":
				searchKey = "form_name";
				break;
			case "formRegiStrant":
				searchKey = "form_registrant";
				break;
			}
		}
		
		List<FormBoard> formList = formBoardMapper.formList(searchKey, searchValue);
		
		return formList;
	}
	
	/**
	 * 서식글 수 확인
	 * @return formCount
	 */
	public int formBoardCount() {
		
		
		int formCount = formBoardMapper.formBoardCount();
		
		return formCount;
	}
}

