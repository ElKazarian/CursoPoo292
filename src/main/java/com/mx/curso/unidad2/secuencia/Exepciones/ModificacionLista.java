package com.mx.curso.unidad2.secuencia.Exepciones;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

public class ModificacionLista {
    static void main(String[] args) {
            List<Integer> lista = new ArrayList<>();
            lista.add(1);
            lista.add(2);
            lista.add(3);

        try{
            for (Integer numero : lista){
                lista.remove(numero);
            }
        }catch (ConcurrentModificationException e){
            System.out.println("No se puede modificar una coleccion " +
                    "mientras se intera con for each");}
        }
    }

