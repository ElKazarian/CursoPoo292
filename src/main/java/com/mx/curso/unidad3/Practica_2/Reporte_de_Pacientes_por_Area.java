package com.mx.curso.unidad3.Practica_2;

public class Reporte_de_Pacientes_por_Area {
    public static void main(String[] args) {

        String[] codigos = {"C", "P", "N", "X", "C", "N", "P", "A", "C", "Z"};

        for (int i = 0; i < codigos.length; i++) {

            String codigo = codigos[i];
            String area;

            switch (codigo) {
                case "C":
                    area = "Cardiología";
                    break;
                case "P":
                    area = "Pediatría";
                    break;
                case "N":
                    area = "Neurología";
                    break;
                default:
                    area = "General";
            }

            System.out.println("Paciente " + (i + 1) +
                    " | Código: " + codigo +
                    " | Área asignada: " + area);
        }
    }
}
