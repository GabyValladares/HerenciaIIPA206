/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
//CLASE BÁSICA
public class PersonaPrivate {

    //ATRIBUTOS
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String fechaNacimiento;
    private String genero;

    //MÉTODOS
    //1)CONSTRUCTORES
    public PersonaPrivate() {
    }

    public PersonaPrivate(int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    //MÉTODOS ENCAPSULAMIENTO
    //PERMISOS DE ESCRITURA ->SET , ASIGNAR, INICIALIZAR
    public void setIdPersona(int idPersona){
        this.idPersona=idPersona;
    }
    //PERMISOS DE LECTURA ->GET,LEER,CONSULTAR
    public int getIdPersona(){
        return idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    

    //MÉTODO DE LÓGICA DE NEGOCIO
    
    //IMPRIMIR
    public void imprimir(){
        System.out.println("---DATOS DE PERSONA---"+"\n"+
                "Nombres:"+this.nombres+"\n"+
                "Apellidos:"+apellidos+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+direccion+"\n"+
                "Teléfono:"+telefono+"\n"+
                "Correo Electrónico:"+correoElectronico+"\n"+
                "Fecha de Nacimiento:"+fechaNacimiento+"\n"+
                "Género:"+genero
        );
    
    }
    //TOSTRING LLAMADO A UNA JERARQUÍA SUPERIOR
    //LA SOBRECARGA: VARIOS MÉTODOS CON EL MISMO NOMBRE PERO DIFERENTE FIRMA O ESTRUCTURA
    //override->SOBREESCRITURA:DECLARAR UN MÉTODO SIN BLOQUE DE CÓDIGO E IMPLEMENTARLO A FUTURO
    @Override
    public String toString() {
        return "---DATOS DE PERSONA---"+"\n"+
                "Nombres:"+this.nombres+"\n"+
                "Apellidos:"+apellidos+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+direccion+"\n"+
                "Teléfono:"+telefono+"\n"+
                "Correo Electrónico:"+correoElectronico+"\n"+
                "Fecha de Nacimiento:"+fechaNacimiento+"\n"+
                "Género:"+genero;
                
                }
    
  
    public void validarCedula() {
        String cedulaIngresada =cedula;
        int[] cedula = new int[10];
        int contp = 0;
        int contim = 0;
        if (cedulaIngresada.length() == 10) {
            for (int i = 0; i < 10; i++) {

                char valor = cedulaIngresada.charAt(i);
                System.out.println("------------" + valor);
                cedula[i] = valor - '0';
                System.out.println(cedulaIngresada.charAt(i) + "////" + cedula[i]);
            }
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    int c = cedula[i] * 2;
                    if (c > 9) {
                        c = c - 9;
                    }
                    contp += c;
                } else {
                    contim += cedula[i];
                }
            }
            int sum = contp + contim;
            System.out.println("contp:" + contp + "\n" + "contim:" + contim + "\n" + "suma:" + sum);
            if (sum % 10 == 0) {
                if (cedula[9] == 0) {
                    JOptionPane.showMessageDialog(null, "Cédula Correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula Incorrecta");
                }
            } else {
                int digito = 10 - (sum % 10);
                if (cedula[9] == digito) {
                    JOptionPane.showMessageDialog(null, "Cédula Correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula Incorrecta");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cédula debe contener 10 digitos");

        }
    }

    public void validarCedula(String cedula) {

        int sumImpar = 0, sumPar = 0, sumTot = 0, digtFinal = 0;
        if (cedula.length() == 10) {
            for (int i = 0; i < cedula.length(); i++) {
                int digito = (cedula.charAt(i)) - '0';
                if (i % 2 == 0) {
                    int mul = digito * 2;
                    if (mul > 9) {
                        mul -= 9;
                    }
                    sumImpar += mul;
                } else if (i % 2 != 0 && i != 9) {
                    sumPar += digito;
                } else if (i == 9) {
                    digtFinal = digito;
                }
            }
            sumTot = sumImpar + sumPar;
            if (sumTot % 10 == 0) {
                if (digtFinal == 0) {
                    JOptionPane.showMessageDialog(null, "Cédula Correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula Incorrecta");
                }
            } else {
                int digito = 10 - (sumTot % 10);
                if (digtFinal == digito) {
                    JOptionPane.showMessageDialog(null, "Cédula Correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula Incorrecta");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cédula válida");
        }
    }

}
