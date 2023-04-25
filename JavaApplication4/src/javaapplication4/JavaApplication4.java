/*
 *Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas.
 investigar la función toUpperCase() y toLowerCase() en Java
/*

*/
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String cadena1 ;
        System.out.println("ingrese una frase ") ;
        cadena1 = leer.nextLine();
        System.out.println (cadena1.toUpperCase());
        System.out.println(cadena1.toLowerCase());
               
              
    }
    
}
