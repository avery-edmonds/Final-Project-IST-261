package org.example.finalproject.repository;

import org.example.finalproject.model.MyDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyDoctorRepository extends JpaRepository<MyDoctor, Integer> {
    List<MyDoctor> findByUser_UserId(Integer userid);

    Optional<MyDoctor> findByUser_UserIdAndDoctor_DocId(Integer userId, Integer doctorId);
}
