package com.ASSoftwareCompany.RoomFinderApp.Controller;


import com.ASSoftwareCompany.RoomFinderApp.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinderApp.Service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inquiries")
public class InquiryController {
    @Autowired
    private InquiryService inquiryService;


    @GetMapping("/owner/{ownerId}")
    public List<Inquiry> getInquiriesForOwner(@PathVariable Long ownerId) {
        return inquiryService.getInquiriesForOwner(ownerId);
    }
}
