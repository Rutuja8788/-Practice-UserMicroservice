package com.example.register_service.entity;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")  // Explicitly specifying the table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")  // Explicitly specifying the column name
    private String name;

    @Column(name = "email", unique = true)  // Explicitly specifying the column name and unique constraint
    private String email;

    @Column(name = "password")  // Explicitly specifying the column name
    private String password;
    @Column(name= "role")
    private String role;


    // Getters and Setters
}

