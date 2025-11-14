package org.example.finalproject.repository;
import org.example.finalproject.model.DoctorLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorLocationRepository extends JpaRepository<DoctorLocation, Integer> {
}