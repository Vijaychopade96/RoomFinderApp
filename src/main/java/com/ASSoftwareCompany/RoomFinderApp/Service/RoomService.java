package com.ASSoftwareCompany.RoomFinderApp.Service;


import com.ASSoftwareCompany.RoomFinderApp.Model.Room;
import com.ASSoftwareCompany.RoomFinderApp.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> searchRoomsByLocation(String location) {
        return roomRepository.findByLocationContaining(location);
    }


    public Room registerRoom(Long ownerId, Room room) {
        return room;
    }
}
