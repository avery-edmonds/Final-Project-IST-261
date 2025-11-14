package org.example.finalproject.controller;

import org.example.finalproject.model.Doctor;
import org.example.finalproject.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;

    }

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(
            @RequestParam(required = false) Integer typeId,
            @RequestParam(required = false) Integer locationId) {

        if (typeId != null && locationId != null) {
            return doctorService.findByDocType_DoctypeIdAndDocLocation_DoclocationId(typeId, locationId);
        } else if (typeId != null) {
            return doctorService.findByDocTypeDoctypeId(typeId);
        } else if (locationId != null) {
            return doctorService.findByDocLocation_DoclocationId(locationId);
        } else {
            return doctorService.findAllDoctors();
        }
    }

    @GetMapping("/by-type/{docTypeId}")
    public List<Doctor> findDoctorByType(@PathVariable int docTypeId){
        return doctorService.findDoctorByType(docTypeId);
    }
}

