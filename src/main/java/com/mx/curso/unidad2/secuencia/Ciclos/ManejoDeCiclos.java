package com.mx.curso.unidad2.secuencia.Ciclos;

public class ManejoDeCiclos {
    static void main(String[] args) {
        int i=0;
        while (i<=5){
            System.out.println("Valor de i en while: " +i);
            i++;
        }
        System.out.println("---------------------");

        int j=10;
        while (j>=7) {
            System.out.println("Valor de j en while: " + j);
            j--;
        }
        System.out.println("_____________________");

        for (int k=1; k<=10; k++){
            System.out.println("La tabla del numero 7 es: " + (7*k));
        }
    }
}
