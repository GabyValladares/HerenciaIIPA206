/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Docente;
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
        //CLASE 24/11/2026
     //creacion de objetos con ciclos repetitivos 
//        Estudiante[] listaEstudiantes=new Estudiante[5];//LISTA ESTÁTICA TAMAÑO 5 DE CADENAS
//        for (int i = 0; i < 5; i++) {            
//           Estudiante ee=new Estudiante();
//           ee.setNombres(JOptionPane.
//                   showInputDialog("Ingrese sus nombres:"));
//           ee.setApellidos(JOptionPane.
//                   showInputDialog("Ingrese sus apellidos:"));
//           ee.setFechaNacimiento(JOptionPane.
//                   showInputDialog("Ingrese su fecha de Nacimiento (dd/mm/aaaa):"));
//           listaEstudiantes[i]=ee;
//        }
          //DOCENTES
          //1)UPCASTING
                PersonaPrivate luis=new Docente();
                luis.setNombres("Luis");
                luis.setCedula("1002003001");
                          

            //2)DOWNCASTING
                Docente dLuis=(Docente)luis;
                System.out.println(dLuis.toString());
        
        
    }
    
}
