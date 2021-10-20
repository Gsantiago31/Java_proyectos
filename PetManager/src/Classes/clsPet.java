/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.*;

/**
 *
 * @author USUARIO
 */
public class clsPet implements IAnimal, IVertebrate {
    private String code;
    private String name;
    private int bornYear;
    private String color;
    private String healthStatus;
    private clsVeterinary veterinary;

    public clsPet(String code, String name, int born_year, String color, String health_status) {
        this.code = code;
        this.name = name;
        this.bornYear = born_year;
        this.color = color;
        this.healthStatus = health_status;
    }
    
    
    public void Eat(){
        System.out.println("La mascota " + this.name + " está comiendo.");
    }
    
    public void Move(){
        System.out.println("La mascota " + this.name + " está moviéndose.");
    }
    
    
    public void Sound(){
        System.out.println("La mascota " + this.name + " está relaizando el sonido.");
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bornYear
     */
    public int getBornYear() {
        return bornYear;
    }

    /**
     * @param bornYear the bornYear to set
     */
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the healthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return the veterinary
     */
    public clsVeterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(clsVeterinary veterinary) {
        this.veterinary = veterinary;
    }

    @Override
    public String getAnimalType() {
        return "doméstico";
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }
}
