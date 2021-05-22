package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Aeropuerto;
import com.example.demo.service.Iaeropuerto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aeropuerto")
@CrossOrigin(origins = "http://localhost:51094")
public class controlAeropuerto {
    
    @Autowired
    private Iaeropuerto restAero;

    @GetMapping
    public List<Aeropuerto> aeropuertos(@RequestParam(value = "id") int id){
        return restAero.findAeropuertoByCiudad(id);
                
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = "application/json")
    public Aeropuerto getAeropuerto(@RequestParam(value = "id") int id){
        return restAero.findAeropuertoById(id);
    }


}
