package com.mx.curso.unidad3.Practica_1;

import java.util.Scanner;

public class Sistema_de_Pedidos_y_Trazabilidad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {

            System.out.print("Ingresa el estado del pedido: ");
            estado = scanner.nextLine();

            switch (estado) {

                case "En camino":
                    System.out.println("El pedido sigue en camino. Avanzando al siguiente estado...");
                    continue;

                case "Error en envío":
                    System.out.println("ERROR: Se detectó un problema con el envío. Proceso detenido.");
                    break;

                case "Procesando":
                    System.out.println("El pedido está siendo procesado...");
                    break;

                case "Entregado":
                    System.out.println("¡El pedido ha sido entregado!");
                    break;

                default:
                    System.out.println("Estado no reconocido. Intenta de nuevo.");
                    break;
            }

            if (estado.equals("Error en envío")) {
                break;
            }
        }

        System.out.println("Fin del sistema de trazabilidad.");
    }
}

