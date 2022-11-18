package com.example.internetstore.dto;

import com.example.internetstore.domain.Food;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotBlank;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlaceDto {
    @NotBlank(message = "Please enter the name")
    private String name;
    @NotBlank(message = "Please enter the address")
    private String address;
    @NotBlank(message = "Please provide the photo")
    private String image;
    @NotBlank(message = "Please provide list of food")
    private List<Food> foods;
}
