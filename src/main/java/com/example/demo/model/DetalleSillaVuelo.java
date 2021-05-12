package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DetalleSillaVuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;

    @OneToOne
    @JoinColumn
    private Vuelo vuelo;

    @OneToOne
    @JoinColumn
    private Silla silla;

    @ManyToOne
    @JoinColumn
    private Pasajero pasajero;

    @OneToOne
    @JoinColumn
    private EstadoSilla estadoSilla;
}
