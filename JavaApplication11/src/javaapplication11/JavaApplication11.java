/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication11 {

 

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num = 0;
        num= leer.nextInt();
        if (esPar(num)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }

}
   
    
