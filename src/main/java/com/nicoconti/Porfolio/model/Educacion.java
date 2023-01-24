
package com.nicoconti.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloEdu;
    private String nivelEdu;
    private String duracionEdu;
    private String lugarEdu;
    private String estadoEdu;
    private String fechafinEdu;

    public Educacion() {
    }

    public Educacion(String tituloEdu, String nivelEdu, String duracionEdu, String lugarEdu, String estadoEdu, String fechafinEdu) {
        this.tituloEdu = tituloEdu;
        this.nivelEdu = nivelEdu;
        this.duracionEdu = duracionEdu;
        this.lugarEdu = lugarEdu;
        this.estadoEdu = estadoEdu;
        this.fechafinEdu = fechafinEdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getNivelEdu() {
        return nivelEdu;
    }

    public void setNivelEdu(String nivelEdu) {
        this.nivelEdu = nivelEdu;
    }

    public String getDuracionEdu() {
        return duracionEdu;
    }

    public void setDuracionEdu(String duracionEdu) {
        this.duracionEdu = duracionEdu;
    }

    public String getLugarEdu() {
        return lugarEdu;
    }

    public void setLugarEdu(String lugarEdu) {
        this.lugarEdu = lugarEdu;
    }

    public String getEstadoEdu() {
        return estadoEdu;
    }

    public void setEstadoEdu(String estadoEdu) {
        this.estadoEdu = estadoEdu;
    }

    public String getFechafinEdu() {
        return fechafinEdu;
    }

    public void setFechafinEdu(String fechafinEdu) {
        this.fechafinEdu = fechafinEdu;
    }
    
    
}
