package com.mycompany.constructora.Construccion;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Obra {
    //Atributos:
    protected String dirección;
    protected float cantidadm2;//Cantidad de metros cuadrados.
    protected float testimado;//Tiempo estimado para finalizar la obra (en días).
    protected float costoxm2; //Costo por metro cuadrado.
    protected ArrayList<Empleado> listapersonal; //Listado del personal asignado.
    
    
    //Métodos:

    public Obra(String dirección, float cantidadm2, float testimado, float costoxm2, ArrayList<Empleado> listapersonal) {
        this.dirección = dirección;
        this.cantidadm2 = cantidadm2;
        this.testimado = testimado;
        this.costoxm2 = costoxm2;
        this.listapersonal = listapersonal;
        
    }

    public float precioestimado(float costoxm2, float cantidadm2, float testimado){
        
        Scanner entrada = new Scanner(System.in);
        int numobreros, nummmo;
        float price;
        System.out.println("Ingrese el numero de obreros que trabajan en esta obra:");
        numobreros = entrada.nextInt();
        System.out.println("Ingrese el numero de Maestros mayor de obra que trabajan en esta obra:");
        nummmo = entrada.nextInt();
        
        int costempl = 2000 + numobreros*1500 + nummmo*1800; //Arquitecto + Obreros + MMO
        price = costoxm2*cantidadm2 + costempl*testimado;
        
        return price;
    }
    

    public String getDirección() {
        return dirección;
    }

    public float getCantidadm2() {
        return cantidadm2;
    }

    public float getTestimado() {
        return testimado;
    }

    public float getCostoxm2() {
        return costoxm2;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setCantidadm2(float cantidadm2) {
        this.cantidadm2 = cantidadm2;
    }

    public void setTestimado(float testimado) {
        this.testimado = testimado;
    }

    public void setCostoxm2(float costoxm2) {
        this.costoxm2 = costoxm2;
    }

    public void setListapersonal(ArrayList<Empleado> listapersonal) {
        this.listapersonal = listapersonal;
    }

    public ArrayList<Empleado> getListapersonal() {
        return listapersonal;
    }

    @Override
    public String toString() {
        return "Obra{" + "direcci\u00f3n=" + dirección + ", cantidadm2=" + cantidadm2 + ", testimado=" + testimado + ", costoxm2=" + costoxm2 + ", listapersonal=" + listapersonal + '}';
    }
    

    
}
