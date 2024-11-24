package com.ASSoftwareCompany.RoomFinderApp.Repository;


import com.ASSoftwareCompany.RoomFinderApp.Model.RoomOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomOwnerRepository extends JpaRepository<RoomOwner, Long> {
}
