/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia7;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class Ej4guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulos rec = new Rectangulos();
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la base de rectangulo" );
       rec.crearRectangulo(leer.nextDouble(), leer.nextDouble());
        System.out.println("el perimetro es de :"+ rec.calcularPerimetro());
        System.out.println("la superficie es de : "+ rec.calcularSuperficie());
        rec.dibujarRectangulo();
    }
    
    
}
