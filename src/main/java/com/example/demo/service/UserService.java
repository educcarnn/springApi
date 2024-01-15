package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(final User userData){
        final User user = new User(userData.getName(), userData.getCpf(), userData.getEmail(), userData.getPassword(), userData.getType());
        
        return userRepository.save(user);
    }

    public List<User> readUsers(){
        return userRepository.findAll();
    }
}
