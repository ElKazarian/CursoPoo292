package com.mx.curso.unidad3.Practica_1;

import java.util.Scanner;

public class Sistema_de_Notificaciones_Automaticas {
    public class ValidarEmail {

            public static boolean validarEmail(String email) {

                if (email == null || email.isEmpty()) {
                    return false;
                }

                if (email.contains("@")) {
                    return true;
                } else {
                    return false;
                }
            }

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String email;

                do {
                    System.out.print("Ingresa correo electrónico: ");
                    email = scanner.nextLine();

                    if (!validarEmail(email)) {
                        System.out.println("Correo inválido. Intenta de nuevo.\n");
                    }

                } while (!validarEmail(email));

                System.out.println("¡Correo válido! Registro completado.");
            }
        }

    }
