/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
public interface DocumentoFactory {

    // Método para crear un documento con los respectivos atributos
    Documento crearDocumento(String nombre, String tipo, float size);

}
