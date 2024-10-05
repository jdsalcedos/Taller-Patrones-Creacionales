package controller;

import model.fabricaConcreta.*;
import view.VistaConsola;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    // Método principal que ejecuta el programa
    public void run() {
        int op = 0;
        do {
            op = menu(); // Muestra el menú y obtiene la opción seleccionada
            switch (op) {
                case 1:
                    widget(new WindowWindowsConcreto()); // Crea y muestra widgets para Windows
                    widget(new ButtonWindowsConcreto()); // Crea y muestra botones para Windows
                    break;
                case 2:
                    widget(new WindowLinuxConcreto()); // Crea y muestra widgets para Linux
                    widget(new ButtonLinuxConcreto()); // Crea y muestra botones para Linux
                    break;
                case 3:
                    widget(new WindowMacConcreto()); // Crea y muestra widgets para Mac
                    widget(new ButtonMacConcreto()); // Crea y muestra botones para Mac
                    break;
                case 4:
                    System.exit(0);
                default:
                    vista.mostrarInformacion("Ingrese una opción válida");
            }
            vista.mostrarInformacion("");
        } while (op != 5);
    }

    // Método que crea y muestra la información de un widget
    public void widget(WidgetFactory widgets) {
        Widget info = widgets.crearWidget(); // Crea el widget
        vista.mostrarInformacion(info.tipoWidget()); // Muestra el tipo de widget
        vista.mostrarInformacion(info.sistemaOperativo()); // Muestra el sistema operativo del widget
    }

    // Método que muestra el menú y retorna la opción seleccionada
    public int menu() {
        vista.mostrarInformacion("1. Crear Widgets para Windows.");
        vista.mostrarInformacion("2. Crear Widgets para Linux.");
        vista.mostrarInformacion("3. Crear Widgets para MacOS.");
        vista.mostrarInformacion("4. Cerrar el programa.");
        return vista.leerDatoEntero("Digite una opción"); // Lee y retorna la opción seleccionada
    }
}