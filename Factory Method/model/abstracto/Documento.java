/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
public abstract class Documento{

    //Atributos
    protected String nombre;
    protected String tipo;
    protected float size;
    
    //Constructor
    public Documento(String nombre, String tipo, float size){
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
    }

    //Métodos
    public abstract String crear();
    public abstract String mostrarDatos();
    
}