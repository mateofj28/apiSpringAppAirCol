package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Factura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;

    @OneToOne
    @JoinColumn(unique = true)
    private DetalleSillaVuelo detalle_silla_vuelo;

}
