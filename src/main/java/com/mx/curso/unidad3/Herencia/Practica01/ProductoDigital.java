package com.mx.curso.unidad3.Herencia.Practica01;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private boolean descargable;
    private static int contadorProductos=0;

    public ProductoDigital (String nombre, double precio,Boolean descargable){
        this.nombre = nombre;
        this.precio = precio;
        this.descargable = descargable;
        contadorProductos ++;
    }

    //Obtener el valor de los productos
    public int obtenerTotalProductos(){
        return contadorProductos;
    }

    public void setPrecio (double nuevoPrecio){
        this.precio =nuevoPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }


    public boolean isDescargable() {
        return descargable;
    }

    public void setDescargable(boolean descargable) {
        this.descargable = descargable;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        ProductoDigital.contadorProductos = contadorProductos;
    }
}
