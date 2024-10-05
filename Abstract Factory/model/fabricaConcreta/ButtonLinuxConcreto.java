package model.fabricaConcreta;

import model.ButtonLinux;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonLinuxConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de ButtonLinux
    @Override
    public Widget crearWidget() {
        return new ButtonLinux(); // Retorna una nueva instancia de ButtonLinux
    }
}