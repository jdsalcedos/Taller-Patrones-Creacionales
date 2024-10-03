/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import java.util.HashMap;
import java.util.Map;
import model.abstracto.Prototype;

/**
 *
 * @author juand
 */
public class PersonajesGestor {
    // Map que contiene los prototipos de los personajes por tuplas de llave y valor
    private Map<String, Prototype> prototipos = new HashMap();

    // Método para agregar un prototipo al map
    public void addPrototype(String llave, Prototype prototipo) {
        prototipos.put(llave, prototipo);
    }

    // Método para obtener un prototipo del map usando la llave
    public Prototype getPrototype(String llave) {
        return prototipos.get(llave).clone();
    }
}
