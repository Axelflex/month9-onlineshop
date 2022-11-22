package com.example.internetstore.service;

import com.example.internetstore.domain.Place;
import com.example.internetstore.repos.PlaceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepo placeRepo;

    public List<Place> findById(int id){
        return placeRepo.findById(id);
    }
    public Page<Place> findAll(int offset, int size){
        return placeRepo.findAll(PageRequest.of(offset, size));
    }
    public List<Place> findPlaceByName(String name){
        return placeRepo.findPlaceByName(name);
    }
    public List<Place> findPlaceByAddress(String address, Sort sort){
        return placeRepo.findPlaceByAddress(address, sort);
    }
    public List<Place> findByFoodTypeName(String type){
        return placeRepo.findByFoodTypeName(type);
    }
    public List<Place> findByPrice(float price){
        return placeRepo.findBy(price);
    }
}
