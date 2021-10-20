/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular_mayor_3;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Calcular_mayor_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n1;
       int n2;
       int n3;
       
       System.out.println("Introduzca el primer numero : ");
       n1 = sc.nextInt();
       System.out.println("Introduzca el segundo numero : ");
       n2 = sc.nextInt();
       System.out.println("Introduzca el tercero numero : ");
       n3 = sc.nextInt();
       
       if (n1>n2)
       {
           if(n1>n3)
           {
           System.out.println("El mayor es : " + n1);
           }
           else
           {
           System.out.println("El mayor es : " + n3);
           }
       }
       else if(n2>n3)
            {
           System.out.println("El número mayor es : " + n2);
            }
       else    
       {
           System.out.println("El mayor es : " + n2);
       }
       
    }
    
}
