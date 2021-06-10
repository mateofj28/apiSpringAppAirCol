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

    public Pago() {
    }

    public Pago(int id, String nombreTitular, int numeroTarjeta, int fechaExpidicion, int codigoSegurida,
            Pasajero pasajero, int valor) {
        this.id = id;
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpidicion = fechaExpidicion;
        this.codigoSegurida = codigoSegurida;
        this.pasajero = pasajero;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getFechaExpidicion() {
        return fechaExpidicion;
    }

    public void setFechaExpidicion(int fechaExpidicion) {
        this.fechaExpidicion = fechaExpidicion;
    }

    public int getCodigoSegurida() {
        return codigoSegurida;
    }

    public void setCodigoSegurida(int codigoSegurida) {
        this.codigoSegurida = codigoSegurida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
}
