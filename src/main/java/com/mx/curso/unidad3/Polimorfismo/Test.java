package com.mx.curso.unidad3.Polimorfismo;

import java.util.List;

public class Test {
    static void main(String[] args) {
        List<Empleado> empleados =  List.of(new Cocinero(), new Mesero(), new Lavaplatos());
        /**
         * Creamos un cliclo que intera la lista de empleados
         * e imprima el metodo correspondiente calcularSalario
         */
        for (Empleado e : empleados){
            System.out.println("Salario Empleado: "+ e.calcularSalario());
        }
    }
}
