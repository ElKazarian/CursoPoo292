package com.mx.curso.unidad3.Herencia.practica03;

import java.util.Base64;

public class CalculadoraGeometrica {
    private String nombreFigura;
    public static double PI =Math.PI;

    public CalculadoraGeometrica(){
        this.nombreFigura = "Desconcida";
    }

    public CalculadoraGeometrica (String nombreFigura){
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public double calcularArea(double radio){
        return PI * radio * radio;
    }

    public double calcularArea (double ancho, double alto){
        return ancho * alto;
    }

    public double calcularArea (double base, int altura){
        return (base * altura) / 2;
    }

    static void main(String[] args) {
        CalculadoraGeometrica cal1 = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo: " + cal1.calcularArea(5));
        System.out.println("Area del rectangulo: " + cal1.calcularArea(4, 6));
        System.out.println("Area del triangulo: " + cal1.calcularArea(5, 7));

        System.out.println("-----------------------------------------------");

        CalculadoraGeometrica cal2 = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo: " + cal2.calcularArea(8));
        System.out.println("Area del rectangulo: " + cal2.calcularArea(6, 2));
        System.out.println("Area del triangulo: " + cal2.calcularArea(10, 4));
    }
}
