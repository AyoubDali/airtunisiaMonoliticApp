package com.example.airtunisia.Service;


import com.example.airtunisia.Model.Plane;
import com.example.airtunisia.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Service")
public class PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    @GetMapping(value = "/findAllPlanes")
    public List findPlanes(){
        List planeList = planeRepository.findAll();

        return (planeList);
    }

    @PostMapping(value = "/savePlane")
    public Plane newPlane(@RequestBody Plane newPlane){
        planeRepository.save(newPlane);
        return newPlane ;
    }
}
