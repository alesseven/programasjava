/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int num1;
int num2;
int num3 = 25;
Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros ");
        num1= leer.nextByte();
        num2= leer.nextByte();
        if (num1>=num3){ 
            System.out.println(num1);
        } else if(num2>=num3) { 
            System.out.println(num2);
        }else {
            System.out.println("ninguno de los numeros es mayor a 25 ");
        }
        
    }
    }
    

