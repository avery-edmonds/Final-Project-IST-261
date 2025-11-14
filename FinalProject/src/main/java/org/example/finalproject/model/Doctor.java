package org.example.finalproject.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docId;

    @Column(name = "doc_firstname")
    private String docFirstname;
    @Column(name = "doc_lastname")
    private String docLastname;
    @Column(name = "doctorate")
    private String doctorate;
    @Column(name = "docimage_url")
    private String doctorImage;

    @ManyToOne
    @JoinColumn(name = "doctype_id")
    private DoctorType docType;

    @ManyToOne
    @JoinColumn(name = "doclocation_id")
    private DoctorLocation docLocation;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<DoctorTrait> traits;

    public Doctor() {
    }
    public Doctor(int docId) {
        this.docId = docId;
    }
    public int getDocId() {
        return docId;
    }
    public void setDocId(int docId) {
        this.docId = docId;
    }
    public String getDocFirstName() {
        return docFirstname;
    }
    public void setDocFirstName(String docFirstname) {
        this.docFirstname = docFirstname;
    }
    public String getDocLastName() {
        return docLastname;
    }
    public void setDocLastName(String docLastname) {
        this.docLastname = docLastname;
    }
    public String getDoctorate() {
        return doctorate;
    }
    public void setDoctorate(String doctorate) {
        this.doctorate = doctorate;
    }
    public DoctorType getDocType() {
        return docType;
    }
    public void setDocType(DoctorType docType) {
        this.docType = docType;
    }
    public DoctorLocation getDocLocation() {
        return docLocation;
    }
    public void setDocLocation(DoctorLocation docLocation) {
        this.docLocation = docLocation;
    }
    public List<DoctorTrait> getDocTraits() {
        return traits;
    }
    public void setDocTraits(List<DoctorTrait> traits) {
        this.traits = traits;
    }
    public String getDoctorImage() {
        return doctorImage;
    }
    public void setDoctorImage(String doctorImage) {
        this.doctorImage = doctorImage;
    }


}
