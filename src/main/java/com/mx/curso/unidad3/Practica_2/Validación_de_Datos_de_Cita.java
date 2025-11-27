package com.mx.curso.unidad3.Practica_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validación_de_Datos_de_Cita {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa la hora de cita (formato 24h): ");
            int hora = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el día de la semana: ");
            String dia = scanner.nextLine().toLowerCase();

            if (hora >= 9 && hora <= 17) {
                if (!dia.equals("sábado") && !dia.equals("sabado") &&
                        !dia.equals("domingo")) {

                    System.out.println("Cita agendada con éxito.");
                } else {
                    System.out.println("Error: No se agendan citas en fin de semana.");
                }
            } else {
                System.out.println("Error: La hora debe estar entre 9 y 17 horas.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número válido para la hora.");
        }
    }
}
