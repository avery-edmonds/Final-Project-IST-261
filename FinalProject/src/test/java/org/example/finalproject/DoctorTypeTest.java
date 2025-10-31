package org.example.finalproject;

import com.example.finalproject.model.DoctorType;
import org.junit.jupiter.api.Test;

public class DoctorTypeTest {

    @Test
    void testTypeCreation() {
        DoctorType type = new DoctorType();
        type.setTypeName("Cardiologist");
        assertEquals("Cardiologist", type.getTypeName());
    }

}
