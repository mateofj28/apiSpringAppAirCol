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

    public DetalleSillaVuelo() {
    }

    public DetalleSillaVuelo(int id, Vuelo vuelo, Silla silla, Reserva reserva, Pago pago, boolean checking,
            boolean pasabordo) {
        this.id = id;
        this.vuelo = vuelo;
        this.silla = silla;
        this.reserva = reserva;
        this.pago = pago;
        this.checking = checking;
        this.pasabordo = pasabordo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public boolean isChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public boolean isPasabordo() {
        return pasabordo;
    }

    public void setPasabordo(boolean pasabordo) {
        this.pasabordo = pasabordo;
    }

    
}
