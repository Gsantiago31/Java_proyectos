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
public class ClsCompany {
    private String name;
    private String NIT;
    private String address;

    public ClsCompany(String name, String NIT, String address) {
        this.name = name;
        this.NIT = NIT;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    public void Create() {
        System.out.println();
    }
    public void Read() {
        System.out.println();
    }
    public void Update() {
        System.out.println();
    }
    public void Delete() {
        System.out.println();
    }
    public void Empleados() {
        System.out.println();
    }
    
    
}
