/*Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma

 */
package javaejercio1;

import java.util.Scanner;

public class Javaejercio1 {

   
    public static void main(String[] args) {
        
    
     Scanner leer = new Scanner(System.in);
      int suma;
       int num1 = 0;
        int num2 = 0;
      System.out.println("ingrese los numeros ");
      num1 = leer.nextByte();
       num2 = leer.nextByte();
      suma = num1 + num2;
      
        System.out.println("la suma de los numeros es " + suma);
        
     
     
    }
}


    