/*
 * Escribir un programa que lea un número entero por teclado y
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero entero ");
        num1 = num.nextByte();
        doble(num1);
        triple(num1);
    }
    static void doble(int num) {
        int doble;
        doble= 2* num;
        System.out.println("el doble del numero es " + doble);
    }
    static void triple(int num) {
        int triple;
        triple = 3*num;
        System.out.println("el triple del numero es de " + triple );
    }
    
}
    

