package model; 

/**
 * 
 * @author juand
 */
public class Computador {

    // Atributos privados que representan los componentes del computador
    private String procesador;
    private String ram;
    private String discoDuro;
    private String tarjetaGrafica;

    // Métodos para establecer los componentes del computador
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Procesador: " + procesador + "\nMemoria RAM: " + ram
                + "\nAlmacenamiento: " + discoDuro + "\nTarjeta Grafica: " + tarjetaGrafica;
    }
}