package com.example.internetstore.controllers;

import com.example.internetstore.domain.User;
import com.example.internetstore.dto.UserDto;
import com.example.internetstore.repos.UserRepo;
import com.example.internetstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    @PostMapping("/register")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserDto userDto){
        return new ResponseEntity<>(service.addUser(userDto), HttpStatus.CREATED);
    }
    @GetMapping("/allUsers")
    public ResponseEntity<Iterable<User>> getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/user{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable Long id){
        return ResponseEntity.ok(service.getUser(id));
    }
}
