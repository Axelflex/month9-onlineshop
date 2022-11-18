package com.example.internetstore.dto;

import com.example.internetstore.domain.Food;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodTypeDto {
    @NotBlank(message = "Please enter the name")
    private String name;
    @NotBlank(message = "Please provide the photo")
    private String icon;
    @NotBlank(message = "Please provide list of foods")
    private List<Food> foods;
}
