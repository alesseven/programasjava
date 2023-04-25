/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3gui7;

/**
 *
 * @author EDUCACION
 */
public class Ej3gui7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operacion op = new operacion();
        
        op.crearOperacion();
        System.out.println("la suma es de "+op.sumar());
        System.out.println("la resta es de "+op.resta());
        System.out.println("la multiplicacion es de "+op.multiplicar());
        System.out.println("la division es de "+op.division());
    }
    
}
