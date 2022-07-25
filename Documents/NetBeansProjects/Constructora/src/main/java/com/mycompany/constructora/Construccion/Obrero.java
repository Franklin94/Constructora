package com.mycompany.constructora.Construccion;

public class Obrero extends Empleado{
    
    //Atributos:
    private String edad;
    private final int salario=1500;//Salario por día.
    
    //Métodos:

    public Obrero(String edad, String nombre, String DNI, String teléfono) {
        super(nombre, DNI, teléfono);
        this.edad = edad;
    }
    
    @Override
    public void trabajar(){
        System.out.println("Soy obrero y construyo.");
    }

    public String getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
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

    public void setEdad(String edad) {
        this.edad = edad;
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
        return "Obrero{" + "edad=" + edad + ", salario=" + salario + '}';
    }
    
    
}
