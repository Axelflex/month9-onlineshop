package com.example.internetstore.controllers;

import com.example.internetstore.domain.User;
import com.example.internetstore.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepo userRepo;
    @GetMapping("/allUsers")
    public Iterable<User> allUsers(){
        return this.userRepo.findAll();
    }
}
