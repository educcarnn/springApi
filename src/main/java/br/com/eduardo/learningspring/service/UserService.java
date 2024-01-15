package br.com.eduardo.learningspring.service;

import br.com.eduardo.learningspring.model.User;
import br.com.eduardo.learningspring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(final User userData) {

        final User user = new User(userData.getName(), userData.getCpf(), userData.getEmail(), userData.getPassword(), userData.getType());

        return userRepository.save(user);

    }

    public List<User> readUsers() {
        return userRepository.findAll();
    }
    
}