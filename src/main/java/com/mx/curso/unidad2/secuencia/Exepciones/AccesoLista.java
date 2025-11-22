package com.mx.curso.unidad2.secuencia.Exepciones;

import java.util.Scanner;

public class AccesoLista {
    static void main(String[] args) {
        int [] lista={1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        int dato = 0;
        try{
            System.out.println("Ingresa una posicion");
            dato = scanner.nextInt();
            System.out.println(lista[dato]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
