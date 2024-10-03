/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Prototype;

/**
 *
 * @author juand
 */
public class Personaje implements Prototype {

    // Atributos privados
    private String nombre;
    private int puntosVida;
    private String habilidades;
    private int nivel;

    // Constructor
    public Personaje(String nombre, int puntosVida, String habilidades, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.habilidades = habilidades;
        this.nivel = nivel;
    }

    // Método clone que retorna un objeto de tipo Personaje
    @Override
    public Prototype clone() {
        return new Personaje(this.nombre, this.puntosVida, this.habilidades, this.nivel);
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Método toString
    @Override
    public String toString() {
        return "Personaje {Nombre: '" + nombre + "'', Puntos de Vida: '" + puntosVida + "', Habilidades: '"
                + habilidades + "', Nivel: '" + nivel + "'}";
    }

}
