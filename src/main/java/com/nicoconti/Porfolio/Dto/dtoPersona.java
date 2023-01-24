
package com.nicoconti.Porfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String email;
    @NotBlank
    private String imagen;
    @NotBlank
    private String acercade;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String email, String imagen, String acercade) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagen = imagen;
        this.acercade = acercade;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }
    
    
}
