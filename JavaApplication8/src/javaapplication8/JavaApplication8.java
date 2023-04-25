/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("eliga una opcion del 1 al 4 ");
        num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2: 
                System.out.println("la bomba es de una bomba de gasolina ");
                break;
            case 3 :
                System.out.println("la bomba es de hormigon");
                break;
            case 4 :
                System.out.println("la bomba es alimenticia");
                break ;
            default :
                System.out.println("No existe un valor válido para tipo de bomba");
                            
        }
                
    }
    
}
