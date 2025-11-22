package com.mx.curso.unidad2.secuencia.Exepciones;

import java.util.Scanner;

public class ValidadorEdad {
    static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int edad = 0;
        try{
            System.out.println("Ingrese la edad: ");
            edad = Integer.parseInt(scaner.nextLine());
            ValidadorEdad(edad);
            System.out.println("Tu edad es: " + edad);
            }catch (IllegalArgumentException e){
            System.out.println("La edad es: " + e.getMessage());
        }
    }
    public static void ValidadorEdad(int edad) throws  IllegalArgumentException{
        if (edad < 0 || edad > 120){
            throw new IllegalArgumentException("Edad no valida" + edad);
        }
    }
}
