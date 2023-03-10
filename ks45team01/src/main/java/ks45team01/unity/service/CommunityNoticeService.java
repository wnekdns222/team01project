package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.CommunityNotice;
import ks45team01.unity.mapper.CommunityNoticeMapper;

@Service
@Transactional
public class CommunityNoticeService {
	
	private final CommunityNoticeMapper communityNoticeMapper;
	public CommunityNoticeService(CommunityNoticeMapper communityNoticeMapper) {
		this.communityNoticeMapper = communityNoticeMapper;
	}
	
	public List<CommunityNotice> communityNoticeList(){
		
		List<CommunityNotice> communityNoticeList = communityNoticeMapper.communityNoticeList();
		
		return communityNoticeList;
	}
	
	/**
	 * 커뮤니티 게시글 상세보기
	 * @return communityNoticeDetail
	 */
	
	public CommunityNotice communityNoticeDetail(String noticeCode) {
		
		CommunityNotice communityNoticeDetail = communityNoticeMapper.communityNoticeDetail(noticeCode);
		
		return communityNoticeDetail;
	}
	
	public void communityNoticeAdd(CommunityNotice communityNotice) {
		
		String noticeCode = communityNoticeMapper.getCommonNewCode("tb_notice", "notice_code");
		communityNotice.setNoticeCode(noticeCode);
		communityNoticeMapper.communityNoticeAdd(communityNotice);
	}
	
	public int communityNoticeModify(CommunityNotice communityNotice) {
		
		return communityNoticeMapper.communityNoticeModify(communityNotice);
	}
	public int communityNoticeDelete(String noticeCode) {
		
		return communityNoticeMapper.communityNoticeDelete(noticeCode);
	}
	
	/**
	 * 공지사항 수정을위한 목록 조회
	 * @return List<CommunityNotice>
	 */
	public List<CommunityNotice> noticeList(){
		
		List<CommunityNotice> noticeList = communityNoticeMapper.noticeList();
		
		return noticeList;
	}
	
	
	/**
	 * 목록 조회
	 * @return List<CommunityNotice>
	 */
	public List<CommunityNotice> getNoticeCode(String searchKey, String searchValue){
		
		
		if(searchKey != null) {
			switch (searchKey) {
			case "noticeName":
				searchKey = "notice_name";
				break;
			case "memberNum":
				searchKey = "member_num";
				break;
			}
		}
		return communityNoticeMapper.getNoticeList(searchKey, searchValue);
		
	}
}
