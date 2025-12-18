package org.example.finalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mydoctor")
public class MyDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mydocid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public int getMydocid() {
        return mydocid;
    }

    public void setMydocid(int mydocid) {
        this.mydocid = mydocid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
