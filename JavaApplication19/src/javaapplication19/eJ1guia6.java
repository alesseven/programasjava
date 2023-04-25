/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author EDUCACION
 */
public class eJ1guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      
        Libro l1 = new Libro();
        System.out.println("ingrese el ISBN ");
        l1.ISBN = leer.next();
        leer.nextLine();
        System.out.println("ingrese el titulo ");
        l1.Título = leer.nextLine();
          System.out.println("ingrese el autor del libro ");
        l1.Autor = leer.nextLine();
          System.out.println("ingrese el numero de pagina ");
        l1.Númeropáginas = leer.nextInt();
        
        System.out.println(" ISBN: "+ l1.ISBN+ " titulo "+ l1.Título + " autor "+l1.Autor+" num pagina "+l1.Númeropáginas);
    }
   
}
