package com.mx.curso.unidad2.secuencia.control;

public class RecetaDeCocina {
    static void main() {
        int ingredientesPreparados=0;
        int tipoDeCocina =0;

        System.out.println("Paso 1: Preparar los ingredientes");
        System.out.println(ingredientesPreparados++);
        System.out.println("Agregar ingrediente al platillo");
        System.out.println(ingredientesPreparados++);

        System.out.println("Paso 2: Cocina Platillo");
        System.out.println(tipoDeCocina++);

        System.out.println("Paso 3: Servir el platillo");

    }
}
