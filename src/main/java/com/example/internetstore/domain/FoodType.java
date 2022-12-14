package com.example.internetstore.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;



@Data
@Entity
@Table(name = "food_types")
public class FoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String icon;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    @OrderBy("name ASC")
    List<Food> foods;
}
