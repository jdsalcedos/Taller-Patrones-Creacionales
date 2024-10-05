package model.fabricaConcreta;

import model.WindowLinux;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowLinuxConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new WindowLinux();
    }
}
