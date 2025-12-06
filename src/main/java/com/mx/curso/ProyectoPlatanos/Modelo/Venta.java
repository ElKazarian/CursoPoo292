package com.mx.curso.ProyectoPlatanos.Modelo;

import com.mx.curso.ProyectoPlatanos.Servicio.LineaVenta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private String IDVenta;
    private Date FechaHora;
    private Cliente cliente;
    private List<LineaVenta> lineas;
    private double Total;

    public Venta(String IDVenta, Cliente cliente) {
        this.IDVenta = IDVenta;
        this.FechaHora = new Date();
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
        this.Total = 0;
    }

    public void agregarLinea(LineaVenta linea) {
        lineas.add(linea);
    }

    public void calcularTotal() {
        Total = 0;
        for (LineaVenta linea : lineas) {
            Total += linea.calcularSubtotal();
        }
    }

    public List<LineaVenta> getLineas() {
        return lineas;
    }

    public void generarFactura() {
        System.out.println("------------------------------");
        System.out.println("Factura: " + IDVenta + " | Fecha: " + FechaHora);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
        }
        System.out.println("Detalle De Venta:");
        for (LineaVenta linea : lineas) {
            System.out.println("- " + linea.getProducto().getNombre());
            System.out.println("  Cant: " + linea.getCantidadVendida() + " " + linea.getProducto().getUnidad()
                    + " x $" + linea.getProducto().getPrecioVenta());
            System.out.println("  Subtotal: $" + linea.calcularSubtotal());
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + Total);
        System.out.println("========================================");

    }
}