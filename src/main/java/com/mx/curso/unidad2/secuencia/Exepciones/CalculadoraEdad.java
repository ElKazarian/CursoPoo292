package com.mx.curso.unidad2.secuencia.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    static void main(String[] args) {

        int anioactual = 2025;

        Scanner scanner = new Scanner(System.in);

        try {
            int anioNacimiento = scanner.nextInt();
            int edad = anioactual - anioNacimiento;
            System.out.println("Tu edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar" +
                    "Un numero valido para el anio de nacimiento.");
        }
        scanner.close();
    }
}
