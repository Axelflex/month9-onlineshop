package com.example.internetstore.controllers;

import com.example.internetstore.domain.FoodType;
import com.example.internetstore.service.FoodTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/foodtypes")
@RequiredArgsConstructor
public class FoodTypeController {
    private final FoodTypeService service;

    @GetMapping("/findByName")
    public ResponseEntity<List<FoodType>> findByName(String name){
        return ResponseEntity.ok(service.findByName(name));
    }
    @GetMapping("/findByNameOrdered")
    public ResponseEntity<List<FoodType>> findByNameOrdered(String name){
        return ResponseEntity.ok(service.findByNameOrderByNameAsc(name));
    }
    @GetMapping("/findByNameOrId")
    public ResponseEntity<List<FoodType>> findByNameOrId(String name, int id){
        return ResponseEntity.ok(service.findByNameOrIdOrderByName(name, id));
    }
    @GetMapping("/findByFoodType")
    public ResponseEntity<List<FoodType>> findByFoodType(String type){
        return ResponseEntity.ok(service.findByFoodType(type));
    }
    @GetMapping("/findByName")
    public ResponseEntity<List<FoodType>> findByFoodPrice(float price){
        return ResponseEntity.ok(service.findByFoodPrice(price));
    }
}
