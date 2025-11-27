package com.mx.curso.unidad3.Practica_2;

import java.util.Scanner;

public class Sistema_de_Notificación_de_Resultados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Listo para revisión")) {

            System.out.print("Ingresa el estado actual de los resultados: ");
            estado = scanner.nextLine();

            switch (estado) {

                case "En proceso":
                    System.out.println("Los resultados siguen en proceso. Continuando...\n");
                    continue;

                case "Error en muestra":
                    System.out.println("Error: Hubo un problema con la muestra. Proceso detenido.");
                    break;

                case "Pendiente":
                    System.out.println("Los resultados siguen pendientes...\n");
                    break;

                case "Listo para revisión":
                    System.out.println("¡Los resultados están listos para revisión!");
                    break;

                default:
                    System.out.println("Estado no reconocido. Intenta nuevamente.\n");
                    break;
            }

            if (estado.equals("Error en muestra")) {
                break;
            }
        }

        System.out.println("Fin del sistema de notificación.");
    }
}
