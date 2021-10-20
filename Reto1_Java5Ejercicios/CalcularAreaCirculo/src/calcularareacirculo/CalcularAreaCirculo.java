/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareacirculo;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class CalcularAreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Ingresa el valor del radio de un círculo ");
        radio = sc.nextInt();
        double area = (Math.pow(radio,2)*Math.PI);
        System.out.println("El área del círculo es: " + area);
        System.out.println();
        
        // Otra forma de escribir el código sería de la siguiente manera
        double area2 = Math.PI * Math.pow(radio,2);
        System.out.println("El área del círculo es: " + area2);
    }
    
}
