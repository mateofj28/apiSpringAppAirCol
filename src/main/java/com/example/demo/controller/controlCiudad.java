package com.example.demo.controller;


import java.util.List;

import com.example.demo.model.Ciudad;
import com.example.demo.service.Iciudad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller cuando tenga el frontend no separado
@RestController
@RequestMapping("/api/ciudad")
@CrossOrigin(origins = "http://localhost:51094")    
public class controlCiudad {
    
    @Autowired
    private Iciudad restCiudad;

    //@GetMapping()
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Ciudad> getCiudades(){
        return restCiudad.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Ciudad saveCiudad(@RequestBody Ciudad ciudad){
        return restCiudad.save(ciudad);
    }

    
    


}
