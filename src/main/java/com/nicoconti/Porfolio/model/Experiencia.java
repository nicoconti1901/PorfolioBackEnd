
package com.nicoconti.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String tareaE;
    private String tiempoE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String tareaE, String tiempoE) {
        
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tareaE = tareaE;
        this.tiempoE = tiempoE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getTareaE() {
        return tareaE;
    }

    public void setTareaE(String tareaE) {
        this.tareaE = tareaE;
    }

    public String getTiempoE() {
        return tiempoE;
    }

    public void setTiempoE(String tiempoE) {
        this.tiempoE = tiempoE;
    }

    
    
    
}
