package org.example.finalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor_type")
public class DoctorType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctypeId;

    private String name;

    public DoctorType() {
    }

    public DoctorType(String name) {
        this.name = name;
    }

    public DoctorType(int doctypeId, String name) {
        this.doctypeId = doctypeId;
    }
    public int getDocTypeId() {
        return doctypeId;
    }
    public void setDocTypeId(int doctypeId) {
        this.doctypeId = doctypeId;
    }
    public String getTypeName() {
        return name;
    }
    public void setTypeName(String name) {
        this.name = name;
    }

}
