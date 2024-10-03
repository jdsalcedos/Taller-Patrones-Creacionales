/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Documento;

/**
 *
 * @author juand
 */
public class TextoPlano extends Documento {

    // Constructor de la clase TextoPlano
    public TextoPlano(String nombre, String tipo, float size) {
        super(nombre, tipo, size);
    }

    // Override de los métodos abstractos de la clase Documento
    // los cuales contienen los datos únicos del documento PDF
    @Override
    public String crear() {
        return "Creando  documento de texto plano...";
    }

    @Override
    public String mostrarDatos() {
        String res = "El nombre del documento es " + nombre + " y tiene un tamaño de " + size + " MB";
        return res;
    }
}
