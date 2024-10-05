package model;

import model.fabricaAbstracta.Widget;

public class ButtonWindows implements Widget {

    //override para adaptar los metodos a este tipo de widget y su SO
    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nBOTON";
    }

    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nWINDOWS";
    }

}
