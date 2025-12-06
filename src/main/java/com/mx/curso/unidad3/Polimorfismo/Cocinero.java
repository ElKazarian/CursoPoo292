package com.mx.curso.unidad3.Polimorfismo;

public class Cocinero extends Empleado{
    @Override
    public double calcularSalario() {
        return 3500 * 4;
    }
}
