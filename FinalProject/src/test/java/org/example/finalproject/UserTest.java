package org.example.finalproject;

import org.example.finalproject.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNull;

public class UserTest {

    @Test
    void testUserCreation() {
        User user = new User();
        user.setFirstName("Bill");
        user.setLastName("Nye");
        user.setEmail("scienceguy@gmail.com");
        user.setBirthDate(LocalDate.of(1955, 11, 27));
        user.setInsurance("Independence");

        assertEquals("Bill", user.getFirstName());
        assertEquals("Nye", user.getLastName());
        assertEquals("scienceguy@gmail.com", user.getEmail());
        assertEquals(LocalDate.of(1955, 11, 27), user.getBirthDate());
        assertEquals("Independence", user.getInsurance());
    }
}
