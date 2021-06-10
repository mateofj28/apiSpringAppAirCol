package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Avion;
import com.example.demo.service.IAvion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avion")
@CrossOrigin(origins = "http://localhost:51094")
public class controlAvion {
    
    @Autowired
    private IAvion restAvion;

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = "application/json")
    public Avion getAvion(@RequestParam(value = "id") int id){
        return restAvion.findAvionById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Avion> getAviones(){
        return restAvion.findAll();
    }

    
}



