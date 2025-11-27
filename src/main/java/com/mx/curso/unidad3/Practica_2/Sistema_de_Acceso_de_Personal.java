package com.mx.curso.unidad3.Practica_2;

import java.util.Scanner;

public class Sistema_de_Acceso_de_Personal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario, password;
        boolean acceso = false;

        for (int intento = 1; intento <= 3; intento++) {

            System.out.print("Ingresa el nombre de usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Ingresa la contraseña: ");
            password = scanner.nextLine();

            if (usuario.equals("medico1") && password.equals("doc123")) {
                System.out.println("Acceso de Médico exitoso.");
                acceso = true;
                break;
            }
            else if (usuario.equals("enfermera2") && password.equals("enf456")) {
                System.out.println("Acceso de Enfermera exitoso.");
                acceso = true;
                break;
            }
            else {
                System.out.println("Credenciales incorrectas. Inténtalo de nuevo.\n");
                continue;
            }
        }

        if (!acceso) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
    }
}
