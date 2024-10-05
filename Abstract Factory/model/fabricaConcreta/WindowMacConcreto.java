package model.fabricaConcreta;

import model.WindowMac;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowMacConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new WindowMac();
    }
}
