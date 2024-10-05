package model.fabricaConcreta;

import model.ButtonMac;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonMacConcreto implements WidgetFactory {

    // Método que crea y retorna una instancia de ButtonMac
    @Override
    public Widget crearWidget() {
        return new ButtonMac(); // Retorna una nueva instancia de ButtonMac
    }
}