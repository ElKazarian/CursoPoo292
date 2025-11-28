package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica4_Polimorfismo_y_Sobreescritura_en_Formas_Geométricas {
    static void main(String[] args) {
        class Forma {

            public double calcularArea() {
                return 0;
            }
        }
        class Circulo extends Forma {
            private double radio;
            public Circulo(double radio) {
                this.radio = radio;
            }

            @Override
            public double calcularArea() {
                return Math.PI * radio * radio;
            }
        }

        class Rectangulo extends Forma {

            private double base;
            private double altura;

            public Rectangulo(double base, double altura) {
                this.base = base;
                this.altura = altura;
            }

            @Override
            public double calcularArea() {
                return base * altura;
            }
        }

        class Main {
            public void main(String[] args) {

                Forma[] formas = new Forma[3];

                formas[0] = new Circulo(5);
                formas[1] = new Rectangulo(4, 6);
                formas[2] = new Circulo(2.5);


                for (int i = 0; i < formas.length; i++) {
                    System.out.println("Área de la forma " + (i + 1) + ": " + formas[i].calcularArea());
                }
            }
        }
    }
}
