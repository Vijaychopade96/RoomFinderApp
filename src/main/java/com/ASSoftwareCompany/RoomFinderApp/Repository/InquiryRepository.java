package com.ASSoftwareCompany.RoomFinderApp.Repository;


import com.ASSoftwareCompany.RoomFinderApp.Model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
    List<Inquiry> findByRoomOwnerId(Long ownerId);

}
