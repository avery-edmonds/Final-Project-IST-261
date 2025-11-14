package org.example.finalproject.repository;

import org.example.finalproject.model.DoctorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorTypeRepository extends JpaRepository<DoctorType, Integer> {
}
