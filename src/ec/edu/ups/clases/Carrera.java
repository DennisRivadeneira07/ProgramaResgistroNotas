/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;
public class Carrera {
    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", materia=" + materia + '}';
    }
    private int codigo;
    private String nombre;
    private List<Materia> materia;
    
    public Carrera(){ 
        
    }
    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
     public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public void setMateria(List<Materia> materia){
        this.materia=materia;
    }
    public  int    getCodigo(){
        return this.codigo;
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public  List<Materia> getMateria(){
        return this.materia;
    } 
}

    
    
    

