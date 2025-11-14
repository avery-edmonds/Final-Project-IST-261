package org.example.finalproject.service;

import org.example.finalproject.model.DoctorType;
import org.example.finalproject.repository.DoctorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorTypeService {

    @Autowired
    private DoctorTypeRepository doctorTypeRepository;

    public DoctorTypeService(DoctorTypeRepository doctorTypeRepository) {
        this.doctorTypeRepository = doctorTypeRepository;
    }

    public List<DoctorType> findAllTypes() {
        return doctorTypeRepository.findAll();
    }

    public DoctorType findById(int id) {
        return doctorTypeRepository.findById(id).get();
    }

    public DoctorType saveType(DoctorType doctorType) {
        return doctorTypeRepository.save(doctorType);
    }

    public void deleteType(int id) {
        doctorTypeRepository.deleteById(id);
    }
}
