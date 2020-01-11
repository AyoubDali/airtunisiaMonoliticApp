package com.example.airtunisia.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String departure;

    private String destination;

    private String departureTime;

    private String arriveTime;

    //private long freePlaces;
    @OneToMany(mappedBy = "flight")
    private Set<Ticket> tickets = new HashSet<>();

}
