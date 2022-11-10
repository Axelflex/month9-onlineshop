package com.example.internetstore.repos;

import com.example.internetstore.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
