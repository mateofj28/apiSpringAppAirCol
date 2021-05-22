package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Itinerario;
import com.example.demo.service.Iitinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/itinerario")
@CrossOrigin(origins = "http://localhost:51094")
public class controlItinerario {
    
    @Autowired
    private Iitinerario restItinerario;

    @GetMapping
    List<Itinerario> getItinerarios(){
        return restItinerario.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Itinerario saveItinerario(@RequestBody Itinerario itinerario){
        System.out.println(itinerario.getOrigen());
        return restItinerario.save(itinerario);
    }

}
