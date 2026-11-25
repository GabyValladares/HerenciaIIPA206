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
         super();
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
    public Docente(int idDocente, int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero){
        super(idPersona, nombres, apellidos, cedula, direccion, telefono,
                correoElectronico, fechaNacimiento, genero);
        this.idDocente=idDocente;
        
    }
    public Docente(int idDocente, String nombres){
        super();
        this.idDocente=idDocente;
        
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
        return "---DATOS DE PERSONA---"+"\n"+
                "Nombres:"+getNombres()+"\n"+
                "Apellidos:"+getApellidos()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Correo Electrónico:"+getCorreoElectronico()+"\n"+
                "Fecha de Nacimiento:"+getFechaNacimiento()+"\n"+
                "Género:"+getGenero()+"idDocente=" + idDocente + ", rol=" + rol + ", jornada=" + jornada + '}';
    }
    
    public void calcularSueldo(){}
    
    
}
