package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 2)
    private String numero;

    @Column(nullable = false, length = 30)
    private String aerolinias;

    public Avion() {
    }

    public Avion(int id, String numero, String aerolinias) {
        this.id = id;
        this.numero = numero;
        this.aerolinias = aerolinias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAerolinias() {
        return aerolinias;
    }

    public void setAerolinias(String aerolinias) {
        this.aerolinias = aerolinias;
    }
           
}
