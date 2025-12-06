package com.mx.curso.ProyectoPlatanos.Controlador;

import com.mx.curso.ProyectoPlatanos.Modelo.*;
import com.mx.curso.ProyectoPlatanos.Servicio.LineaVenta;

public class Main {
    public static void main(String[] args) {
        SistemaInventario sistema = new SistemaInventario();

        Proveedor finca = new Proveedor("P01", "Finca El Platanal", "Veracruz", "228-000");
        Cliente mercado = new Cliente("C01", "Frutería Central", "Xalapa", "228-111", "XA01");

       Producto pMacho = new Producto("PM1", TipoDePlatano.Macho, 22.50, 10.0, 500, finca);

        Producto pRoatan = new Producto("PR1", TipoDePlatano.Roatan, 350.00, 180.00, 50, finca);

        sistema.agregarProducto(pMacho);
        sistema.agregarProducto(pRoatan);

        System.out.println("--- Inventario Inicial ---");
        System.out.println("Macho: " + pMacho.getCantidadStock() + " Kilos");
        System.out.println("Roatán: " + pRoatan.getCantidadStock() + " Cajas");
        System.out.println("--------------------------");

        Venta v = new Venta("V-001", mercado);

        v.agregarLinea(new LineaVenta(pMacho, 100));
        v.agregarLinea(new LineaVenta(pRoatan, 5));

        sistema.registrarVenta(v);
        v.generarFactura();

        System.out.println("--- Inventario Final ---");
        System.out.println("Macho: " + pMacho.getCantidadStock() + " Kilos restantes");
        System.out.println("Roatán: " + pRoatan.getCantidadStock() + " Cajas restantes");
    }
}
