package com.mx.curso.unidad3.Herencia.Practica04;

public class Articulo {
    private String codigo;
    private int cantidadStock;
    private double precioUnitario;

    public Articulo(String codigo){

        this.codigo = codigo;
    }

    public Articulo(int cantidadStock){
        this.cantidadStock = 0;
    }

    public Articulo(){
        this.precioUnitario = 1.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int nuevaCantidad) {
        this.cantidadStock = nuevaCantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    class registroInventario{
        int registroInventario;
    }
}

