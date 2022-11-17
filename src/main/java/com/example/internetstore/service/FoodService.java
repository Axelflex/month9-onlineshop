package com.example.internetstore.service;

import com.example.internetstore.domain.Food;
import com.example.internetstore.domain.FoodType;
import com.example.internetstore.domain.Place;
import com.example.internetstore.repos.FoodRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    public final FoodRepo foodRepo;

    public List<Food> findByName(String foodName){
        return foodRepo.findByName(foodName);
    }
    public List<Food> findByPrice(float price){
        return foodRepo.findByPriceGreaterThan(price);
    }
    public List<Food> findByPlace(int id){
        return foodRepo.findByPlaceId(id);
    }
    public List<Food> findByType(int id){
        return foodRepo.findByTypeIdOrderByNameAsc(id);
    }
    public List<Food> findByAny(String foodName, float price, List<Place> places, List<FoodType> types){
        return foodRepo.findByAny(foodName, price, places, types);
    }
    public List<Food> findByTypeName(String foodTypeName){
        return foodRepo.findFoodByFoodTypeName(foodTypeName);
    }
}
