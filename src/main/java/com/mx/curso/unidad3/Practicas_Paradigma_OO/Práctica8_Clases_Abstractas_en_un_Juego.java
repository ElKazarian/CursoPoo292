package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica8_Clases_Abstractas_en_un_Juego {
    static void main(String[] args) {
        abstract class Personaje {

            public abstract void atacar();
        }

class Guerrero extends Personaje {

            @Override
            public void atacar() {
                System.out.println("El guerrero ataca con su espada ⚔️");
            }
        }

class Mago extends Personaje {

            @Override
            public void atacar() {
                System.out.println("El mago lanza un poderoso hechizo ✨");
            }
        }

 class Main {
            public void main(String[] args) {

                Personaje guerrero = new Guerrero();
                Personaje mago = new Mago();

                guerrero.atacar();
                mago.atacar();
            }
        }
    }
}
