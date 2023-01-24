
package com.nicoconti.Porfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String tareaE;
    @NotBlank
    private String tiempoE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String tareaE, String tiempoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tareaE = tareaE;
        this.tiempoE = tiempoE;
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
