package org.example.finalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DoctorLocation")
public class DoctorLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doclocationId;

    private String name;
    private String city;
    private String state;

    public DoctorLocation() {}

    public DoctorLocation(String name, String city, String state) {
        this.name = name;
        this.city = city;
    }
    public int getDocLocationId() {
        return doclocationId;
    }
    public void setDocLocationId(int doclocationId) {
        this.doclocationId = doclocationId;
    }
    public String getLocationName() {
        return name;
    }
    public void setLocationName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }


}
