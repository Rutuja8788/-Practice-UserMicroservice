package com.example.register_service.service;


import com.example.register_service.entity.User;
import com.example.register_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService
{

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user)
    {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User with email already exists: " + user.getEmail();
        }
        userRepository.save(user);
        return "User registered successfully: " + user.getName();
    }
}

