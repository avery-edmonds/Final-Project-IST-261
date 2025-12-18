package org.example.finalproject.controller;

import org.example.finalproject.model.Login;
import org.example.finalproject.model.User;
import org.example.finalproject.repository.LoginRepository;
import org.example.finalproject.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {


    private LoginService loginService;
    private LoginRepository loginRepository;

    public LoginController(LoginService loginService, LoginRepository loginRepository) {
        this.loginService = loginService;
        this.loginRepository = loginRepository;
    }

    @GetMapping("/exists/username")
    public boolean existsByUsername(@RequestParam String username) {
        return loginRepository.existsByUsername(username);
    }

    @GetMapping("/login/get/{id}")
    public Login getLoginById(@PathVariable int id){
        return loginRepository.findByUserUserId(id).orElse(null);
    }

    @PostMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }

    @PostMapping("/register")
    public String registerLogin(@RequestBody Login login) {
        loginRepository.save(login);
        return "User Successfully Registered";
    }

}
