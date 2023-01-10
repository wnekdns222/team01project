package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.CommunityNotice;

@Mapper
public interface CommunityNoticeMapper {
		// 커뮤니티 공지사항 목록 조회
		List<CommunityNotice> communityNoticeList();
		
		// 커뮤니티 공지사항 상세 페이지
		CommunityNotice communityNoticeDetail(String noticeCode);
		
		// 커뮤니티 공지사항 등록
		void communityNoticeAdd(CommunityNotice communityNotice);
		
		// 커뮤니티 공지사항 수정 
		int communityNoticeModify(CommunityNotice communityNotice);
		
		// 자동증가 함수
		String getCommonNewCode(String table, String column);
		
		int communityNoticeDelete(String noticeCode);
}
