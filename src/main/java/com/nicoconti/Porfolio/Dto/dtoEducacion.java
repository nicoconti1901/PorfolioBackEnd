
package com.nicoconti.Porfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String tituloEdu;
    @NotBlank
    private String nivelEdu;
    @NotBlank
    private String duracionEdu;
    @NotBlank
    private String lugarEdu;
    @NotBlank
    private String estadoEdu;
    @NotBlank
    private String fechafinEdu;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloEdu, String nivelEdu, String duracionEdu, String lugarEdu, String estadoEdu, String fechafinEdu) {
        this.tituloEdu = tituloEdu;
        this.nivelEdu = nivelEdu;
        this.duracionEdu = duracionEdu;
        this.lugarEdu = lugarEdu;
        this.estadoEdu = estadoEdu;
        this.fechafinEdu = fechafinEdu;
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
