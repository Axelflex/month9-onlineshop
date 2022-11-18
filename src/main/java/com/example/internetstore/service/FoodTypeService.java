package com.example.internetstore.service;

import com.example.internetstore.domain.FoodType;
import com.example.internetstore.repos.FoodTypeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodTypeService {
    private final FoodTypeRepo foodTypeRepo;

    public List<FoodType>findByName(String name){
        return foodTypeRepo.findByName(name);
    }
    public List<FoodType>findByNameOrderByNameAsc(String name){
        return foodTypeRepo.findByNameOrderByNameAsc(name);
    }
    public List<FoodType>findByNameOrIdOrderByName(String name, int id){
        return foodTypeRepo.findByNameOrIdOrderByName(name, id);
    }
    public List<FoodType>findByFoodType(String type){
        return foodTypeRepo.findByFoodType(type);
    }
    public List<FoodType>findByFoodPrice(float price){
        return foodTypeRepo.findByFoodPrice(price);
    }

}
