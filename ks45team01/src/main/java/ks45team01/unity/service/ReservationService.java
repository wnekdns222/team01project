package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.Meetingroom;
import ks45team01.unity.dto.Reservation;
import ks45team01.unity.mapper.ReservationMapper;

@Service
@Transactional
public class ReservationService {
	
	private final ReservationMapper reservationMapper;
	
	public ReservationService(ReservationMapper reservationMapper){
		this.reservationMapper = reservationMapper;

	}
	
	public List<Meetingroom> getMeetingroomList(){
		
		List<Meetingroom> meetingroomList = reservationMapper.getMeetingroomList();
		
		return meetingroomList;
	}
	
	public void modifyMeetingroom (Meetingroom meetingroom) {
		
		reservationMapper.modifyMeetingroom(meetingroom);
	}
	
	public Meetingroom getMeetingroomById(String meetNum) {
		
		Meetingroom meetingroom = reservationMapper.getMeetingroomById(meetNum);
		
		return meetingroom;
	}
	
	public void deleteMeetingroom (Meetingroom meetingroom) {
		
		reservationMapper.deleteMeetingroom(meetingroom);
		
	}
	
	public List<Reservation> getReservationList(){
		
		List<Reservation> reservationList = reservationMapper.getReservationList();
		
		return reservationList;
	}
	
	public Reservation getReservationById(String reservationNum) {
		
		Reservation reservation = reservationMapper.getReservationById(reservationNum);
		
		return reservation;
	}
	
	public void insertReservation (Reservation reservation) {
		
		reservationMapper.insertReservation(reservation);
	}
	
	public void modifyReservation (Reservation reservation) {
		
		reservationMapper.modifyReservation(reservation);
	}
	
}