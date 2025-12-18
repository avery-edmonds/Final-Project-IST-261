package org.example.finalproject.controller;

import org.example.finalproject.model.MyDoctor;
import org.example.finalproject.repository.MyDoctorRepository;
import org.example.finalproject.service.MyDoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MyDoctorController {

    private final MyDoctorService myDoctorService;

    public  MyDoctorController(MyDoctorService myDoctorService) {
        this.myDoctorService = myDoctorService;
    }

    @PostMapping("/user/{userId}/doctor/{docId}")
    public MyDoctor addDoctor(@PathVariable Integer userId, @PathVariable("docId") Integer doctorId) {
        return myDoctorService.addDoctor(userId, doctorId);
    }
    @GetMapping("/user/{userId}/mydoctors")
    public List<MyDoctor> getMyDoctors(@PathVariable Integer userId) {
        return myDoctorService.getDoctorsforUser(userId);
    }
    @DeleteMapping("/user/{userId}/mydoctors/{docId}")
    public void deleteDoctor(@PathVariable Integer userId, @PathVariable("docId") Integer doctorId) {
        myDoctorService.removeDoctor(userId, doctorId);
    }


}
