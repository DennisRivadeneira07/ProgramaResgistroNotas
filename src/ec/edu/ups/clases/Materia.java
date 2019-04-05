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
public class Materia {

    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public void setNumeroHoras(int numeroHoras){
        this.numeroHoras=numeroHoras;
    }
    public void setNumeroCreditos(int numeroCreditos){
        this.numeroCreditos=numeroCreditos;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    public void setGrupo(Grupo grupo){
        this.grupo=grupo;
        
    }
    public void setProfesor(Profesor profesor){
        this.profesor=profesor;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int  getNumeroHoras(){
        return this.numeroHoras;
    }
     public int  getNumeroCreditos(){
        return this.numeroCreditos;
    }
        public int  getNivel(){
        return this.nivel;
    }
        public Grupo  getGrupo(){
        return this.grupo;
    }
        public Profesor  getProfesor(){
        return this.profesor;
        }
       }