package com.example.internetstore.repos;

import com.example.internetstore.domain.Food;
import com.example.internetstore.domain.FoodType;
import com.example.internetstore.domain.Place;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodRepo extends CrudRepository<Food, Long> {
    List<Food> findByName(String name);

    List<Food> findByPriceGreaterThan(float price);

    List<Food> findByPlaceId(int id);

    List<Food> findByTypeIdOrderByNameAsc(int id);

    @Query("select distinct f " +
            "from Food f " +
            "where f.name = :name " +
            "or f.price >= ?1 " +
            "or f.place = ?2 " +
            "or f.type = ?3 " +
            "order by f.name asc")
    List<Food> findByAny(@Param("name")String name, float price, List<Place> places, List<FoodType> types);

    @Query("select f " +
            "from Food f " +
            "INNER JOIN FoodType ft on f.type = ft.name " +
            "where ft.name = ?1")
    List<Food> findFoodByFoodTypeName (String name);
}











