package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length=92, nullable = false)
    private String name;
    
    @Column(length=11, nullable = false, unique = true)
    private String cpf;

    @Column(length=62, nullable = false, unique = true)
    private String email;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String password;

    @Column(length = 6, nullable = false)
    private String type;

    @Column(columnDefinition = "DECIMAL DEFAULT 0.0")
    private Float balance;
}
