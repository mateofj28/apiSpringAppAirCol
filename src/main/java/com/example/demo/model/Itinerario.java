package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Itinerario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 15)
    private String origen;

    @ManyToOne
    @JoinColumn
    private Aeropuerto puertoOrigen;

    @Column(nullable = false)
    private Date fechaSalida;

    @Column(nullable = false)
    private String horaSalida;

    @Column(nullable = false, length = 15)
    private String destino;

    @ManyToOne
    @JoinColumn
    private Aeropuerto puertoDestino;

    @Column(nullable = false)
    private Date fechaLlegada;

    @Column(nullable = false)
    private String horaLlegada;


    public Itinerario(){

    }

    public Itinerario(int id, String origen, Aeropuerto puertoOrigen, Date fechaSalida, String horaSalida,
            String destino, Aeropuerto puertoDestino, Date fechaLlegada, String horaLlegada) {
        this.id = id;
        this.origen = origen;
        this.puertoOrigen = puertoOrigen;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.destino = destino;
        this.puertoDestino = puertoDestino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Aeropuerto getPuertoOrigen() {
        return puertoOrigen;
    }

    public void setPuertoOrigen(Aeropuerto puertoOrigen) {
        this.puertoOrigen = puertoOrigen;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Aeropuerto getPuertoDestino() {
        return puertoDestino;
    }

    public void setPuertoDestino(Aeropuerto puertoDestino) {
        this.puertoDestino = puertoDestino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    

    

}
