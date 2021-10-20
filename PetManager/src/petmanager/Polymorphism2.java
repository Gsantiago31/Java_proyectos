/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;

/**
 *
 * @author USUARIO
 */
public class Polymorphism2 {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        clsDog dog = new clsDog("criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        dog.Sound();
        cat.Sound();
        
    }
}
