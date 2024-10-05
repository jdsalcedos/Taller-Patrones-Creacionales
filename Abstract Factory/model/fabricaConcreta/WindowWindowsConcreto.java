package model.fabricaConcreta;

import model.WindowWindows;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class WindowWindowsConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new WindowWindows();
    }
}
