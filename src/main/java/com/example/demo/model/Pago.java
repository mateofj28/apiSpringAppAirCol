package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;
    
    @Column(nullable = false, length = 20)
    private String nombreTitular;
    
    @Column(nullable = false, unique = true, length = 16)
    private int numeroTarjeta;

    @Column(nullable = false, length = 4)
    private int fechaExpidicion;

    @Column(nullable = false, length = 3)
    private int codigoSegurida;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pasajero pasajero;

    @Column(nullable = false, length = 8)
    private int valor;


}
