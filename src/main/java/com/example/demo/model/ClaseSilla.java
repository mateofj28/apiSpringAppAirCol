package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClaseSilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String tipoSilla;

    @Column(nullable = false)
    private int precio;

    public ClaseSilla() {
    }

    public ClaseSilla(int id, String tipoSilla, int precio) {
        this.id = id;
        this.tipoSilla = tipoSilla;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(String tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    


}
