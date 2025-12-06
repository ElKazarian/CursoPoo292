package com.mx.curso.ProyectoPlatanos.Modelo;

public class Producto {
    private String ID;
    private TipoDePlatano tipo;
    private double PrecioVenta;
    private double CostoCompra;
    private int CantidadStock;
    private Proveedor proveedor;

    public Producto(String ID, TipoDePlatano tipo, double PrecioVenta, double CostoCompra, int CantidadStock, Proveedor proveedor){
        this.ID = ID;
        this.tipo = tipo;
        this.PrecioVenta = PrecioVenta;
        this.CostoCompra = CostoCompra;
        this.CantidadStock = CantidadStock;
        this.proveedor = proveedor;
    }

    public void actualizarstock(int cant){
        this.CantidadStock += cant;
    }

    public boolean hayStockSuficiente(int cantidadRequerida){
        return this.CantidadStock >= cantidadRequerida;
    }

    public String getUnidad() {
        // OJO: Asegúrate que en tu Enum esté escrito exactamente igual (ROATAN o Roatan)
        if (this.tipo == TipoDePlatano.Roatan) {
            return "Cajas";
        } else {
            return "Kilos";
        }
    }

    public String getNombre() {
        return "Plátano " + tipo.toString() + " (" + getUnidad() + ")";
    }

    public double getPrecioVenta() { return PrecioVenta; }
    public int getCantidadStock() { return CantidadStock; }
}

