package com.example.internetstore.service;

import com.example.internetstore.domain.User;
import com.example.internetstore.dto.UserDto;
import com.example.internetstore.exceptions.UserIsExistException;
import com.example.internetstore.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User addUser(UserDto userDto){
        User user = User.builder()
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
        userRepo.findAll().forEach(users -> {
            if(userDto.getEmail().equals(users.getEmail())){
                try {
                    throw new UserIsExistException("User is already exist with: '" + userDto.getEmail() + "' email");
                } catch (UserIsExistException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        userRepo.save(user);
        return user;
    }

    public Iterable<User> getAllUsers(){
        return userRepo.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepo.findById(id);
    }
}
