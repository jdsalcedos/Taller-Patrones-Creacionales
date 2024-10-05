package model;

import model.fabricaAbstracta.Widget;

public class WindowMac implements Widget {

    // Método que retorna el tipo de widget
    @Override
    public String tipoWidget() {
        return "Tipo de widget:\nVENTANA"; // Retorna el tipo de widget como "VENTANA"
    }

    // Método que retorna el tipo de sistema operativo
    @Override
    public String sistemaOperativo() {
        return "Tipo de sistema operativo:\nMAC OS"; // Retorna el sistema operativo como "MAC OS"
    }
}