package com.mx.curso.ProyectoPlatanos.Modelo;

public abstract class Persona {
    protected String ID;
    protected String Nombre;
    protected String Direccion;
    protected String Telefono;

    public Persona(String ID, String Nombre, String Direccion, String Telefono){
        this.ID= ID;
        this.Nombre= Nombre;
        this.Direccion= Direccion;
        this.Telefono= Telefono;
    }

    public String getNombre() {
        return Nombre;
    }
}
