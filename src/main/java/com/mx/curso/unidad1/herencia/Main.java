package com.mx.curso.unidad1.herencia;

public class Main {
    static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setNombre("Julian");
        System.out.println("Nombre:" + persona.getNombre());

        Car car = new Car();
        car.setNumberOfTire(4);
        car.setTypeLigths("Led");

        System.out.println(car.getTypeLigths());
        System.out.println(car.getNumberOfTire());

    }
}
