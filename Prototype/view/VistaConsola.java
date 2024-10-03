/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    // Método para mostrar información al usuario
    public void mostrarDatos(String msj) {
        System.out.println(msj);
    }

    // Método para leer un dato de tipo String
    public String leerDatoStr(String msj) {
        String dato = "";
        System.out.println(msj);
        dato = sc.nextLine();
        return dato;
    }

    // Método para leer un dato de tipo entero
    public int leerDatoInt(String msj) {
        int dato;
        System.out.println(msj);
        dato = sc.nextInt();
        return dato;
    }
}
