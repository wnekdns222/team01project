package ks45team01.unity.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Meetingroom;

@Mapper
public interface ReservationMapper {

	List<Meetingroom> getMeetingroomList();

	
}
