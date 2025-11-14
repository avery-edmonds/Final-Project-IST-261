package org.example.finalproject;

import org.example.finalproject.model.DoctorType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DoctorTypeTest {

    @Test
    void testTypeCreation() {
        DoctorType type = new DoctorType();
        type.setTypeName("Cardiologist");
        assertEquals("Cardiologist", type.getTypeName());
    }

}
