package com.mycompany.constructora.Construccion;

public class Arquitecto extends Empleado{
    //Atributos:
    String matricula;//Número de matrícula.
    int salarioxdia=2000;//Salario diario.
    
    //Métodos:
    
    @Override
    public void trabajar(){
        System.out.println("Creando el próximo plano.");
    }

    public Arquitecto(String nombre, String DNI, String teléfono, String matricula) {
        super(nombre, DNI, teléfono);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getSalarioxdia() {
        return salarioxdia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDNI() {
        return DNI;
    }

    @Override
    public String getTeléfono() {
        return teléfono;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalarioxdia(int salarioxdia) {
        this.salarioxdia = salarioxdia;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "matricula=" + matricula + ", salarioxdia=" + salarioxdia + '}';
    }
    
    
}
