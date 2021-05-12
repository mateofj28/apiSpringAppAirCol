package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Silla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private ClaseSilla clase;
}
