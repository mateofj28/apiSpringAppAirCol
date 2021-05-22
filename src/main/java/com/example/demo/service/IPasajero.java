package com.example.demo.service;

import com.example.demo.model.Pasajero;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasajero extends  JpaRepository<Pasajero, Integer>{
    
}
