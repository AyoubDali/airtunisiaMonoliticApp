package com.example.airtunisia.Repository;

import com.example.airtunisia.Model.Flight;
import com.example.airtunisia.Model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    Flight findById(int id);
}
