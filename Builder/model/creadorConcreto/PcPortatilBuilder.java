/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import model.Computador;
import model.abstracto.ComputadorBuilder;

/**
 *
 * @author juand
 */
public class PcPortatilBuilder implements ComputadorBuilder {

    // Atributo privado que representa el computador en construcción
    private Computador pc;

    // Constructor que inicializa el atributo pc con una nueva instancia de
    // Computador
    public PcPortatilBuilder() {
        this.pc = new Computador();
    }

    // Métodos que construyen el PC portátil
    @Override
    public void construirProcesador() {
        pc.setProcesador("i5 13th gen");
    }

    @Override
    public void construirRam() {
        pc.setRam("8 Gb");
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro("1 Tb");
    }

    @Override
    public void construirTarjetaGrafica() {
        pc.setTarjetaGrafica("Integrada");
    }

    // Método que devuelve el computador construido
    @Override
    public Computador obtenerComputador() {
        return this.pc;
    }
}
