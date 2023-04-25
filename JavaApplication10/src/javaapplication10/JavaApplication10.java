/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       long num=0 ;
       while (num>=0 & num<=10) {
           System.out.println("ingrese un numero");
           num= leer.nextInt();
           
       }
    }
    
}
