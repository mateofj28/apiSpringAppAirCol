package com.example.demo.service;

import com.example.demo.model.Ciudad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iciudad extends JpaRepository<Ciudad, Integer> {
    
}
