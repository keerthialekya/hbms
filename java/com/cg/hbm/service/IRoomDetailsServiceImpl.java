package com.cg.hbm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entities.RoomDetails;
import com.cg.hbm.dao.IRoomDetailsRepository;

@Service
public class IRoomDetailsServiceImpl implements IRoomDetailsService{
	@Autowired
	IRoomDetailsRepository iDao;

	@Override
	public RoomDetails addRoomDetails(RoomDetails roomDetails) {
		return iDao.save(roomDetails);
	}

	@Override
	public RoomDetails updateRoomDetails(RoomDetails roomDetails) {
		return iDao.saveAndFlush(roomDetails);
	}

	@Override
	public RoomDetails removeRoomDetails(RoomDetails roomDetails) {
		iDao.deleteById(roomDetails.getRoom_id());
		return roomDetails;
	}

	@Override
	public List<RoomDetails> showAllRoomDetails() {
		return iDao.findAll();
	}

	@Override
	public RoomDetails showRoomDetails(int roomDetails_id) {
		return iDao.findById(roomDetails_id).get();
	}

}