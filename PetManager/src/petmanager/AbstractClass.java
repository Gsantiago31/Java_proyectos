/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsDoctor;
import Classes.clsVeterinary;

/**
 *
 * @author USUARIO
 */
public class AbstractClass {
    public static void main(String[] args) {
        
        // Instancias de veterinaria y de dcotor
        clsDoctor doctor = new clsDoctor("María Fernández", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UdC", "036 878 15 00", "Calle 65 N 26-10", doctor);
               
        veterinary.setData(veterinary.getName() + " - " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInformation();
        String type= veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("surgery: " + surgery);
    }
}
