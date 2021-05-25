package com.example.demo.controller;

import com.example.demo.model.Vuelo;
import com.example.demo.service.Ivuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/vuelo")
@CrossOrigin(origins = "http://localhost:51094")
public class controlVuelo {

    @Autowired
    private Ivuelo restVuelo;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    public Vuelo guardarVuelo(@RequestBody Vuelo vuelo){
        return restVuelo.save(vuelo);
    }

    
}
