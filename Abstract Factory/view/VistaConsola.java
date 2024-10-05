package view;

import java.util.Scanner;

public class VistaConsola {

    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    // Método para mostrar información
    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
    }

    // Método para leer un entero mediante consola
    public int leerDatoEntero(String mensaje) {
        int dato = 0;
        System.out.println(mensaje);
        dato = sc.nextInt();
        return dato;
    }

}
