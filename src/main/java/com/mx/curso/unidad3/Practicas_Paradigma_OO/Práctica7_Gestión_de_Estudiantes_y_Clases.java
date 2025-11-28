package com.mx.curso.unidad3.Practicas_Paradigma_OO;

import java.util.ArrayList;

public class Práctica7_Gestión_de_Estudiantes_y_Clases {
    static void main(String[] args) {

class Estudiante {
            String nombre;
            int id;

            public Estudiante(String nombre, int id) {
                this.nombre = nombre;
                this.id = id;
            }
        }

class Clase {
            String nombreDeClase;
            ArrayList<Estudiante> estudiantes;

            public Clase(String nombreDeClase) {
                this.nombreDeClase = nombreDeClase;
                this.estudiantes = new ArrayList<>();
            }

            public void agregarEstudiante(Estudiante e) {
                estudiantes.add(e);
            }

            public void mostrarEstudiantes() {
                System.out.println("Estudiantes en la clase " + nombreDeClase + ":");

                for (Estudiante e : estudiantes) {
                    System.out.println("- " + e.nombre + " (ID: " + e.id + ")");
                }
            }
        }

        class Main {
            public void main(String[] args) {

                Clase clasePOO = new Clase("Programación Orientada a Objetos");

                Estudiante e1 = new Estudiante("Ana", 101);
                Estudiante e2 = new Estudiante("Luis", 102);
                Estudiante e3 = new Estudiante("María", 103);

                clasePOO.agregarEstudiante(e1);
                clasePOO.agregarEstudiante(e2);
                clasePOO.agregarEstudiante(e3);

                clasePOO.mostrarEstudiantes();
            }
        }
    }
}
