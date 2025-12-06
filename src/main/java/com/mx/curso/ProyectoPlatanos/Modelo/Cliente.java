package com.mx.curso.ProyectoPlatanos.Modelo;

public class Cliente extends Persona {
    private String RFC;

    public Cliente(String ID, String Nombre, String Direccion, String Telefono, String RFC) {
        super (ID, Nombre, Direccion, Telefono);
        this.RFC = RFC;
    }
}
