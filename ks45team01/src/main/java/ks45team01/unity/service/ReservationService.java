package ks45team01.unity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team01.unity.dto.Meetingroom;
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
	
}