package org.example.finalproject.service;

import org.example.finalproject.model.Login;
import org.example.finalproject.model.User;
import org.example.finalproject.repository.LoginRepository;
import org.example.finalproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    private LoginRepository loginRepository;
    private UserRepository userRepository;

    public  LoginService(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    public User login (String username, String password) {
        Login login;

        if(username.contains("@") && username.contains(".")) {
            var user = userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Username or Email not found"));

            login = loginRepository.findByUserUserId(user.getUserId()).orElseThrow(() -> new RuntimeException("Username or Email not found!"));
        } else{
            login = loginRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("Username or Email not found!"));
        }

        if(!login.getPassword().equals(password)){
            throw new RuntimeException("Invalid Username/Email or Password!");
        }

        return userRepository.findById(login.getLoginId()).orElseThrow(()-> new RuntimeException("User not found"));
    }


}
