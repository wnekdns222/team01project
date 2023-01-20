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
	/* 자동증가 코드 */
	public String getCommonNewCode(String table, String column) {
		String newCode = reservationMapper.getCommonNewCode(table, column);
		
		return newCode;
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
	
	public Reservation getReservationById(String meetNum) {
		
		Reservation reservation = reservationMapper.getReservationById(meetNum);
		
		return reservation;
	}
	
	public void insertMeetingroomReservation (Reservation reservation) {
		
		String reservationNum =reservationMapper.getCommonNewCode("tb_meet_reservation", "reservation_num");
		reservation.setReservationNum(reservationNum);
		reservationMapper.insertMeetingroomReservation(reservation);
	}
	
	public void modifyReservation (Reservation reservation) {
		
		reservationMapper.modifyReservation(reservation);
	}
	
	public void insertMeetingroom (Meetingroom meetingroom) {
		
		String meetNum =reservationMapper.getCommonNewCode("tb_meetingroom", "meet_num");
		meetingroom.setMeetNum(meetNum);
		reservationMapper.insertMeetingroom(meetingroom);
	}
	
	public List<Reservation> getReservationMineList(String applicantMemberNum){
		
		List<Reservation> reservationMineList = reservationMapper.getReservationMineList(applicantMemberNum);
		
		return reservationMineList;
	}
	
	public List<Reservation> getReservationNameList(){
		
		List<Reservation> reservationNameList = reservationMapper.getReservationNameList();
		
		return reservationNameList;
	}

	public void deleteMeetingroomReservation (Reservation reservation) {
		
		reservationMapper.deleteMeetingroomReservation(reservation);
		
	}
	
}