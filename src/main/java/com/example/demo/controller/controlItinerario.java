package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Itinerario;
import com.example.demo.service.Iitinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/itinerario")
public class controlItinerario {
    
    @Autowired
    private Iitinerario restItinerario;

    @GetMapping
    List<Itinerario> getItinerarios(){
        return restItinerario.findAll();
    }

}
