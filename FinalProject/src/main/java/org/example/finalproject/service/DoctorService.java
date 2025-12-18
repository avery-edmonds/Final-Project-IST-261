package org.example.finalproject.service;

import org.example.finalproject.model.Doctor;
import org.example.finalproject.model.DoctorType;
import org.example.finalproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor findDoctorById(int id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public List<Doctor> findDoctorByType(int docTypeId) {
        return doctorRepository.findByDocTypeDoctypeId(docTypeId);
    }

    public List<Doctor> findByDocLocation_DoclocationId(Integer locationId) {
        return doctorRepository.findByDocLocation_DoclocationId(locationId);
    }

    public List<Doctor> findByDocType_DoctypeIdAndDocLocation_DoclocationId(Integer typeId, Integer locationId) {
        return doctorRepository.findByDocType_DoctypeIdAndDocLocation_DoclocationId(typeId, locationId);
    }

    public List<Doctor> findByDocTypeDoctypeId(Integer typeId) {
        return doctorRepository.findByDocTypeDoctypeId(typeId);
    }

}
