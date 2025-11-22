package com.mx.curso.unidad2.secuencia.Exepciones;

public class DivisionSegura {
    static void main(String[] args) {
        int numero1= 0;
        int numero2= 7;
        int resultado = 0;
        try{
            resultado = numero2/numero1;
        }catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
