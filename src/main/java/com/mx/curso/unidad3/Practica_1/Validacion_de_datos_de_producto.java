package com.mx.curso.unidad3.Practica_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion_de_datos_de_producto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingresa stock: ");
            int stock = scanner.nextInt();

            System.out.print("Ingresa el precio: ");
            double precio = scanner.nextDouble();

            if (stock > 0) {
                if (precio > 0) {
                    System.out.println("Nombre: " + producto);
                    System.out.println("stock: " + stock);
                    System.out.println("Precio: " + precio);
                } else {
                    System.out.println("Error: El precio debe ser mayor que 0.");
                }
            } else {
                System.out.println("Error: La stock debe ser mayor que 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresar valores numéricos válidos en stock y precio.");
        }
    }
}

