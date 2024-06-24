package com.example.login_service.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")  // Ensure the table name is the same as in Register Service
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true)  // Explicitly specifying the column name and unique constraint
    private String email;

    @Column(name = "password")  // Explicitly specifying the column name
    private String password;


}
