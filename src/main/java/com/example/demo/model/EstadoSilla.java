package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstadoSilla {

    @Id
    private String id;

    @Column(nullable=false, unique=true)
    private String tipoEstado;
}
