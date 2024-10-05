package model.fabricaConcreta;

import model.ButtonWindows;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonWindowsConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de ButtonWindows
    @Override
    public Widget crearWidget() {
        return new ButtonWindows(); // Retorna una nueva instancia de ButtonWindows
    }
}