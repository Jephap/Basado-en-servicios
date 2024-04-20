package com.jeanpacheco.sprinboot.webapp.spring.springbootweb.model;

public class User {
    private String nombre;
    private String apellido;

    public User (String nombre, String apellido){
        this.nombre=nombre; // Jean
        this.apellido=apellido; // Pacheco

    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;

    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido (String apellido){
        this.apellido= apellido;

    }



}
