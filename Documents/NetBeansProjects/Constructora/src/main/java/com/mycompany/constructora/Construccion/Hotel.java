package com.mycompany.constructora.Construccion;

import java.util.ArrayList;

public class Hotel extends ObraComercial{
    
    //Atributos:
    int numpisos; //Cantidad de pisos.
    
    //Métodos:

    public Hotel(int numpisos, String nombreobra, String dirección, float cantidadm2, float testimado, float costoxm2, ArrayList<Empleado> listapersonal) {
        super(nombreobra, dirección, cantidadm2, testimado, costoxm2, listapersonal);
        this.numpisos = numpisos;
    }
    

    public int getNumpisos() {
        return numpisos;
    }

    @Override
    public String getNombreobra() {
        return nombreobra;
    }

    @Override
    public String getDirección() {
        return dirección;
    }

    @Override
    public float getCantidadm2() {
        return cantidadm2;
    }

    @Override
    public float getTestimado() {
        return testimado;
    }

    @Override
    public float getCostoxm2() {
        return costoxm2;
    }

    @Override
    public ArrayList<Empleado> getListapersonal() {
        return listapersonal;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    @Override
    public void setNombreobra(String nombreobra) {
        this.nombreobra = nombreobra;
    }

    @Override
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public void setCantidadm2(float cantidadm2) {
        this.cantidadm2 = cantidadm2;
    }

    @Override
    public void setTestimado(float testimado) {
        this.testimado = testimado;
    }

    @Override
    public void setCostoxm2(float costoxm2) {
        this.costoxm2 = costoxm2;
    }

    @Override
    public void setListapersonal(ArrayList<Empleado> listapersonal) {
        this.listapersonal = listapersonal;
    }

    @Override
    public String toString() {
        return "Hotel{" + "numpisos=" + numpisos + '}';
    }
    
    
    
}
