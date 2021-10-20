/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par_impar;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        
        System.out.print("Introduzca el número a evaluar ");
        numero = sc.nextInt();
        if (numero%2==0)        {
        System.out.println("El número es Par");
                                }
        else
        {
            System.out.println("El número es impar");
        }
    }
    
}
