/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Estudiante;
import modelo.Persona;
import modelo.PersonaPrivate;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        //CREAR OBJETOS
        Persona p1=new Persona(10, "Gaby", "Valladares","1003297792", "Ibarra",
                "0992937736", "gvalladares@ist17dejulio.edu.ec", "15/11/1992", "Femenino");
        //p1.imprimir();
       // p1.validarCedula();
       // System.out.println("----\n"+p1.toString());
        Persona p3=new Persona();
        p3.apellidos="Correa";
        
        //OBJETO PERSONAPRIVATE
        PersonaPrivate pp=new PersonaPrivate();
        pp.setNombres("JUAN");
        //pp.imprimir();
        Estudiante e=new Estudiante();
        e.setApellidos("Romo");
        e.imprimir();
        
    }
    
}
