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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Prueba {

    public static void main(String[] args) {
        /*  List<String> lista = new ArrayList<>();
        Carrera computacion = new Carrera();
        Estudiante estu = new Estudiante();
        Grupo grupo1 = new Grupo();
        HistorialCalificaciones historial = new HistorialCalificaciones();
        Materia programacion = new Materia();
        Persona person = new Persona();
        Profesor profe = new Profesor();
        Sede cuenca = new Sede();
        System.out.println("CARRERA");
        computacion.setCodigo(3);
        System.out.println("LAS MATERIAS DE LA CARRERA SON :");
        lista.add("Programacion");
        lista.add("matematicas avansadas");
        lista.add("Etica");
        lista.add("Estructura de datos");
        lista.add("electroniica");
        
        for (int i = 0; i < lista.size(); i++) {
            String valor = lista.get(i);
            System.out.println(valor);
        }
        computacion.setNombre("Computación");
        int cod = computacion.getCodigo();
        String nom = computacion.getNombre();
        System.out.println("El codigo es :"+cod);
        System.out.println("Nombre de la carrera :"+nom);
        System.out.println("");
        System.out.println("CARRERA");
        estu.setCarrera(computacion);
        Carrera est=estu.getCarrera();
        System.out.println("El estudiante cursa la carrera de  :"+est);
        System.out.println("");
        System.out.println("GRUPO");
        grupo1.setCodigo(2);
        grupo1.setCupo(45);
        grupo1.setNombre("GRUPO 5 TARA RA RAN ");
        System.out.println("");
        System.out.println("HISTORIAL CALIFICACIONES");
        historial.setAprovechamiento1(45);
        historial.setExamen1(42);
        historial.setAprovechamiento2(40);
        historial.setExamen2(40);
        historial.setMateria(programacion);
        int apro1=historial.getAprovechamiento1();
        int ex1=historial.getExamen1();
        int apro2=historial.getAprovechamiento2();
        int ex2=historial.getExamen2();
        Materia mat=historial.getMateria();
        System.out.println("La materia es  :"+mat);
        System.out.println("El aprovechameinto1 es :"+apro1);
        System.out.println("La calificacion del promer examen es :"+ex1);
        System.out.println("El aprovechamiento 2 es :"+apro2);
        System.out.println("La calificacion del segundo examen es :"+ex2);
        person.setCodigo(3);
        person.setCedula("1150536033");
        person.setCorreo("drivadeneriac2@est.ups.edu.ec");
        person.setDireccion("Av.Americas");
        person.setSede(cuenca);
        person.setTelefono("0999886175");
        int cod1=person.getCodigo();
        String cedu=person.getCedula();
        String corr=person.getCorreo();
        String tel=person.getTelefono();
        String dir=person.getDireccion();
        Sede sed=person.getSede();
        System.out.println("El codigo de persona es :"+cod1);
        System.out.println("El correo de la persona es :"+corr);
        System.out.println("El telefono de la persona es :"+tel);
        System.out.println("La direccion de la persona es :"+dir);
    }*/
        //crear 6 materias 
        //crear 3 materias
        //crear 2 estudiantes
        //agregar 2 materias a cada carrera 
        //crear un alista para cada estudiante  con un metodo lista 
        //a cada materia agregar a1 grupo y un profesor llamando a los setgrupo

        Sede sedeCuenca = new Sede(1, "cuenca", "calle vieja", "0999886175");
        //sedeCuenca.Carrera agregarCarrera = new Carrera();

        Carrera computacion = new Carrera(1, "computacion");
        Carrera telematica = new Carrera(2, "telematica");

        Materia progra = new Materia(1, "Programación", 3);
        Materia MatematicasA = new Materia(2, "Matematicas Avanzadas", 3);
        Materia Estructura = new Materia(3, "Estructura de Datos", 3);

        Grupo grupo1 = new Grupo();
        System.out.println("GRUPO");
        grupo1.setCodigo(2);
        grupo1.setCupo(45);
        grupo1.setNombre("Grupop 1");

        Profesor profe1 = new Profesor("Ingeniero", 3000, "Profesor de Progrmación");
        Profesor profe2 = new Profesor("Ingeniero", 3000, "Profesora de Estructura de Datos");

        Estudiante estu1 = new Estudiante(telematica, 2, "Dennis Rivadeneira", "1150536033");
        Estudiante estu2 = new Estudiante(computacion, 2, "Andrés Cabrera ", "1150536033");

        List<String> listaEstu = new ArrayList<>();
        listaEstu.add("");
        listaEstu.add("");
        listaEstu.add("");
        listaEstu.add("");
        listaEstu.add("");

        for (int i = 0; i < listaEstu.size(); i++) {
            String valor = listaEstu.get(i);
            System.out.println(valor);
        }

    }
}
