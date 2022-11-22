package com.example.internetstore.controllers;

import com.example.internetstore.domain.Place;
import com.example.internetstore.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/places")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PlaceController {
    private final PlaceService service;
    @GetMapping("/findAllPlaces/{offset}/{size}")
    public ResponseEntity<Page<Place>> findAll(@PathVariable int offset, @PathVariable int size){
        return ResponseEntity.ok(service.findAll(offset, size));
    }
    @GetMapping("/findPlaceByName")
    public ResponseEntity<List<Place>> findPlaceByName(@RequestParam String name){
        return ResponseEntity.ok(service.findPlaceByName(name));
    }
    @GetMapping("/findPlaceByAddress")
    public ResponseEntity<List<Place>> findPlaceByAddress(@RequestParam String address,
                                                @RequestParam Sort sort){
        return ResponseEntity.ok(service.findPlaceByAddress(address, sort));
    }
    @GetMapping("/findByPlaceFoodTypeName")
    public ResponseEntity<List<Place>> findByFoodTypeName(@RequestParam String type){
        return ResponseEntity.ok(service.findByFoodTypeName(type));
    }
    @GetMapping("/findByPlacePrice")
    public ResponseEntity<List<Place>> findByPrice(@RequestParam float price){
        return ResponseEntity.ok(service.findByPrice(price));
    }
    @GetMapping("/Place{id}")
    public ResponseEntity<List<Place>> findById(@PathVariable int id){
        return ResponseEntity.ok(service.findById(id));
    }
}
