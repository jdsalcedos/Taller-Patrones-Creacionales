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

    public void run() {
        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    widget(new WindowWindowsConcreto());
                    widget(new ButtonWindowsConcreto());
                    break;
                case 2:
                    widget(new WindowLinuxConcreto());
                    widget(new ButtonLinuxConcreto());
                    break;
                case 3:
                	widget(new WindowMacConcreto());
                    widget(new ButtonMacConcreto());
                    break;
                case 4:
                    System.exit(0);
                default:
                    vista.mostrarInformacion("Ingrese una opción válida");
            }
            vista.mostrarInformacion("");
        } while (op != 5);
    }

    public void widget(WidgetFactory widgets) {
        Widget info = widgets.crearWidget();
        vista.mostrarInformacion(info.tipoWidget());
        vista.mostrarInformacion(info.sistemaOperativo());

    }
    
    public int menu() {
    	vista.mostrarInformacion("1. Crear Widgets para Windows.");
    	vista.mostrarInformacion("2. Crear Widgets para Linux.");
    	vista.mostrarInformacion("3. Crear Widgets para MacOS.");
    	vista.mostrarInformacion("4. Cerrar el programa.");
		return vista.leerDatoEntero("Digite una opción");
	}


}
