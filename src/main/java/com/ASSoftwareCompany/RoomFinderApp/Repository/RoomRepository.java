package com.ASSoftwareCompany.RoomFinderApp.Repository;

import com.ASSoftwareCompany.RoomFinderApp.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByLocationContaining(String location);


}
