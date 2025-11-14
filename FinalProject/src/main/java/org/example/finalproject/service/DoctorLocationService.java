package org.example.finalproject.service;

import org.example.finalproject.model.DoctorLocation;
import org.example.finalproject.repository.DoctorLocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorLocationService {

    private final DoctorLocationRepository doctorLocationRepository;

    public DoctorLocationService(DoctorLocationRepository doctorLocationRepository) {
        this.doctorLocationRepository = doctorLocationRepository;
    }


    public List<DoctorLocation> findAllDoctorLocation()
    {
        return doctorLocationRepository.findAll();
    }

    public DoctorLocation getDoctorLocationById(int doctorLocationId)
    {
        return doctorLocationRepository.findById(doctorLocationId).orElse(null);
    }
    public DoctorLocation saveDoctorLocation(DoctorLocation doctorLocation)
    {
        return doctorLocationRepository.save(doctorLocation);
    }



}
