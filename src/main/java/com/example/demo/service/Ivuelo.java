package com.example.demo.service;

import com.example.demo.model.Vuelo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ivuelo extends JpaRepository<Vuelo,  Integer>{
     
}
