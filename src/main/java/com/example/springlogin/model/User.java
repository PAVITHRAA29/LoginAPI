package com.example.springlogin.model;

import jakarta.persistence.*;

@Entity
@Table(name="instadb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    //default constructor
    public User() {
    }
    public String getPassword() {
        return password;
    }
}
