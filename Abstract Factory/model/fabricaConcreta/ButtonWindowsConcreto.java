package model.fabricaConcreta;

import model.ButtonWindows;
import model.fabricaAbstracta.WidgetFactory;
import model.fabricaAbstracta.Widget;

public class ButtonWindowsConcreto implements WidgetFactory {

    @Override
    public Widget crearWidget() {
        return new ButtonWindows();
    }
}
