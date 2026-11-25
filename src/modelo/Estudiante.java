/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
//CLASE HIJA 
public class Estudiante extends PersonaPrivate{
    private int idEstudiante;
    private String carrera;
    private int nivel;
    private String nroMatricula;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String carrera, int nivel, String nroMatricula) {
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.nivel = nivel;
        this.nroMatricula = nroMatricula;
    }
//CONSTRUCTOR NUEVO INICIALICE ATRIBS PADRE SUPERCLASE+MIS ATRIBUTOS PROPIOS
    public Estudiante(int idEstudiante, String carrera, int nivel, String nroMatricula, int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero) {
        super(idPersona, nombres, apellidos, cedula, direccion, telefono, correoElectronico, fechaNacimiento, genero);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.nivel = nivel;
        this.nroMatricula = nroMatricula;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", carrera=" + carrera + ", nivel=" + nivel + ", nroMatricula=" + nroMatricula + '}';
    }
    
    //MÉTODO DE LÓGICA NEGOCIO
    
    
}
