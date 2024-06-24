package com.example.login_service.controller;



import com.example.login_service.entity.User;
import com.example.login_service.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String loginUser(@RequestBody User user)
    {
        return loginService.loginUser(user);
    }
}
