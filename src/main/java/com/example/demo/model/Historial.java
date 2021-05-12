package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;

    @Column(nullable = false, length = 20)
    private String pasajero;

    @Column(nullable = false, length = 2)
    private int silla;

    @Column(nullable = false)
    private int vuelo;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String hora;

    @OneToOne
    @JoinColumn
    private Compra compra;

    @OneToOne
    @JoinColumn
    private Reserva reserva;

    
}
