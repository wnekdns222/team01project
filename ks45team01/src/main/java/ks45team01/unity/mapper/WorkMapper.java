package ks45team01.unity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Work;
import ks45team01.unity.dto.WorkUnusual;

@Mapper
public interface WorkMapper {

	//자동증가코드
	public String getCommonNewCode(String table, String column);
	
	//근태등록
	public void addWork(Work work);
	
	//전사원 근태조회
	public List<Work> getAllWorkInfo();
	
	//비정상 근태 등록 조회
	public List<WorkUnusual> getAuthorityWorkInfo();
}
