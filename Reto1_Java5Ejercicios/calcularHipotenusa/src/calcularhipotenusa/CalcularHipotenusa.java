/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularhipotenusa;

/**
 *
 * @author gomez
 */
public class CalcularHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cateto1 = 8;
        int cateto2 = 14;
        
        // Forma 1 utilizando Math.hypot(var1, var2)
        System.out.println("El siguiente resultado es el cálculo automático con math.hypot de la hipotenusa de un triángulo rectángulo.");
        System.out.println("La hipotenusa del triángulo es : " + Math.hypot(cateto1, cateto2));
        System.out.println();
        // Forma 2 haciéndolo manualmente
        double hipotenusa = 0;
        
        System.out.println("El siguiente resultado es el cálculo manual de la hipotenusa de un triángulo rectángulo.");
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa del triángulo es : " + hipotenusa);
        System.out.println();
        
        // Forma 3 manualmente pero largo usando Math.pow
        double cateto1_cuadrado = Math.pow(cateto1, 2);
        double cateto2_cuadrado = Math.pow(cateto2, 2);
        double suma_catetos = cateto1_cuadrado + cateto2_cuadrado;
        double hipotenusa3 =  Math.sqrt(suma_catetos);
        System.out.println("El siguiente resultado es el cálculo manual de forma extensa de la hipotenusa de un triángulo rectángulo.");
        System.out.println("La hipotenusa del triángulo es : " + hipotenusa3);
                
    }
    
}
