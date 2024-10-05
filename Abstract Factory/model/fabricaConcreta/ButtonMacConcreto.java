package model.fabricaConcreta;

import model.ButtonMac;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonMacConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new ButtonMac();
    }
}
