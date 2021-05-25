package com.example.demo.service;

import com.example.demo.model.Pasajero;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasajero extends  JpaRepository<Pasajero, Integer>{
    
    @Query(value = "SELECT * FROM pasajero a WHERE a.correo=?1", nativeQuery = true)
    Pasajero findPasajeroByCorreo(String mail);

}
