package model.fabricaConcreta;

import model.WindowMac;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowMacConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de WindowMac
    @Override
    public Widget crearWidget() {
        return new WindowMac(); // Retorna una nueva instancia de WindowMac
    }
}