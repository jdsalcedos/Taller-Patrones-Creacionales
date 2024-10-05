package model.fabricaConcreta;

import model.WindowWindows;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowWindowsConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de WindowWindows
    @Override
    public Widget crearWidget() {
        return new WindowWindows(); // Retorna una nueva instancia de WindowWindows
    }
}