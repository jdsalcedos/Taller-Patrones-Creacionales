package model.fabricaConcreta;

import model.WindowLinux;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowLinuxConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de WindowLinux
    @Override
    public Widget crearWidget() {
        return new WindowLinux(); // Retorna una nueva instancia de WindowLinux
    }
}