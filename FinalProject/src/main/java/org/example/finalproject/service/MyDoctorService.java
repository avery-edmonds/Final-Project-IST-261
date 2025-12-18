package org.example.finalproject.service;

import org.example.finalproject.model.Doctor;
import org.example.finalproject.model.MyDoctor;
import org.example.finalproject.model.User;
import org.example.finalproject.repository.DoctorRepository;
import org.example.finalproject.repository.MyDoctorRepository;
import org.example.finalproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyDoctorService {

    private final MyDoctorRepository myDoctorRepository;
    private final UserRepository userRepository;
    private final DoctorRepository doctorRepository;

    public MyDoctorService(MyDoctorRepository myDoctorRepository, UserRepository userRepository, DoctorRepository doctorRepository) {
        this.myDoctorRepository = myDoctorRepository;
        this.userRepository = userRepository;
        this.doctorRepository = doctorRepository;
    }

    public MyDoctor addDoctor(Integer userid, Integer doctorid) {
        User user = userRepository.findById(userid).orElseThrow(() -> new RuntimeException("User not found"));
        Doctor doctor = doctorRepository.findById(doctorid).orElseThrow(() -> new RuntimeException("Doctor not found"));

        MyDoctor myDoctor = new MyDoctor();
        myDoctor.setUser(user);
        myDoctor.setDoctor(doctor);

        return myDoctorRepository.save(myDoctor);
    }

    public List<MyDoctor> getDoctorsforUser(Integer userid) {
        return myDoctorRepository.findByUser_UserId(userid);
    }

    public void removeDoctor(Integer userId, Integer doctorId) {

        MyDoctor mydoctor = myDoctorRepository.findByUser_UserIdAndDoctor_DocId(userId, doctorId).orElseThrow(() -> new RuntimeException("Doctor Relationship not found"));
        myDoctorRepository.delete(mydoctor);

    }
}
