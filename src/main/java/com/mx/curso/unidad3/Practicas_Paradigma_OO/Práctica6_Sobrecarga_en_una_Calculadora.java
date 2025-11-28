package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica6_Sobrecarga_en_una_Calculadora {
    static void main(String[] args) {
        class Calculadora {

            public int sumar(int a, int b) {
                return a + b;
            }

            public int sumar(int a, int b, int c) {
                return a + b + c;
            }

            public double sumar(double a, double b) {
                return a + b;
            }
        }

        class Main {
            public void main(String[] args) {

                Calculadora calc = new Calculadora();

                int suma1 = calc.sumar(5, 10);
                int suma2 = calc.sumar(3, 7, 2);
                double suma3 = calc.sumar(4.5, 2.3);

                System.out.println("Suma de 2 enteros: " + suma1);
                System.out.println("Suma de 3 enteros: " + suma2);
                System.out.println("Suma de 2 doubles: " + suma3);
            }
        }
    }
}
