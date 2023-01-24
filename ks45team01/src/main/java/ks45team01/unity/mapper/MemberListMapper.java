package ks45team01.unity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.MemberDepartmentList;
import ks45team01.unity.dto.MemberLevel;
import ks45team01.unity.dto.MemberList;
import ks45team01.unity.dto.MemberPositionList;
import ks45team01.unity.dto.PositionManage;


@Mapper
public interface MemberListMapper {
	
	//회원조회
	List<MemberList> memberListSe(Map<String, Object> paramMap);
	
	//회원 전체 갯수 조회
	int getMemberListCnt();
	
	
	// 회원 한명 조회
	MemberList memberlistOne(String memberNum);
	
	//memberDpartment
	// 부서사용 목록
		List<MemberDepartmentList> memberDepartmentList();
		
		
		//MemberLevel
		//회원한명권한 조회
		MemberLevel memberLevelDetail(String levelCode);
		
		// 회원 권한 조회
		List<MemberLevel> memberLevelList();
		
		
		//memberModify
		//회원조회
		List<MemberList> memberModifyList(Map<String, Object> paramMap);
		
		//부서조회
		List<MemberDepartmentList>  memberModifyDepartmentList();
		
		//직급 조회
			List<MemberPositionList>  MemberModifyPositionList();

			//memberPositionList
			// 부서사용 목록
			List<MemberPositionList> memberPositionList();

			//positionManage
			//직급 사원 목록 관리
			List<PositionManage> positionManageSe();
}
