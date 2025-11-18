package com.mx.curso.unidad2.secuencia.Bifurcaciones;

public class SistemaCalificacionesTarea {
    static void main(String[] args) {

        //Declarar variable tipo entero llamada nota examen:
        int NotaExamen = 70;

        //Declaramos sentencia if-else si el alumno aprobó o no:
        if (NotaExamen <=60){

            //Si la NotaExamen es < o = a 60, imprime "¡Felicidades, has aprobado!":
            System.out.println("¡Felicidades, has aprobado!");

        //Declaramos un nuevo bloque if dentro del if original para una condición adicional:
        if (NotaExamen >=90){

            //Si su nota es mayor o igual a 90, imprime "¡Excelente desempeño!".
            System.out.println("¡Excelente desempeño!");
        }
         }

        //Si no, imprime "Lo sentimos, no has aprobado.".
        else{
            System.out.println("Lo sentimos, no has aprobado.");
         }

        //Declaramos sentencia switch para asignar una calificación literal (A, B, C, D, F)
        switch (NotaExamen){
            case 90,100:
                System.out.println("Tu calificación es: A");
            case 80,89:
                System.out.println("Tu calificación es: B");
            case 70,79:
                System.out.println("Tu calificación es: C");
            case 60,69:
                System.out.println("Tu calificación es: D");
            case 0,59:
                System.out.println("Tu calificación es: F");
        }

        //Declaramos sentencia if-else si El valor de la nota no encuentra un rango de 0 a 100:
        if (NotaExamen < 0 || NotaExamen >100){

            System.out.println("La nota es inválida");
        }

    }
}
