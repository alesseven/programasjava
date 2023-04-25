/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class JavaApplication15 {

 public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int N= leer.nextInt();  
       int respuesta;
       int []vector = new int[N];
        for (int i = 0; i < N; i++) {
         int nros = (int) (Math.random()*10); 
         vector[i]= nros;      
        } 
        System.out.println("ingrese el nro del vector");
        respuesta= leer.nextInt();
        boolean encontrado = false;
        int posicion=-1;
        for (int i = 0; i < N; i++) {
           if (vector[i]==respuesta){
               if (encontrado){
                   System.out.println("el nro esta repetido en las posiciones "+ posicion+" y "+i);
               }else{    
                   System.out.println("el nro se encuentra en la posicion" +i);
               }
               encontrado= true;
               posicion=i;  
           }     
        }
        if (!encontrado){
            System.out.println("el nro no se encuentra");
        }
    }  
}