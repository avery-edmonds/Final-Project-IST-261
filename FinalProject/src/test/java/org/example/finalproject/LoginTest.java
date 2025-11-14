package org.example.finalproject;

import org.example.finalproject.model.Login;
import org.example.finalproject.model.User;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testLoginCreation() {
        User user = new User();
        user.setFirstName("Bill");
        user.setLastName("Nye");

        Login login = new Login();
        login.setUsername("scienceguy");
        login.setPassword("password");
        login.setUser(user);

        assertEquals("scienceguy", login.getUsername());
        assertEquals("password", login.getPassword());
        assertEquals("Bill", login.getUser().getFirstName());
        assertEquals("Nye", login.getUser().getLastName());
    }
}