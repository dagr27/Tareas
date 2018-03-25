package tarea1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class imprimir {
    String nombre;
    String apellido;
    String carrera;
    String fechaNac;
    int edad;
    public imprimir(String name, String lastname, String ca, String date, int age){
        this.nombre = name;
        this.apellido = lastname;
        carrera = ca;
        fechaNac = date;
        edad = age;
    
    }

   
    public void mostrar(){
        System.out.println("Nombre: "+nombre+ ", apellido: "+apellido+", "+"carrera: "+carrera+", "+"fecha de nacimiento: "+fechaNac+", "+"edad: "+edad);
    }
}
