package com.example.internetstore.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/")
@RequiredArgsConstructor
public class RegistrationController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome here";
    }

}
