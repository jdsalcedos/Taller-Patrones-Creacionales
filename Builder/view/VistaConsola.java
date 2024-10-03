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
    Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    // Método para leer una cadena de texto del usuario
    public String leerDatoStr(String msj) {
        sc.nextLine();
        System.out.println(msj);
        String dato = sc.nextLine();
        return dato;
    }

    // Método para leer un entero del usuario
    public int leerDatoInt(String msj) {
        System.out.println(msj);
        int dato = sc.nextInt();
        return dato;
    }

    // Método para mostrar datos al usuario
    public void mostrarDatos(String msj) {
        System.out.println(msj);
    }
}
