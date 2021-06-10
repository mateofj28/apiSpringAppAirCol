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

    public Reserva() {
    }

    public Reserva(int id, Pasajero pasajero) {
        this.id = id;
        this.pasajero = pasajero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    
}
