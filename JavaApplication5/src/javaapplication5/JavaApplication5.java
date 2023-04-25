/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * 
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sd = new Scanner(System.in);
        float grados;
        float celcius;
        System.out.println("ingrese los grados ");
        grados = sd.nextFloat();
        celcius = 32 + (9 * grados / 5);
        System.out.println(celcius);
        
    }
    
}
