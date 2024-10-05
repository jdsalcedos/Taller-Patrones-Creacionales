package model;

import model.fabricaAbstracta.Widget;

public class WindowWindows implements Widget {

    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nVENTANA";
    }

    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nWINDOWS";
    }
}
