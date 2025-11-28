package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica10_Tarea_de_return_y_Constructores {
    static void main(String[] args) {
        class Circulo {

            private double radio;

            public Circulo(double radio) {
                this.radio = radio;
            }

            public double calcularArea() {
                return Math.PI * radio * radio;
            }

            public double calcularCircunferencia() {
                return 2 * Math.PI * radio;
            }
        }

            class Main {
            public void main(String[] args) {

                Circulo c = new Circulo(5);
                double area = c.calcularArea();
                double circunferencia = c.calcularCircunferencia();

                System.out.println("Área del círculo: " + area);
                System.out.println("Circunferencia del círculo: " + circunferencia);
            }
        }
    }
}
