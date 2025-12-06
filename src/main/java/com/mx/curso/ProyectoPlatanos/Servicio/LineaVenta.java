package com.mx.curso.ProyectoPlatanos.Servicio;

import com.mx.curso.ProyectoPlatanos.Modelo.Producto;

public class LineaVenta {
    private Producto producto;
    private int CantidadVendida;
    private double PrecioUnitario;

    public LineaVenta(Producto producto, int cantidadVendida, double PrecioUnitario) {
        this.producto = producto;
        this.CantidadVendida = cantidadVendida;
        this.PrecioUnitario = PrecioUnitario;
    }

    public LineaVenta(Producto pRoatan, int cantidadVendida) {
    }

    public double calcularSubtotal() {
        return CantidadVendida * PrecioUnitario;
    }

    public Producto getProducto() { return producto; }
    public int getCantidadVendida() { return CantidadVendida; }
}
