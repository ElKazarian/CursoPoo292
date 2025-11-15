package com.mx.curso.unidad2.secuencia.Bifurcaciones;

public class SistemaCalificaciones {
    static void main(String[] args) {
        int notaExamen = 85;

        if(notaExamen<=60){
            System.out.println("Felicidades Aprobaste el curso");
            if (notaExamen>=90){
                System.out.println("Exelente desempeño");
            }
        }else{
            System.out.println("Lo siento, no haz aprobado");
        }
        switch (notaExamen){
            case 90:
                System.out.println("Obtuviste una A");
            case 80:
                System.out.println("Obtuviste una B");
            case 70:
                System.out.println("Obtuviste una C");
            case 60:
                System.out.println("Obtuviste una D");
            case 50:
                System.out.println("Obtuviste una E");
        }
    }
}
