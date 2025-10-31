package org.example.finalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DoctorTraits")
public class DoctorTrait {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int traitId;

    private String traitName;
    private String traitValue;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public int getTraitId() {
        return traitId;
    }

    public void setTraitId(int traitId) {
        this.traitId = traitId;
    }
    public String getTraitName() {
        return traitName;
    }
    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }
    public String getTraitValue() {
        return traitValue;
    }
    public void setTraitValue(String traitValue) {
        this.traitValue = traitValue;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
