package org.example.finalproject;

import com.example.finalproject.model.DoctorLocation;
import org.junit.jupiter.api.Test;

public class DoctorLocationTest {

    @Test
    void testLocationCreation() {
        DoctorLocation location = new DoctorLocation();
        location.setLocationName("St Luke's Hospital");
        location.setCity("Hazleton");
        location.setState("PA");

        assertEquals("St Luke's Hospital", location.getLocationName());
        assertEquals("Hazleton", location.getCity());
        assertEquals("PA", location.getState());
    }


}
