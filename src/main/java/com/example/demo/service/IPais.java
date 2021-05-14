package com.example.demo.service;

import com.example.demo.model.Pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPais extends JpaRepository<Pais, Integer> {
    
}
