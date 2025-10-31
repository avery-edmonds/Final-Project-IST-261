package org.example.finalproject;

import com.example.finalproject.model.Doctor;
import com.example.finalproject.model.Document;
import com.example.finalproject.model.User;
import org.junit.jupiter.api.Test;

public class DocumentTest {

    @Test
    void testDocumentCreation() {
        Doctor doctor = new Doctor();
        doctor.setDocFirstName("Alex");

        User user = new User();
        user.setFirstName("Jane");

        Document doc = new Document();
        doc.setDoctor(doctor);
        doc.setUser(user);
        doc.setDocumentName("Prescription");
        doc.setDocumentType("PDF");
        doc.setDocumentUrl("https://pdfobject.com/pdf/sample.pdf");
        doc.setNotes("Appointment Needed");

        assertEquals("Alex", doc.getDoctor().getDocFirstName());
        assertEquals("Jane", doc.getUser().getFirstName());
        assertEquals("Prescription", doc.getDocumentName());
        assertEquals("PDF", doc.getDocumentType());
        assertEquals("https://pdfobject.com/pdf/sample.pdf", doc.getDocumentUrl());
        assertEquals("Appointment Needed", doc.getNotes());

    }
}
