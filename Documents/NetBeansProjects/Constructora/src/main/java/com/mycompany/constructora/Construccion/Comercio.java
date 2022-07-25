package com.mycompany.constructora.Construccion;

import java.util.ArrayList;

public class Comercio extends ObraComercial{
    
    //Atributos:
    String rubro;
    
    //Métodos:

    public Comercio(String rubro, String nombreobra, String dirección, float cantidadm2, float testimado, float costoxm2, ArrayList<Empleado> listapersonal) {
        super(nombreobra, dirección, cantidadm2, testimado, costoxm2, listapersonal);
        this.rubro = rubro;
    }
    

    public String getRubro() {
        return rubro;
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

    public void setRubro(String rubro) {
        this.rubro = rubro;
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
        return "Comercio{" + "rubro=" + rubro + '}';
    }
    
    
}
