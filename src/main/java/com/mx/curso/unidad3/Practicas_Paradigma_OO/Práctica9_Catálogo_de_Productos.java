package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica9_Catálogo_de_Productos {
    static void main(String[] args) {
        class Producto {

            protected String nombre;
            protected double precio;

            public Producto(String nombre, double precio) {
                this.nombre = nombre;
                this.precio = precio;
            }

            public void mostrarDetalles() {
                System.out.println("Producto: " + nombre);
                System.out.println("Precio: $" + precio);
            }
        }

class Electronica extends Producto {

            private int garantia; // en meses

            public Electronica(String nombre, double precio, int garantia) {
                super(nombre, precio);
                this.garantia = garantia;
            }

            @Override
            public void mostrarDetalles() {
                System.out.println("Producto electrónico: " + nombre);
                System.out.println("Precio: $" + precio);
                System.out.println("Garantía: " + garantia + " meses");
            }
        }

class Alimento extends Producto {

            private String fechaDeCaducidad;

            public Alimento(String nombre, double precio, String fechaDeCaducidad) {
                super(nombre, precio);
                this.fechaDeCaducidad = fechaDeCaducidad;
            }

            @Override
            public void mostrarDetalles() {
                System.out.println("Producto alimenticio: " + nombre);
                System.out.println("Precio: $" + precio);
                System.out.println("Fecha de caducidad: " + fechaDeCaducidad);
            }
        }

 class Main {
            public void main(String[] args) {

                Producto[] productos = new Producto[3];
                productos[0] = new Electronica("Laptop", 15000, 24);
                productos[1] = new Alimento("Leche", 22.50, "10/12/2025");
                productos[2] = new Electronica("Audífonos", 800, 12);

                for (Producto p : productos) {
                    p.mostrarDetalles();
                    System.out.println("-------------------------");
                }
            }
        }
    }
}
