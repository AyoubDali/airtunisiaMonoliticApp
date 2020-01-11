package com.example.airtunisia.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column( name = "brand")
    private String brand;

    @Column( name = "maxWeight")
    private String maxWeight;

    @Column( name = "flyHours")
    private String flyHours;

    @Column( name = "Speed")
    private String Speed;

    @Column( name = "nbPlaces")
    private String nbPlaces;
}
