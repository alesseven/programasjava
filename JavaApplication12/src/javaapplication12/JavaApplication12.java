/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase ");
   	String respuesta;
        respuesta= leer.next();
  	
   	if (respuesta.equals("eureka")) {
            System.out.println("correcto");
      	 
        }else {
            
    	       System.out.println("incorrecto");
   	   }
   }
    }
    

