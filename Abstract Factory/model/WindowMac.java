package model;

import model.fabricaAbstracta.Widget;

public class WindowMac implements Widget {

    //override para adaptar los metodos a este tipo de widget y su SO
    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nVENTANA";
    }

    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nMAC OS";
    }
}
