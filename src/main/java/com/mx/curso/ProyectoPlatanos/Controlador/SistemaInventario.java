package com.mx.curso.ProyectoPlatanos.Controlador;

import com.mx.curso.ProyectoPlatanos.Modelo.Producto;
import com.mx.curso.ProyectoPlatanos.Modelo.Venta;
import com.mx.curso.ProyectoPlatanos.Servicio.LineaVenta;

import java.util.ArrayList;
import java.util.List;

public class SistemaInventario {

    private List<Producto> productos;
    private List<Venta> ventas;
    private Producto producto;

    public SistemaInventario() {
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void registrarVenta(Venta venta) {
        // CORRECCIÓN PRINCIPAL AQUÍ ABAJO:
        for (LineaVenta linea : venta.getLineas()) {

            // ERROR 2: Debemos obtener el producto DE LA LÍNEA actual
            Producto productoActual = linea.getProducto();

            // ERROR 3: Faltaba el signo "!" (NOT).
            // Tu código decía: "Si hay stock, muestra error".
            // Debe decir: "Si NO (!) hay stock, muestra error".
            if (!productoActual.hayStockSuficiente(linea.getCantidadVendida())) {
                System.out.println("No hay suficiente stock para " + productoActual.getNombre());
                return; // Cancela la venta
            }
        }

        ventas.add(venta);
        venta.calcularTotal();

        // Descontar stock
        for (LineaVenta linea : venta.getLineas()) {
            // Asegúrate si tu método se llama 'actualizarStock' o 'actualizarstock'
            linea.getProducto().actualizarstock(-linea.getCantidadVendida());
        }

        System.out.println("Venta registrada.");
    }
}