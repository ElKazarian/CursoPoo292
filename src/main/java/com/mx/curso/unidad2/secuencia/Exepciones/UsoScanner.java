package com.mx.curso.unidad2.secuencia.Exepciones;

import java.util.Scanner;

public class UsoScanner {
    static void main(String[] args) {
        int dato = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        try {
            System.out.println("Ingrese dato: ");
            dato = scanner.nextInt();
        }catch (IllegalArgumentException e){
            System.out.println("Error: no es posible leer" +
                    "porque se cerro el scanner" + e.getMessage());
        }
    }
}
