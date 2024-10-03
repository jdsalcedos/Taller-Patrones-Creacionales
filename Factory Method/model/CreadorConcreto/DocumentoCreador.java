/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CreadorConcreto;

import model.abstracto.Documento;
import model.abstracto.DocumentoFactory;
import model.*;

/**
 *
 * @author juand
 */
public class DocumentoCreador implements DocumentoFactory {

    // Método para crear un documento comparando por elTipo
    @Override
    public Documento crearDocumento(String nombre, String tipo, float size) {
        if (tipo.equals("texto plano")) {
            // Retorna un objeto de tipo TextoPlano
            return new TextoPlano(nombre, tipo, size);
        } else if (tipo.equals("pdf")) {
            // Retorna un objeto de tipo PDF
            return new DocPDF(nombre, tipo, size);
        }
        return null;
    }
}
