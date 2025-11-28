package com.mx.curso.unidad3.Practicas_Paradigma_OO;

public class Práctica2_Gestión_de_Empleados_con_Encapsulamiento {
    static void main(String[] args) {
        class Empleado {

            private int id;
            private double salario;

            public Empleado(int id, double salario) {
                this.id = id;
                this.salario = salario;
            }

            public void aumentarSalario(double porcentaje) {

                salario += salario * (porcentaje / 100);
            }

            public double getSalario() {
                return salario;
            }
        }
    }
}
