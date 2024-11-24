package com.ASSoftwareCompany.RoomFinderApp.Controller;

import com.ASSoftwareCompany.RoomFinderApp.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinderApp.Model.Room;

import com.ASSoftwareCompany.RoomFinderApp.Repository.InquiryRepository;
import com.ASSoftwareCompany.RoomFinderApp.Repository.RoomOwnerRepository;
import com.ASSoftwareCompany.RoomFinderApp.Repository.RoomRepository;
import com.ASSoftwareCompany.RoomFinderApp.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomService roomService;

    private RoomOwnerRepository roomOwnerRepository;

    @Autowired
    private InquiryRepository inquiryRepository;

    @GetMapping("/search")
    public List<Room> searchRooms(@RequestParam String location) {
        return roomService.searchRoomsByLocation(location);
    }

    @PostMapping("/{roomId}/inquire")
    public Inquiry createInquiry(@PathVariable Long roomId, @RequestBody Inquiry inquiry) {
        inquiry.setRoom(roomRepository.findById(roomId).orElseThrow(() -> new RuntimeException("Room not found")));
        return inquiryRepository.save(inquiry);
    }
    @PostMapping("/register/{ownerId}")
    public ResponseEntity<String> registerRoom(
            @PathVariable Long ownerId, @RequestBody Room room) {
        Room savedRoom = roomService.registerRoom(ownerId, room);
        return ResponseEntity.ok("Room registered successfully with ID: " + savedRoom.getId());
    }

}
