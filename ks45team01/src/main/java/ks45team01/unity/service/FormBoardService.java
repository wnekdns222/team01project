package ks45team01.unity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 * 
	 * @param fornNum
	 * @return result
	 */

	public int deleteFormBoard(int fornNum) {

		int result = formBoardMapper.deleteFormBoard(fornNum);

		return result;
	}

	/**
	 * 서식 수정
	 * 
	 * @param formBoard
	 * @return updateForm
	 */

	public int updateFormBoard(FormBoard formBoard) {

		int updateForm = formBoardMapper.updateFormBoard(formBoard);

		return updateForm;
	}

	/**
	 * 서식 등록
	 * 
	 * @param formBoard
	 */

	public void addFormBoard(FormBoard formBoard) {

		formBoardMapper.addFormBoard(formBoard);
	}

	/**
	 * 서식글 상세보기
	 * 
	 * @param formNum
	 * @return formView
	 */

	public FormBoard formView(int formNum) {

		FormBoard formView = formBoardMapper.getFormBoard(formNum);

		return formView;
	}

	/**
	 * 서식글 리스트 조회
	 * 
	 * @return formList
	 */

	public Map<String, Object> formListPage(int currentPage) {

		// 페이지당 보여질 행의 갯수(rowPerPage)
		int rowPerPage = 10;

		// 로그인이력 테이블의 보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;

		// 마지막페이지
		// 1.로그인이력 테이블의 전체 행의 갯수
		double rowCnt = formBoardMapper.formBoardCount();
		// 2.마지막 페이지
		int lastPage = (int) Math.ceil(rowCnt / rowPerPage);

		// 로그인 이력 조회시 Limit 인수 파라미터 셋팅
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRowNum", startRowNum);
		paramMap.put("rowPerPage", rowPerPage);

		// 로그인 이력 data
		List<FormBoard> formListPage = formBoardMapper.formList(paramMap);

		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = 10;

		// 동적 페이지 번호 구현
		// 페이지 번호 (동적) 10페이지 미만일 경우 처리
		if (currentPage > 6 && lastPage > 9) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if (endPageNum >= lastPage) {
				startPageNum = currentPage - 9;
				endPageNum = lastPage;
			}
		}
		// 라스트페이지가 10보다 작으면 엔드페이지이다..
		endPageNum = lastPage < 10 ? lastPage : endPageNum;
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("formListPage", formListPage);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		return paramMap;
	}

	public List<FormBoard> fomeList(String searchKey, String searchValue) {

		if (searchKey != null) {
			switch (searchKey) {
			case "formName":
				searchKey = "form_name";
				break;
			case "formRegiStrant":
				searchKey = "form_registrant";
				break;
			}
		}
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		return formBoardMapper.formList(paramMap);
	}

	/**
	 * 서식글 수 확인
	 * 
	 * @return formCount
	 */
	public int formBoardCount() {

		int formCount = formBoardMapper.formBoardCount();

		return formCount;
	}
}
