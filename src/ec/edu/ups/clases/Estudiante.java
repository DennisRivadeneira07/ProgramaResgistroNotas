/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author LENOVO
 */
public class Estudiante extends Persona {

    private Carrera carrera;

    public Estudiante() {

    }

    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
        this.carrera = carrera;
    }
    

    public Estudiante(int codigo) {
        this.setCodigo(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion) {
        super(codigo, nombre, cedula);
    }

    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, String sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.carrera = carrera;
    }
    

    public Estudiante(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Carrera getCarrera() {
        return this.carrera;
    }

}
