package model.creadorConcreto;

import model.Computador;
import model.abstracto.ComputadorBuilder;

/**
 * 
 * @author juand
 */
public class PcGamingBuilder implements ComputadorBuilder {

    // Atributo privado que representa el computador en construcción
    private Computador pc;

    // Constructor que inicializa el atributo pc con una nueva instancia de
    // Computador
    public PcGamingBuilder() {
        this.pc = new Computador();
    }

    // Métodos que construyen el PC Gaming
    @Override
    public void construirProcesador() {
        pc.setProcesador("i7 13th gen");
    }

    @Override
    public void construirRam() {
        pc.setRam("16 Gb");
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro("1 Tb");
    }

    @Override
    public void construirTarjetaGrafica() {
        pc.setTarjetaGrafica("RTX 3060");
    }

    // Método que devuelve el computador construido
    @Override
    public Computador obtenerComputador() {
        return this.pc;
    }
}