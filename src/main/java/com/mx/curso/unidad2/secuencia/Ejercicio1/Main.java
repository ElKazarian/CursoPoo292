package com.mx.curso.unidad2.secuencia.Ejercicio1;

public class Main {
    static void main(String[] args) {
        Animal animal = new Animal();
        animal.setType("Gato");
        animal.setGroup("Mamífero");
        System.out.println(animal.getType());
        System.out.println(animal.getGroup());

        Comida comida = new Comida();
        comida.setFoot("Croquetas");
        comida.setQuantity("300gm");
        System.out.println(comida.getFoot());
        System.out.println(comida.getQuantity());
    }
}
