package ks45team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.dto.FormBoard;

@Mapper
public interface FormBoardMapper {
	// 서식글 삭제
	int deleteFormBoard(int formNum);
	// 서식글 수정
	int updateFormBoard(FormBoard formBoard);
	// 서식글 등록
	void addFormBoard(FormBoard formBoard);
	// 서식글 상세보기
	FormBoard getFormBoard(int formNum);
	// 서식글 개수
	int formBoardCount();
	
	// 서식글 목록
	List<FormBoard> formList();
}
