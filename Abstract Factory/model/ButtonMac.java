package model;

import model.fabricaAbstracta.Widget;

public class ButtonMac implements Widget {

    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nBOTON";
    }

    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nMAC OS";
    }
}
