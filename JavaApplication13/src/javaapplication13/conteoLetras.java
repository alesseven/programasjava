/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Lenght() en Java.

 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class conteoLetras {

  

    public static int contarletras(String palabra){
        int numletras= 0;
        for (int i = 0; i < palabra.length(); i++) {
            numletras++;
            
        }
       return numletras; 
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        String palabra;
        int resultado;
        System.out.println("ingrese una frase ");
        palabra = leer.next();
        resultado = contarletras(palabra);
        if ( resultado <= 8){
           System.out.println(contarletras(palabra)+ "correcto"); 
        } else  System.out.println("incorrecto");
        
            
          
            
            
        }
            }
            
        
        
        
        
    


        
    
    

