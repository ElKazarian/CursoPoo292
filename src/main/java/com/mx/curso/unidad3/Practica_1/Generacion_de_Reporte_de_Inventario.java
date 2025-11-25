package com.mx.curso.unidad3.Practica_1;

public class Generacion_de_Reporte_de_Inventario {
    public static void main(String[] args) {

        int[] stock = {0, 1, 22, 36, 44, 50, 66, 10, 88, 9};

        for (int i = 0; i < stock.length; i++) {
            int cantidad = stock[i];
            String clasificacion;

            switch (cantidad) {
                case 0:
                    clasificacion = "Descontinuado";
                    break;

                case 1: case 2: case 3: case 4:
                case 5: case 6: case 7: case 8: case 9:
                    clasificacion = "Urgente";
                    break;

                default:
                    if (cantidad > 50) {
                        clasificacion = "En stock";
                    } else if (cantidad >= 10) {
                        clasificacion = "Bajo stock";
                    } else {
                        clasificacion = "Valor invalido";
                    }
            }
            System.out.println("Producto " + (i + 1) +
                    " - Cantidad: " + cantidad +
                    " - Clasificación: " + clasificacion);
        }
    }
}
