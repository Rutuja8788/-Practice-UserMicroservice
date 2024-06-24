package com.example.login_service.service;


import com.example.login_service.entity.User;
import com.example.login_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public String loginUser(User user)
    {
        User foundUser = userRepository.findByEmail(user.getEmail());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword()))
        {
            return "User logged in successfully: " + user.getEmail();
        } else {
            return "Invalid credentials";
        }
    }
}

