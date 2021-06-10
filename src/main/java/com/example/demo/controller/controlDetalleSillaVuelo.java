package com.example.demo.controller;



import java.util.List;

import com.example.demo.model.DetalleSillaVuelo;
import com.example.demo.service.IDetalleSillaVuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/detalle")
@CrossOrigin(origins = "http://localhost:51094")
public class controlDetalleSillaVuelo {

    @Autowired
    IDetalleSillaVuelo restDetalleSilla;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<DetalleSillaVuelo> readDetalleSilla(@RequestParam(value = "vuelo") int silla){
        return restDetalleSilla.findDetalleSillaVueloBySilla(silla);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public DetalleSillaVuelo saveDetalleSilla(@RequestBody DetalleSillaVuelo detalleSilla){
        return restDetalleSilla.save(detalleSilla);
    }    

    
}
