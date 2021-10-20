/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gomez
 */
public class ClsCustomer extends ClsPerson{
    private String address;
    private String telephone;

    public ClsCustomer(String Address, String telephone, String name, String lastName, String ID, String email) {
        super(name, lastName, ID, email);
        this.address = Address;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String direction) {
        this.address = direction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
    
    public void general(){
        System.out.println("Hay 3 clientes asociados a la empresa, sus datos son");
    }
    
    public void clientes(){
        System.out.println("");
        System.out.println("El cliente " + getName() + " " + getLastName() + " y tiene una dirección en " + getAddress());
    }
    
    
    
    
    
}
