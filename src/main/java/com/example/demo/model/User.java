package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {
    private String name;

    private String cpf;

    private String password;

    private String type;

    private Float balance;
}
