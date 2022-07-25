package com.mycompany.constructora.Construccion;

public abstract class Empleado {
    //Atributos:
    protected String nombre;
    protected String DNI;
    protected String teléfono;
    
    //Métodos:
    public abstract void trabajar();
    

    public Empleado(String nombre, String DNI, String teléfono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.teléfono = teléfono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", DNI=" + DNI + ", tel\u00e9fono=" + teléfono + '}';
    }
    
}
