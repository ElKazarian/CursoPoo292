package com.mx.curso.ProyectoPlatanos.Controlador;

import com.mx.curso.ProyectoPlatanos.Modelo.Producto;
import com.mx.curso.ProyectoPlatanos.Modelo.Venta;
import com.mx.curso.ProyectoPlatanos.Servicio.LineaVenta;

import java.util.ArrayList;
import java.util.List;

public class SistemaInventario {

    private List<Producto> productos;
    private List<Venta> ventas;

    public SistemaInventario() {
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void registrarVenta(Venta venta) {
        for (LineaVenta linea : venta.getLineas()) {
            if (!linea.getProducto().hayStockSuficiente(linea.getCantidadVendida())) {
                System.out.println("No hay suficiente stock para " + linea.getProducto().getNombre());
                return;
            }
        }

        ventas.add(venta);
        venta.calcularTotal();

        for (LineaVenta linea : venta.getLineas()) {
            linea.getProducto().actualizarstock(-linea.getCantidadVendida());
        }

        System.out.println("Venta registrada.");
    }
}