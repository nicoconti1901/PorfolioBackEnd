
package com.nicoconti.Porfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String imagen;

    public dtoHys(String nombre, int porcentaje, String imagen) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
    }

    public dtoHys() {
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
