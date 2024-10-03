/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
// Interfaz Prototype que contiene el método clone
public interface Prototype extends Cloneable {
    // Método clone que retorna un objeto de tipo Prototype
    Prototype clone();
}
