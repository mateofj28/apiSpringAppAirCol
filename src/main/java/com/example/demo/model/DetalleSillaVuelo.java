package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    @OneToOne
    @JoinColumn(nullable = true)
    private Reserva reserva;

    @OneToOne
    @JoinColumn(nullable = true)
    private Pago pago;

    @Column(nullable = true)
    private boolean checking;

    @Column(nullable = true)
    private boolean pasabordo;
}
