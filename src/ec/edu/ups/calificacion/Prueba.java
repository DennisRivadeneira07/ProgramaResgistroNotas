/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.calificacion;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificaciones;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Prueba {
    public static void main(String []args)
    {
    Carrera computacion=new Carrera() ;
    Estudiante estu=new Estudiante();
    Grupo grupo1=new Grupo();
    HistorialCalificaciones historial=new HistorialCalificaciones();
    Materia programacion=new Materia();
    Persona person=new Persona();
    Profesor profe=new Profesor();
    Sede cuenca=new Sede();
    System.out.println("CARRERA");
    computacion.setCodigo(3);
    List<Materia> programacionAplicada = null;
    List<Materia> materia = programacionAplicada;
    computacion.setMateria(materia);
    computacion.setNombre("Computación");
    
    
}
}