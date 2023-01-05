package ks45team01.unity.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Meetingroom;

@Mapper
public interface ReservationMapper {

	public List<Meetingroom> getMeetingroomList();
	
	public void modifyMeetingroom(Meetingroom meetingroom);

	public Meetingroom getMeetingroomById(String meetNum);
	
	public void deleteMeetingroom(Meetingroom meetingroom);
}
