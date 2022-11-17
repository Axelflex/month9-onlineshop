package com.example.internetstore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String image;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "foodType_id")
    private FoodType type;
    @Column
    private float price;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;


}
