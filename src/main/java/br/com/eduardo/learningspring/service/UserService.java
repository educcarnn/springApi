package br.com.eduardo.learningspring.service;

import br.com.eduardo.learningspring.model.User;
import br.com.eduardo.learningspring.dto.CreateDepositDto;
import br.com.eduardo.learningspring.dto.UserDto;
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

    public User retrieveUser(final long id) throws Exception {

        return userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));

    }

    public User updateUser(final UserDto userData, final long id) throws  Exception{
        final User foundUser = userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));

        foundUser.setName(userData.getName());
        foundUser.setCpf(userData.getCpf());
        foundUser.setEmail(userData.getEmail());
        foundUser.setPassword(userData.getPassword());
        foundUser.setType(userData.getType());

        return userRepository.save(foundUser);
    }

    public void deleteUser(final long id ) throws Exception{
        final User foundUser = userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));

        userRepository.delete(foundUser);
    }
}
