package ks45team01.unity.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import ks45team01.unity.dto.Meetingroom;
import ks45team01.unity.dto.Reservation;

@Mapper
public interface ReservationMapper {

	public List<Meetingroom> getMeetingroomList();
	
	public void insertMeetingroom(Meetingroom meetingroom);

	public void modifyMeetingroom(Meetingroom meetingroom);
	
	public void deleteMeetingroom(Meetingroom meetingroom);
	
	public Meetingroom getMeetingroomById(String meetNum);
	
	public List<Reservation> getReservationList();
	
	public Reservation getReservationById(String meetNum);
	
	public void insertMeetingroomReservation(Reservation reservation);
	
	public void modifyReservation(Reservation reservation);  
	
	public String getCommonNewCode(String table, String column);
	
	public List<Reservation> getReservationMineList(String applicantMemberNum);
	
	public List<Reservation> getReservationNameList();
	
	public void deleteMeetingroomReservation(Reservation reservation);
}
