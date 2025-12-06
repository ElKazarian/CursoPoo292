package com.mx.curso.unidad3.Polimorfismo;

public class Lavaplatos extends Empleado{
    @Override
    public double calcularSalario() {
        return 1200 * 4;
    }
}
