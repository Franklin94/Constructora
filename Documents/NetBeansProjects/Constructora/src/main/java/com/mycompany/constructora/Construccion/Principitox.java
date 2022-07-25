package com.mycompany.constructora.Construccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principitox {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a Pupo construcciones S.A.");
        boolean add = true;
        boolean add2 = true;
        int respuesta, respuesta2,i=0, j=0, canthabitaciones, pisos;
        String name, dni, tel, matricula, edad, answer, domicilio, rubro, nombreobra;
        float cantm2, test, costoxm2;
        
        ArrayList<Obra> obras = new ArrayList<Obra>();
        ArrayList<Empleado> listap = new ArrayList<Empleado>();
        Puposa empresa;
        
        do{
            System.out.println("Ingrese el Arquitecto de la obra:");
            //Arquitecto
            System.out.println("Ingrese el nombre del Arquitecto.");
            name = entrada.next();
            System.out.println("Ingrese el DNI del Arquitecto.");
            dni = entrada.next();
            System.out.println("Ingrese el teléfono del Arquitecto.");
            tel = entrada.next();
            System.out.println("Ingrese la matrícula del Arquitecto.");
            matricula = entrada.next();
            Arquitecto employee = new Arquitecto(name, dni, tel, matricula);
            listap.add(0, employee);//Agrega al empleado recién creado al array.
            //MMO
            System.out.println("Ingrese a alguno de los Maestros mayor de obra de la obra:");
            
            entrada.nextLine();//Para limpiar el scanner.
            System.out.println("Ingrese el nombre del M. mayor de obra.");
            name = entrada.next();
            System.out.println("Ingrese el DNI del M. mayor de obra.");
            dni = entrada.next();
            System.out.println("Ingrese el teléfono del M. mayor de obra.");
            tel = entrada.next();
            System.out.println("Ingrese la edad del M. mayor de obra.");
            edad = entrada.next();
            MaestroMayor employee2 = new MaestroMayor(edad,name, dni, tel);
            listap.add(1, employee2);//Agrega al empleado recién creado al array.
            //Los 2 obreros:
            System.out.println("Ingrese a 2 de los Obreros de la obra:");
            
            entrada.nextLine();//Para limpiar el scanner.
            System.out.println("Ingrese el nombre del 1er Obrero.");
            name = entrada.next();
            System.out.println("Ingrese el DNI del 1er Obrero.");
            dni = entrada.next();
            System.out.println("Ingrese el teléfono del 1er Obrero.");
            tel = entrada.next();
            System.out.println("Ingrese la edad del 1er Obrero.");
            edad = entrada.next();
            Obrero employee3 = new Obrero(edad,name, dni, tel);
            listap.add(2, employee3);//Agrega al empleado recién creado al array.
            
            entrada.nextLine();//Para limpiar el scanner.
            System.out.println("Ingrese el nombre del 2do Obrero.");
            name = entrada.next();
            System.out.println("Ingrese el DNI del 2do Obrero.");
            dni = entrada.next();
            System.out.println("Ingrese el teléfono del 2do Obrero.");
            tel = entrada.next();
            System.out.println("Ingrese la edad del 2do Obrero.");
            edad = entrada.next();
            Obrero employee4 = new Obrero(edad,name, dni, tel);
            listap.add(3, employee4);//Agrega al empleado recién creado al array.
            
            System.out.println("¿Desea continuar agregando personal?\n1.Sí.\n2.No.");
            answer = entrada.next();
            if(answer == "1" || answer == "Sí" ){
                add = true;
            }
            else{
                add = false;
            }
            entrada.nextLine();//Para limpiar el scanner.
            
        }while(add == true);{
            
            System.out.println("Seleccione el tipo de empleado que desea ingresar:\n1.Maestro mayor de obra;\n2.Obrero.");
            respuesta = entrada.nextInt();
            
            switch(respuesta){
                
                case 1:
                    entrada.nextLine();//Para limpiar el scanner.
                    System.out.println("Ingrese el nombre del M. mayor de obra.");
                    name = entrada.next();
                    System.out.println("Ingrese el DNI del M. mayor de obra.");
                    dni = entrada.next();
                    System.out.println("Ingrese el teléfono del M. mayor de obra.");
                    tel = entrada.next();
                    System.out.println("Ingrese la edad del M. mayor de obra.");
                    edad = entrada.next();
                    MaestroMayor employee2 = new MaestroMayor(edad,name, dni, tel);
                    listap.add(i+4, employee2);//Agrega al empleado recién creado al array.
                    i++;
                    break;
                case 2:
                    entrada.nextLine();//Para limpiar el scanner.
                    System.out.println("Ingrese el nombre del Obrero.");
                    name = entrada.next();
                    System.out.println("Ingrese el DNI del Obrero.");
                    dni = entrada.next();
                    System.out.println("Ingrese el teléfono del Obrero.");
                    tel = entrada.next();
                    System.out.println("Ingrese la edad del Obrero.");
                    edad = entrada.next();
                    Obrero employee3 = new Obrero(edad,name, dni, tel);
                    listap.add(i+4, employee3);//Agrega al empleado recién creado al array.
                    i++;
                    break;
            }
            System.out.println("¿Desea continuar agregando personal?\n1.Sí.\n2.No.");
            answer = entrada.next();
            if(answer == "1" || answer == "Sí" ){
                add = true;
            }
            else{
                add = false;
            }
            entrada.nextLine();//Para limpiar el scanner.
            
            
        }
        //Analiza si se cumple la condición de empleados mínima: 1 ARQ - 1<= MMO <=3 - 2<= OBreros 
        int k2,k3;
        k2=k3=0;//Contadores de tipo de trabajadores contratados por obra.
        
        for(Empleado employeexxx: listap){

            if(employeexxx instanceof MaestroMayor){
                k2++;
            }
            else if(employeexxx instanceof Obrero){
                k3++;
            }
        
        }
        if(k2 == 0 || k2 > 3){
            System.out.println("El número de Maestros mayor de obra NO es correcto. Por favor, vuelva a ingresar la lista del personal");
            listap.clear(); //Limpiamos toda la info, pues está mal cargada.
            add2 = false; //No se puede cargar una obra sin personal.
        }
        else if(k3 < 2){
            System.out.println("El número de Maestros mayor de obra NO es correcto. Por favor, vuelva a ingresar la lista del personal");
            listap.clear();//Limpiamos toda la info, pues está mal cargada.
            add2 = false; //No se puede cargar una obra sin personal.
        }
        
        //Agregado de obras realizadas por la empresa:
        
        while(add2 == true){
            
            System.out.println("Seleccione el tipo de obra realizada:\n1.Obra doméstica;\n2.Comercio;\n3.Hotel.");
            respuesta2 = entrada.nextInt();
            
            switch(respuesta2){
                case 1://Obra doméstica:
                   entrada.nextLine();//Limpieza de scanner.
                   System.out.println("¿Cuántas habitaciones posee la casa?");
                   canthabitaciones = entrada.nextInt();
                   entrada.nextLine();
                   System.out.println("¿Cuál es el domicilio de la casa?");
                   domicilio = entrada.next();
                   entrada.nextLine();
                   System.out.println("¿De cuántos m2 es la casa?");
                   cantm2 = entrada.nextFloat();
                   System.out.println("Tiempo aproximado de construcción.");
                   test = entrada.nextFloat();
                   System.out.println("Costo por m2:");
                   costoxm2 = entrada.nextFloat();
                   
                   ObraDoméstica obrad = new ObraDoméstica(canthabitaciones, domicilio, cantm2, test, costoxm2, listap);
                   obras.add(j, obrad);
                   j++;
                   break;
                case 2://Comercio:
                   entrada.nextLine();//Limpieza de scanner.
                   System.out.println("¿Cuál es el rubro del comercio?");
                   rubro = entrada.next();
                   System.out.println("¿Cuál es el nombre del comercio?");
                   nombreobra = entrada.next();
                   System.out.println("¿Cuál es el domicilio del comercio?");
                   domicilio = entrada.next();
                   entrada.nextLine();
                   System.out.println("¿De cuántos m2 es el establecimiento?");
                   cantm2 = entrada.nextFloat();
                   System.out.println("Tiempo aproximado de construcción.");
                   test = entrada.nextFloat();
                   System.out.println("Costo por m2:");
                   costoxm2 = entrada.nextFloat();
                                      
                   Comercio obradd = new Comercio(rubro ,nombreobra, domicilio, cantm2, test, costoxm2, listap);
                   obras.add(j, obradd);
                   j++;
                   break;
                case 3://Hotel:
                   entrada.nextLine();//Limpieza de scanner.
                   System.out.println("¿Cuántos pisos tiene el hotel?");
                   pisos = entrada.nextInt();
                   System.out.println("¿Cuál es el nombre del Hotel?");
                   nombreobra = entrada.next();
                   System.out.println("¿Cuál es el domicilio del mismo?");
                   domicilio = entrada.next();
                   entrada.nextLine();
                   System.out.println("¿De cuántos m2 es el establecimiento?");
                   cantm2 = entrada.nextFloat();
                   System.out.println("Tiempo aproximado de construcción.");
                   test = entrada.nextFloat();
                   System.out.println("Costo por m2:");
                   costoxm2 = entrada.nextFloat();
                                      
                   Hotel telurio = new Hotel(pisos ,nombreobra, domicilio, cantm2, test, costoxm2, listap);
                   obras.add(j, telurio);
                   j++;
                   break;
            }
            //¿Desea continuar?:
            String answer2;
            System.out.println("¿Desea agregar alguna obra más?\n1.Sí.\n2.No.");
            answer2 = entrada.next();
            
            if(answer2 == "1" || answer2 == "Sí" || answer2 == "Si" || answer2 == "si"){
                add2 = true;                
            }
            else{
                add2 = false;
            }
            
        }
        empresa = new Puposa(listap, obras);
        System.out.println(empresa.toString());
        
        
        
    }    
}
