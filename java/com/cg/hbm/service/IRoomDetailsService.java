package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entities.RoomDetails;

public interface IRoomDetailsService {
	public RoomDetails addRoomDetails(RoomDetails roomDetails);
	public RoomDetails updateRoomDetails(RoomDetails roomDetails);
	public RoomDetails removeRoomDetails(RoomDetails roomDetails);
	public List<RoomDetails> showAllRoomDetails();
	public RoomDetails showRoomDetails(int roomDetails_id);
}

//List<RoomDetails> updateRoomDetails(RoomDetails roomDetails)
// List<RoomDetails> removeRoomDetails(Integer room_id)
//c User showRoomDetails(Integer room_id)
