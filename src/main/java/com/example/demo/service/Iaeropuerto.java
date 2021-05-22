package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Aeropuerto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iaeropuerto extends JpaRepository<Aeropuerto, Integer>{
    
    /**el nombre no tiene nada que ver gracias a que es nativo */


    @Query(value = "SELECT * FROM aeropuerto a WHERE a.ciudad_id=?1", nativeQuery = true)
    List<Aeropuerto> findAeropuertoByCiudad(int ciudad_id);

    @Query(value = "SELECT * FROM aeropuerto a WHERE a.id=?1", nativeQuery = true)
    Aeropuerto findAeropuertoById(int id);
    
}
