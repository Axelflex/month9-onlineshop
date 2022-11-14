package com.example.internetstore.repos;

import com.example.internetstore.domain.Food;
import com.example.internetstore.domain.FoodType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodTypeRepo extends CrudRepository<FoodType, Long> {
    List<FoodType> findByName(String name);

    List<FoodType> findByNameOrderByNameAsc(String name);
    
    List<FoodType> findByNameOrIdOrderByName(String name, int id);

    @Query("select ft from FoodType ft " +
            "inner join Food f on ft.name = f.type")
    List<FoodType> findByFoodType();

    @Query("select ft from FoodType ft " +
            "inner join Food f on ft.id = f.price " +
            "where f.price >= ?1 " +
            "ORDER BY f.price")
    List<FoodType> findByFoodPrice(float price);
}
