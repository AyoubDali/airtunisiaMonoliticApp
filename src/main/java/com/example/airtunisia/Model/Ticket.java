package com.example.airtunisia.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column( name = "price")
    private String price;

    @Column( name = "classType")
    private String classType;

    @Column( name = "date")
    private String date;

    @Column( name = "departure")
    private String departure;

    @Column( name = "destination")
    private String destination;

    @Column( name = "firstName")
    private String firstName;

    @Column( name = "lastName")
    private String lastName;

    @Column( name = "CIN")
    private long CIN;
}
