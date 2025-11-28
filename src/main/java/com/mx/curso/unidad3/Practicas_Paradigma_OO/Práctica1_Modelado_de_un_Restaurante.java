package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica1_Modelado_de_un_Restaurante {
    static void main(String[] args) {
         class Restaurante {

            String nombre;
            String tipoDeComida;
            int calificacion;

            public Restaurante(String nombre, String tipoDeComida, int calificacion) {
                this.nombre = nombre;
                this.tipoDeComida = tipoDeComida;
                this.calificacion = calificacion;
            }

            public void abrir() {
                System.out.println("El restaurante " + nombre + " está abierto. ¡Bienvenido!");
            }
        }
         class Main {
            public void main(String[] args) {

                Restaurante r1 = new Restaurante("La Parrilla Mexicana", "Mexicana", 5);
                Restaurante r2 = new Restaurante("Sushi House", "Japonesa", 4);

                r1.abrir();
                r2.abrir();
            }
        }
    }
}
