/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3gui7;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class operacion {
    private double num1;
    private double num2;

    public operacion() {
    }

    public operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese numero 1 ");
        this.num1=leer.nextDouble();
        System.out.println("ingrese el numero 2 ");
        this.num2 = leer.nextDouble();
        
    }
            
    /*Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    */
    public double sumar(){
        return this.num1 + this.num2;
    }
     public double resta(){
        return this.num1 - this.num2;
}
      public double multiplicar(){
          if(this.num1==0 || this.num2==0){
              System.out.println("error");
              return 0;
          } 
          else{
              
         return this.num1 * this.num2;
          }
          }
       public double division(){
          if(this.num1==0 || this.num2==0){
              System.out.println("error");
              return 0;
          } 
          else{
              
         return this.num1 % this.num2;
          }
       }
}
