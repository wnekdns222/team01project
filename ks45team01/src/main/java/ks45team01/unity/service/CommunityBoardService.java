package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.CommunityBoard;
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
	
	public CommunityBoard communityBoardDetail(String BoardCode) {
		
		CommunityBoard communityBoardDetail = communityBoardMapper.communityBoardDetail(BoardCode);
		
		return communityBoardDetail;
	}
	
	public void communityBoardAdd(CommunityBoard communityBoard) {
		
		String BoardCode = communityBoardMapper.getCommonNewCode("tb_board", "board_code");
		communityBoard.setBoardCode(BoardCode);
		communityBoardMapper.communityBoardAdd(communityBoard);
	}
}
