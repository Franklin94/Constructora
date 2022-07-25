package com.mycompany.constructora.Construccion;

public class MaestroMayor extends Empleado{
    
    //Atributos:
    private String edad;
    private final int salario=1800;
    
    //Métodos:

    public MaestroMayor(String edad, String nombre, String DNI, String teléfono) {
        super(nombre, DNI, teléfono);
        this.edad = edad;
    }
    
    @Override
    public void trabajar(){
        System.out.println("Soy el más capito pero me dicen papito mi rey, y superviso las construcciones.");
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
        return "MaestroMayor{" + "edad=" + edad + ", salario=" + salario + '}';
    }
    
    
    
}
