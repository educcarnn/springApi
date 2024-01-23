package br.com.eduardo.learningspring.controller;

import br.com.eduardo.learningspring.model.User;
import br.com.eduardo.learningspring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.eduardo.learningspring.dto.UserDto;
import br.com.eduardo.learningspring.dto.CreateDepositDto;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody final User userdata) {
        final User createdUser = userService.createUser(userdata);

        return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> readUsers() {
        final List<User> allUsers = userService.readUsers();

        return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> retrieveUser(@PathVariable final String id) throws Exception {

        final User user = userService.retrieveUser(Long.parseLong(id));

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody final UserDto userData, @PathVariable final String id) throws Exception {

        final User updatedUser = userService.updateUser(userData, Long.parseLong(id));


        return new ResponseEntity<User>(updatedUser, HttpStatus.OK);

    }
}
