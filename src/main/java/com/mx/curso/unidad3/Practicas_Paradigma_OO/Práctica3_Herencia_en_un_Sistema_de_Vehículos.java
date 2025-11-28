package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica3_Herencia_en_un_Sistema_de_Vehículos {
    static void main(String[] args) {
        class Vehiculo {
            protected int velocidad;
            protected int numRuedas;

            public Vehiculo(int velocidad, int numRuedas) {
                this.velocidad = velocidad;
                this.numRuedas = numRuedas;
            }

            public void acelerar() {
                velocidad += 5;
                System.out.println("El vehículo acelera. Velocidad actual: " + velocidad + " km/h");
            }
        }
    }
}
