package com.example.internetstore.repos;

import com.example.internetstore.domain.Place;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PlaceRepo extends PagingAndSortingRepository<Place, Long> {
    List<Place> findById(int id);
    List<Place> findPlaceByName(String name);
    List<Place> findPlaceByAddress(String address, Sort sort);
    @Query("select p from Place p " +
            "inner join Food f on p.name = f.name " +
            "inner join FoodType ft on ft.name = f.name " +
            "where ft.name = ?1")
    List<Place> findByFoodTypeName(String type);
    @Query("select p from Place p " +
            "inner join Food f on p.name = f.name " +
            "where f.price >= ?1")
    List<Place> findBy(float price);

}
