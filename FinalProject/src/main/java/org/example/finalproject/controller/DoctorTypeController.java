package org.example.finalproject.controller;

import org.example.finalproject.model.DoctorType;
import org.example.finalproject.service.DoctorTypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctortype")
@CrossOrigin(origins = "*")
public class DoctorTypeController {

    private final DoctorTypeService doctorTypeService;

    public DoctorTypeController(DoctorTypeService doctorTypeService) {
        this.doctorTypeService = doctorTypeService;
    }

    @GetMapping
    public List<DoctorType> getAllDoctorTypes() {
        return doctorTypeService.findAllTypes();
    }
}
