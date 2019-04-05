/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;


/**
 *
 * @author LENOVO
 */
public class Sede {
    private int  codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carrera;
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public void setdireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
   public void setCarrera(List<Carrera> carrera){
        this.carrera=carrera;
   }
   public int  getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String  getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
     public List<Carrera> getCarrera(){
        return this.carrera;
    }
        
   

       }



    

