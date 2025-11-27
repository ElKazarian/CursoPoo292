package com.mx.curso.unidad3.Practica_1;

import java.util.Scanner;

public class Sistema_de_Autentificacion_de_Usuarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario, password;
        boolean autenticado = false;

        for (int intento = 1; intento <= 3; intento++) {

            System.out.print("Ingresa el nombre de usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Ingresa password: ");
            password = scanner.nextLine();

            if (usuario.equals("admin")) {
                if (password.equals("pass123")) {
                    System.out.println("Autenticación exitosa.");
                    autenticado = true;
                    break;
                } else {
                    System.out.println("password incorrecto.\n");
                }
            } else {
                System.out.println("Usuario no encontrado.\n");
            }
        }

        if (!autenticado) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
    }
}
