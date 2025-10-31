package org.example.finalproject;

import com.example.finalproject.model.Doctor;
import com.example.finalproject.model.DoctorTrait;
import com.example.finalproject.model.DoctorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DoctorTraitTest {

    @Test
    public void testSettersAndGetters() {
        DoctorTrait trait = new DoctorTrait();

        trait.setTraitId(1);
        trait.setTraitName("Experience");
        trait.setTraitValue("10 years");

        DoctorType docType = new DoctorType();
        docType.setDocTypeId(10);
        docType.setTypeName("Cardiologist");

        Doctor doctor = new Doctor();
        doctor.setDocId(100);
        doctor.setDocFirstName("John");
        doctor.setDocLastName("Doe");
        doctor.setDocType(docType);

        trait.setDoctor(doctor);

        assertEquals(1, trait.getTraitId());
        assertEquals("Experience", trait.getTraitName());
        assertEquals("10 years", trait.getTraitValue());
        assertNotNull(trait.getDoctor());
        assertEquals(100, trait.getDoctor().getDocId());
        assertEquals("John", trait.getDoctor().getDocFirstName());
    }

    @Test
    public void testDoctorAssociation() {
        Doctor doctor = new Doctor();
        doctor.setDocId(101);
        doctor.setDocFirstName("Alice");
        doctor.setDocLastName("Smith");

        DoctorTrait trait = new DoctorTrait();
        trait.setTraitName("Compassionate");
        trait.setTraitValue("High");
        trait.setDoctor(doctor);

        assertEquals("Alice", trait.getDoctor().getDocFirstName());
        assertEquals("Compassionate", trait.getTraitName());
        assertEquals("High", trait.getTraitValue());
    }

    @Test
    public void testNullDoctor() {
        DoctorTrait trait = new DoctorTrait();
        trait.setTraitName("Efficiency");
        trait.setTraitValue("Excellent");
        trait.setDoctor(null);

        assertNull(trait.getDoctor());
        assertEquals("Efficiency", trait.getTraitName());
        assertEquals("Excellent", trait.getTraitValue());
    }
}
