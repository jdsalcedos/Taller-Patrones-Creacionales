package view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    // Método para leer un dato entero desde la consola
    public int leerDatoInt(String msj) {
        int dato;
        System.out.println(msj); // Muestra el mensaje al usuario
        dato = sc.nextInt();
        return dato;
    }

    // Método para leer un dato de tipo double desde la consola
    public double leerDatoDouble(String msj) {
        double dato;
        System.out.println(msj); // Muestra el mensaje al usuario
        dato = sc.nextDouble();
        return dato;
    }
}