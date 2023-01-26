package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.CommunityBoard;
import ks45team01.unity.dto.CommunityNotice;

@Mapper
public interface CommunityBoardMapper {
	// 커뮤니티 게시판 목록 조회
	List<CommunityBoard> communityBoardList();
	
	// 커뮤니티 게시판 상세 페이지
	CommunityBoard communityBoardDetail(String boardCode);
	
	// 커뮤니티 게시판 등록
	void communityBoardAdd(CommunityBoard communityBoard);
	
	// 커뮤니티 게시판 수정 
	int communityBoardModify(CommunityBoard communityBoard);
	
	// 자동증가 함수
	String getCommonNewCode(String table, String column);
	
	// 커뮤니티 게시판 삭제
	int communityBoardDelete(String boardCode);
	
	// 커뮤니티 게시판 목록 조회
	public List<CommunityBoard> getBoardList(String searchKey, String searchValue);
}
