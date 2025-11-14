package org.example.finalproject.controller;

import org.example.finalproject.model.DoctorLocation;
import org.example.finalproject.service.DoctorLocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DoctorLocationController {
    private DoctorLocationService doctorLocationService;

    public DoctorLocationController(DoctorLocationService doctorLocationService) {
        this.doctorLocationService = doctorLocationService;
    }

    @GetMapping("/locations")
    public List<DoctorLocation> getAllLocations(){
        return doctorLocationService.findAllDoctorLocation();
    }

    @GetMapping("/locations/{doclocationId}")
    public DoctorLocation getLocation(@PathVariable int doclocationId){
        return doctorLocationService.getDoctorLocationById(doclocationId);
    }


}
