package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.CommunityBoard;
import ks45team01.unity.dto.CommunityNotice;
import ks45team01.unity.mapper.CommunityBoardMapper;

@Service
@Transactional
public class CommunityBoardService {
	
	private final CommunityBoardMapper communityBoardMapper;
	public CommunityBoardService(CommunityBoardMapper communityBoardMapper) {
		this.communityBoardMapper = communityBoardMapper;
	}
	
	public List<CommunityBoard> communityBoardList(){
		
		List<CommunityBoard> communityBoardList = communityBoardMapper.communityBoardList();
		
		return communityBoardList;
	}
	
	/**
	 * 커뮤니티 게시글 상세보기
	 * @return communityBoardDetail
	 */
	
	public CommunityBoard communityBoardDetail(String boardCode) {
		
		CommunityBoard communityBoardDetail = communityBoardMapper.communityBoardDetail(boardCode);
		
		return communityBoardDetail;
	}
	
	public void communityBoardAdd(CommunityBoard communityBoard) {
		
		String boardCode = communityBoardMapper.getCommonNewCode("tb_board", "board_code");
		communityBoard.setBoardCode(boardCode);
		communityBoardMapper.communityBoardAdd(communityBoard);
	}
	
	public int communityBoardModify(CommunityBoard communityBoard) {
		
		return communityBoardMapper.communityBoardModify(communityBoard);
	}
	public int communityBoardDelete(String boardCode) {
		
		return communityBoardMapper.communityBoardDelete(boardCode);
	}
	/**
	 * 목록 조회
	 * @return List<CommunityBoard>
	 */
	public List<CommunityBoard> getBoardCode(String searchKey, String searchValue){
		
		
		if(searchKey != null) {
			switch (searchKey) {
			case "boardName":
				searchKey = "board_name";
				break;
			case "memberNum":
				searchKey = "member_num";
				break;
			}
		}
		return communityBoardMapper.getBoardList(searchKey, searchValue);
		
	}
}
