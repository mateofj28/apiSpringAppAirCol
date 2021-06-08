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

    

    public Silla() {
    }



    public Silla(int numero, ClaseSilla clase) {
        this.numero = numero;
        this.clase = clase;
    }



    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public ClaseSilla getClase() {
        return clase;
    }



    public void setClase(ClaseSilla clase) {
        this.clase = clase;
    }

    
    
}
