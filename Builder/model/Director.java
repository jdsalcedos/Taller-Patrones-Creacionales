/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.ComputadorBuilder;

/**
 * 
 * @author juand
 */
public class Director {

    // Atributo privado que almacena una referencia a un ComputadorBuilder
    private ComputadorBuilder computadorBuilder;

    // Constructor que inicializa el atributo computadorBuilder
    public Director(ComputadorBuilder computadorBuilder) {
        this.computadorBuilder = computadorBuilder;
    }

    // Método que construye un PC utilizando los métodos del ComputadorBuilder
    public void construirPc() {
        computadorBuilder.construirProcesador();
        computadorBuilder.construirRam();
        computadorBuilder.construirDiscoDuro();
        computadorBuilder.construirTarjetaGrafica();
    }
}