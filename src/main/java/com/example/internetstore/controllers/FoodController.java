package com.example.internetstore.controllers;

import com.example.internetstore.domain.Food;
import com.example.internetstore.domain.FoodType;
import com.example.internetstore.domain.Place;
import com.example.internetstore.repos.FoodRepo;
import com.example.internetstore.repos.FoodTypeRepo;
import com.example.internetstore.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/food")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService service;

    @GetMapping("/findByFoodName")
    public ResponseEntity<List<Food>> findByName(@RequestParam String food){
        return ResponseEntity.ok(service.findByName(food));
    }
    @GetMapping("/findByPrice")
    public ResponseEntity<List<Food>> findByName(@RequestParam float price){
        return ResponseEntity.ok(service.findByPrice(price));
    }
    @GetMapping("/findByPlace")
    public ResponseEntity<List<Food>> findByPlace(@RequestParam int placeId){
        return ResponseEntity.ok(service.findByPlace(placeId));
    }
    @GetMapping("/findByTypeId{id}")
    public ResponseEntity<List<Food>> findByTypeId(@PathVariable int id){
        return ResponseEntity.ok(service.findByType(id));
    }
    @GetMapping("/findByAny")
    public ResponseEntity<List<Food>> findByAny(@RequestParam String foodName,
                                                @RequestParam float price,
                                                @RequestParam List<Place> places,
                                                @RequestParam List<FoodType> types){
        return ResponseEntity.ok(service.findByAny(foodName, price, places, types));
    }
    @GetMapping("/findByTypeName")
    public ResponseEntity<List<Food>> findByTypeName(@RequestParam String foodTypeName){
        return ResponseEntity.ok(service.findByTypeName(foodTypeName));
    }
}


















