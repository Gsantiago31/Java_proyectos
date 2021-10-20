/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_3_Empresa;


import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Principal {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        //Utilizando el objeto entrada para obtner lo que el usuario ingrese por consola
        Scanner entrada = new Scanner(System.in);
        //Crear un lista en donde sern almacenados los empleado:
        ArrayList<ClsEmployes> listaEmpleados = new ArrayList<>();
        
        //El while sera ejecutado hasta que salir sea TRUE
        boolean salir = false;
        while(!salir)
   {
        System.out.println(ANSI_BLUE + "INGRESE LA OPCION" + ANSI_RESET);
        System.out.println("1." + ANSI_PURPLE + "Crear Empleado" + ANSI_RESET);
        System.out.println("2." + ANSI_PURPLE + "Listar Empleados" + ANSI_RESET);
        System.out.println("3." + ANSI_PURPLE + "Eliminar Empleado" + ANSI_RESET);
        System.out.println("4." + ANSI_PURPLE + "Modificar Empleado" + ANSI_RESET);
        System.out.println("0." + ANSI_RED + "Salir" + ANSI_RESET);
        
        // Obterner el numero ingresado por el usuario en consola:
        int opcion = Integer.parseInt(entrada.nextLine());
        System.out.println();
        
        //Segun el numero que el usuario digite se ejecutara el switch
        
        switch(opcion )
        {
            //Ingresar nuevo Empleado
            case 1 :
            //Instanciamos la clase Empleado por medio del objeto a    
            ClsEmployes a = new ClsEmployes(); 
            //Ingresar el nombre del Empleado
            System.out.println(ANSI_BLUE + "Ingrese Nombre:" + ANSI_RESET);
            a.setName(entrada.nextLine());
            System.out.println(ANSI_BLUE + "Ingrese Apellido:" + ANSI_RESET);
            a.setLastName(entrada.nextLine());
            System.out.println(ANSI_BLUE + "Ingrese Documento:" + ANSI_RESET);
            a.setID(entrada.nextLine());
            System.out.println(ANSI_BLUE + "Ingrese Correo:" + ANSI_RESET);
            a.setEmail(entrada.nextLine());
            System.out.println();
            
            listaEmpleados.add(a);
            
            System.out.println(" EMPLEADO CREADO");
            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + a.getName());
            System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + a.getLastName());
            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + a.getID());
            System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + a.getEmail());
            System.out.println();
            break;
            
            case 2 : //LIstar los Empleados 
            
            for (int i=0 ; i< listaEmpleados.size();i++)
            {
                System.out.println("Empleado : " + (i + 1));
                //Para obtener un elemento de l alista, utilizamos a get
             
              ClsEmployes empleado = listaEmpleados.get(i);
              System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + empleado.getName());
              System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + empleado.getLastName());
              System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + empleado.getID());
              System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + empleado.getEmail());
              System.out.println();
            }
             System.out.println();
             break;   
            case 3 : //Eliminar empleado
                System.out.println("Ingrese el documento de identidad del Empleado a Eliminar");
                String documento_identidad=entrada.nextLine();
                
                for(int i=0 ; i< listaEmpleados.size();i++)
                {
                ClsEmployes empleado = listaEmpleados.get(i);
                //Buscamos..
                if(documento_identidad.equals(empleado.getID()))
                {
                listaEmpleados.remove(i);
                    System.out.println(ANSI_RED + "Elemento Eliminado" + ANSI_RESET);
                }else{
                    System.out.println(ANSI_RED + "!!ERROR!!" + ANSI_RESET);
                    System.out.println("Documento de identidad inexistente");
                }
             
                }
                System.out.println();
                break;
                
            case 4: //Modificar Empleado
                 System.out.println("Ingrese el documento de identidad del Empleado a Modificar");
                documento_identidad=entrada.nextLine();
                //Vamos a buscar cual de todos los documentos de los empleados coinciden
                //Luego porcederemos a cambiar los datos relacionados en el di.
                for(int i=0 ; i< listaEmpleados.size();i++)
                {
                ClsEmployes empleado = listaEmpleados.get(i);
                //Buscamos..
                if(documento_identidad.equals(empleado.getID()))
                {
                    System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + empleado.getName());
                    System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + empleado.getLastName());
                    System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + empleado.getEmail());
                    System.out.println();
                    System.out.println(ANSI_RED + "A continuación edite los campos anteriores" + ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_BLUE + "Ingrese Nombre:" + ANSI_RESET);
                    String nombre = entrada.nextLine();
                    System.out.println(ANSI_BLUE + "Ingrese Apellido:" + ANSI_RESET);
                    String apellido = entrada.nextLine();
                    System.out.println(ANSI_BLUE + "Ingrese Correo:" + ANSI_RESET);
                    String correo_electronico = entrada.nextLine();
                    
                    empleado.setName(nombre);
                    empleado.setLastName(apellido);
                    empleado.setEmail(correo_electronico);
                    
                    
                }else{
                    System.out.println(ANSI_RED + "!!ERROR!!" + ANSI_RESET);
                    System.out.println("Documento de identidad inexistente");
                }
             
                }
                System.out.println();
                break;
            case 0: //case para salir
                
              salir = true;
                System.out.println(ANSI_RED + "Saliendo del programa" + ANSI_RESET);
                break;
                
            default : //
                System.out.println(ANSI_RED + "Opcion invalidad de nuemero" + ANSI_RESET);
        
        }
        
       
   }
    }
    
}