/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras1guia7;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class Ejerciciosextras1guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        c1.crearCancion();
        System.out.println("el nombre de la cancion es :"+ c1.titulo+" y el autor es : "+c1.autor);
        System.out.println("");
    }
    
}
