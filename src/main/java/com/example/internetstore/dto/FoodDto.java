package com.example.internetstore.dto;

import com.example.internetstore.domain.FoodType;
import com.example.internetstore.domain.Place;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDto {
    @NotBlank(message = "Please enter a name")
    private String name;
    @NotBlank(message = "Please provide a photo")
    private String image;
    @NotBlank(message = "Choose you food type")
    private FoodType type;
    @NotBlank(message = "Please enter a price")
    private float price;
    @NotBlank(message = "Please provide a location")
    private Place place;
}
