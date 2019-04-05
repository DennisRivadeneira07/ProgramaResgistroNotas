/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Grupo {
     private int codigo;
     private String nombre ;
     private int cupo;
  
    /**
     * 
     * @param titulo 
     */
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public void setCupo(int cupo){
        this.cupo=cupo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int  getCupo(){
        return this.cupo;
    
    }

       
       }


    

