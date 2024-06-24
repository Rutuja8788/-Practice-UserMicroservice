package com.example.register_service.controller;


import com.example.register_service.entity.User;
import com.example.register_service.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController
{

    @Autowired
    private RegisterService registerService;

    @PostMapping
    public String registerUser(@RequestBody User user)
    {
        return registerService.registerUser(user);
    }
}

