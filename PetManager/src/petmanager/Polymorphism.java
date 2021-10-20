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
public class Polymorphism {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        clsDog dog = new clsDog("criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        // Instancias de veterinaria y de dcotor
        clsDoctor doctor = new clsDoctor("María Fernández", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UdC", "036 878 15 00", "Calle 65 N 26-10", doctor);
        
        String careDog = veterinary.PetCare(dog);
        System.out.println("El estado de salud de " + dog.getName() + " es " + careDog);
        
        String careCat = veterinary.PetCare(cat);
        System.out.println("El estado de salud de " + cat.getName() + " es " + careCat);
    }
}
