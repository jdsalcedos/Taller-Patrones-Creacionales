package model;

import model.fabricaAbstracta.Widget;

public class WindowLinux implements Widget {

    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nVENTANA";
    }

    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nLINUX";
    }
}
