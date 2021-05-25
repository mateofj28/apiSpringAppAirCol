package com.example.demo.controller;


import com.example.demo.model.Pasajero;
import com.example.demo.service.IPasajero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/pasajero")
@CrossOrigin(origins = "http://localhost:51094")
public class controlPasajero {

    @Autowired
    private IPasajero restPasajero;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Pasajero guardarPasajero(@RequestBody Pasajero pasajero){
        return restPasajero.save(pasajero);
    }

    @RequestMapping(method=RequestMethod.GET, produces = "application/json")
    public Pasajero buscarPasajero(@RequestParam(value = "correo") String correo) {
        return restPasajero.findPasajeroByCorreo(correo);
    }
}

