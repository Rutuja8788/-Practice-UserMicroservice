
package com.example.Combined.Service.controller;

import com.example.Combined.Service.entity.User;
import com.example.Combined.Service.service.CombinedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/combined")
public class CombinedController
{

    @Autowired
    private CombinedService combinedService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user)
    {
        return combinedService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user)
    {
        return combinedService.loginUser(user);
    }
}
