package com.mycompany.constructora.Construccion;

import java.util.ArrayList;

public class Puposa {
    //Atributos:
    private final String nombre="Pupo"; //Nombre de la empresa.
    private ArrayList<Empleado> listapersonal; //Lista del personal que trabaja en dicha empresa.
    private ArrayList<Obra> listaobras; //Lista de obras realizadas.

    public Puposa(ArrayList<Empleado> listapersonal, ArrayList<Obra> listaobras) {
        this.listapersonal = listapersonal;
        this.listaobras = listaobras;
    }
    
    
    public ArrayList<Empleado> getListapersonal() {
        return listapersonal;
    }

    public ArrayList<Obra> getListaobras() {
        return listaobras;
    }

    public void setListapersonal(ArrayList<Empleado> listapersonal) {
        this.listapersonal = listapersonal;
    }

    public void setListaobras(ArrayList<Obra> listaobras) {
        this.listaobras = listaobras;
    }

    @Override
    public String toString() {
        return "Datos de Pupo SA:{" + "nombre de la empresa:" + nombre + "\n Lista del personal=" + listapersonal + "\n lista de obras:" + listaobras + '}';
    }
    
    
}
