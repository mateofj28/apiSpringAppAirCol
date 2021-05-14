package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Pais;
import com.example.demo.service.IPais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller cuando tenga el frontend no separado
@RestController
@RequestMapping("/api/pais")
public class controlPais {
    
    @Autowired
    private IPais restPais;

    //@GetMapping()
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Pais> getPaices(){
        return restPais.findAll();
    }

    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Pais savePais(@RequestBody Pais pais){         
        return restPais.save(pais);
    }


}
