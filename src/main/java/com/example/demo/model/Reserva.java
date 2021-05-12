package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;
    
    @ManyToOne
    @JoinColumn
    private Pasajero pasajero;

}
