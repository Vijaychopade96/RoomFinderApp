package com.ASSoftwareCompany.RoomFinderApp.Service;


import com.ASSoftwareCompany.RoomFinderApp.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinderApp.Repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryService {
    @Autowired
    private InquiryRepository inquiryRepository;

    public InquiryService(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    public List<Inquiry> getInquiriesForOwner(Long ownerId) {
        return inquiryRepository.findByRoomOwnerId(ownerId);
    }
}
