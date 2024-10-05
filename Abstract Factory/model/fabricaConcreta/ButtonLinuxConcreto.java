package model.fabricaConcreta;

import model.ButtonLinux;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonLinuxConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new ButtonLinux();
    }
}
