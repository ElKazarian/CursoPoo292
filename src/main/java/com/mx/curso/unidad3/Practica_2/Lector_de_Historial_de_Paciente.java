package com.mx.curso.unidad3.Practica_2;

import java.util.Scanner;

public class Lector_de_Historial_de_Paciente {
    public static boolean validarIDPaciente(int id) {

        if (id >= 10000 && id <= 99999) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int id;

         do {
            System.out.print("Ingresa el ID del paciente (5 dígitos): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debes ingresar un número válido.");
                System.out.print("Ingresa el ID del paciente (5 dígitos): ");
                scanner.next();
            }

            id = scanner.nextInt();

            if (!validarIDPaciente(id)) {
                System.out.println("ID inválido. Debe tener exactamente 5 dígitos.\n");
            }

        } while (!validarIDPaciente(id));

        System.out.println("ID válido. Paciente registrado correctamente.");
    }
}
