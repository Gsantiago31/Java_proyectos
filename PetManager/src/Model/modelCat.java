/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
/**
 *
 * @author USUARIO
 */
public class modelCat {
   
    public modelCat() {
    }
    
    public boolean CreatePet(clsCat dog) {
        try {
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean EditPet(clsCat dog) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletePet(clsPet pet) {

        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public clsPet SearchPet(String code) {
        clsCat cat = null;
        try {
            return cat;
        } catch (Exception e) {
            return cat;
        }
    }
}
