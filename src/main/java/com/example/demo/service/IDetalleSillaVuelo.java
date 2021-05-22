package com.example.demo.service;


import com.example.demo.model.DetalleSillaVuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleSillaVuelo extends JpaRepository<DetalleSillaVuelo, Integer> {
    
}