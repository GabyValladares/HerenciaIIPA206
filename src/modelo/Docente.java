/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Docente extends PersonaPrivate {
    private int idDocente;
    private String rol;
    private String jornada;

    public Docente() {
    }

    public Docente(int idDocente, String rol, String jornada) {
        this.idDocente = idDocente;
        this.rol = rol;
        this.jornada = jornada;
    }

    public Docente(int idDocente, String rol, String jornada, int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero) {
        super(idPersona, nombres, apellidos, cedula, direccion, telefono, correoElectronico, fechaNacimiento, genero);
        this.idDocente = idDocente;
        this.rol = rol;
        this.jornada = jornada;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Docente{" + "idDocente=" + idDocente + ", rol=" + rol + ", jornada=" + jornada + '}';
    }
    
    public void calcularSueldo(){}
    
    
}
