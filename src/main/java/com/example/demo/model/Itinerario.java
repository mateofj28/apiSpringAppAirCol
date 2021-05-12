package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Itinerario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 15)
    private String origen;

    @ManyToOne
    @JoinColumn
    private Aeropuerto puertoOrigen;

    @Column(nullable = false)
    private Date fechaSalida;

    @Column(nullable = false)
    private String horaSalida;

    @Column(nullable = false, length = 15)
    private String Destino;

    @ManyToOne
    @JoinColumn
    private Aeropuerto puertoDestino;

    @Column(nullable = false)
    private Date fechaLlegada;

    @Column(nullable = false)
    private String horaLlegada;

}
