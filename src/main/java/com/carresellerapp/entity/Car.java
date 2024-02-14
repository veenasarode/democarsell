package com.carresellerapp.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {

    private String car_Name;
    private String car_Type;
    private String exterior_Of_Car;
    private  String engine;
    private String ac;
    private String electricals;
    private String steering;
    private String carDocument;
    private String registration_Detail;
    private String structure;
    private String external_Panel;
    private String tyre;
    private String stering;



}
