/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Personaje;
import model.creadorConcreto.PersonajesGestor;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    // Método que ejecuta el proceso del programa
    public void Run() {

        int op = 0;
        // Se crean los prototipos
        Personaje ninja = new Personaje("Jose", 150, "CaC; Daga Oculta ", 1);
        Personaje arquero = new Personaje("Johan", 200, "A Distancia; Flechas de Fuego;", 4);

        // Se crea el gestor de prototipos
        PersonajesGestor gestor = new PersonajesGestor();
        // Se agregan los prototipos al gestor
        gestor.addPrototype("ninja", ninja);
        gestor.addPrototype("arquero", arquero);

        // Se muestran los datos de los prototipos
        vista.mostrarDatos(ninja.toString());
        vista.mostrarDatos(arquero.toString());

        // Se piden al usuario los datos del clon
        String nombreNuevo = vista.leerDatoStr("Ingrese el nombre del clon:");
        int puntosVidaNuevo = vista.leerDatoInt("Ingrese la cantidad de puntos de vida del clon:");

        // Mostrar el menú y leer la opción seleccionada
        String menu = "1.   Clonar un guerrero. \n"
                + "2.   Clonar un arquero. \n"
                + "3.   Cerrar el programa. \n"
                + "Seleccion opcion...";

        int opcion = vista.leerDatoInt(menu);

        if (opcion == 1) {
            // Se clona el prototipo ninja
            Personaje clonNinja = (Personaje) gestor.getPrototype("ninja");

            // Se cambian los datos del clon
            clonNinja.setNombre(nombreNuevo);
            clonNinja.setPuntosVida(puntosVidaNuevo);

            // Se muestran los datos del clon y del prototipo
            vista.mostrarDatos("Datos clon: " + clonNinja.toString());
            vista.mostrarDatos("Datos prototipo: " + ninja.toString());

        } else if (opcion == 2) {
            // Se clona el prototipo arquero
            Personaje clonArquero = (Personaje) gestor.getPrototype("arquero");

            // Se cambian los datos del clon
            clonArquero.setNombre(nombreNuevo);
            clonArquero.setPuntosVida(puntosVidaNuevo);

            // Se muestran los datos del clon y del prototipo
            vista.mostrarDatos("Datos clon: " + clonArquero.toString());
            vista.mostrarDatos("Datos prototipo: " + arquero.toString());

        } else if (opcion == 3) {
            System.out.println("Cerrando el programa...");
        } else {
            System.out.println("Opción no válida.");
        }
    }

}
