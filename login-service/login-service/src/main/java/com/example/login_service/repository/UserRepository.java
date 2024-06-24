package com.example.login_service.repository;


import com.example.login_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByEmail(String email);  // Querying by email
}