package com.example.internetstore.controllers;

import com.example.internetstore.domain.Food;
import com.example.internetstore.domain.FoodType;
import com.example.internetstore.domain.Place;
import com.example.internetstore.repos.FoodRepo;
import com.example.internetstore.repos.FoodTypeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/foods")
@RequiredArgsConstructor
public class FoodController {
    private final FoodRepo foodRepo;
    @GetMapping("/get")
    public List<Food> get(@RequestParam int id){
        return foodRepo.findByPlaceId(id);
    }
}
