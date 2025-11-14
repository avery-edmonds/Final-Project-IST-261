package org.example.finalproject.repository;

import org.example.finalproject.model.DoctorType;
import org.example.finalproject.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
    List<Doctor> findByDocType(DoctorType doctype);

    List<Doctor> docType(DoctorType docType);

    List<Doctor> findByDocTypeDoctypeId(int docTypeId);

    List<Doctor> findByDocLocation_DoclocationId(Integer locationId);

    List<Doctor> findByDocType_DoctypeIdAndDocLocation_DoclocationId(int docTypeId, int docLocationId);
}
