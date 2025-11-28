package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica5_Tareas_con_Interfaces_para_Dispositivos {
    static void main(String[] args) {
        interface Encendible {
            void encender();
            void apagar();
        }

        class TV implements Encendible {

            @Override
            public void encender() {
                System.out.println("La TV se ha encendido. Muestra imagen...");
            }

            @Override
            public void apagar() {
                System.out.println("La TV se ha apagado. Pantalla en negro.");
            }
        }

        class Bombilla implements Encendible {

            @Override
            public void encender() {
                System.out.println("La bombilla está encendida en la habitación.");
            }

            @Override
            public void apagar() {
                System.out.println("La bombilla se ha apagado. Todo está oscuro.");
            }
        }

        class Main {
            public void main(String[] args) {

                Encendible[] dispositivos = new Encendible[2];

                dispositivos[0] = new TV();
                dispositivos[1] = new Bombilla();

                for (Encendible e : dispositivos) {
                    e.encender();
                    e.apagar();
                    System.out.println("-----------------");
                }
            }
        }
    }
}
