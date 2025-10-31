package org.example.finalproject;

import com.example.finalproject.model.Doctor;
import com.example.finalproject.model.DoctorLocation;
import com.example.finalproject.model.DoctorTrait;
import com.example.finalproject.model.DoctorType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DoctorTest {

    @Test
    void testDoctorCreation() {
        Doctor doctor = new Doctor();
        doctor.setDocFirstName("Alice");
        doctor.setDocLastName("Johnson");
        doctor.setDoctorate("MD");
        doctor.setDocType(new DoctorType("Cardiologist"));
        doctor.setDocLocation(new DoctorLocation("St Luke's Hospital", "Hazleton", "PA"));

        DoctorTrait t1 = new DoctorTrait();
        t1.setTraitName("Experience");
        t1.setTraitValue("10 years");

        DoctorTrait t2 = new DoctorTrait();
        t2.setTraitName("Sex");
        t2.setTraitValue("Female");

        DoctorTrait t3 = new DoctorTrait();
        t3.setTraitName("Language");
        t3.setTraitValue("English");

        List<DoctorTrait> traits = Arrays.asList(t1, t2, t3);
        doctor.setDocTraits(traits);

        doctor.setDoctorImage("https://thumbs.dreamstime.com/b/young-male-doctor-close-up-happy-looking-camera-56751540.jpg");

        assertEquals("Alice", doctor.getDocFirstName());
        assertEquals("Johnson", doctor.getDocLastName());
        assertEquals("MD", doctor.getDoctorate());
        assertEquals("Cardiologist", doctor.getDocType().getTypeName());
        assertEquals("St Luke's Hospital", doctor.getDocLocation().getLocationName());

        assertEquals(3, doctor.getDocTraits().size());


        List<String> traitNames = doctor.getDocTraits().stream()
                .map(DoctorTrait::getTraitName)
                .toList();
        assertTrue(traitNames.contains("Sex"));
        assertTrue(traitNames.contains("Experience"));


        DoctorTrait ratingTrait = doctor.getDocTraits().stream()
                .filter(t -> "Sex".equals(t.getTraitName()))
                .findFirst()
                .orElse(null);
        assertNotNull(ratingTrait);
        assertEquals("Female", ratingTrait.getTraitValue());

        assertEquals("https://thumbs.dreamstime.com/b/young-male-doctor-close-up-happy-looking-camera-56751540.jpg", doctor.getDoctorImage());
    }
}
