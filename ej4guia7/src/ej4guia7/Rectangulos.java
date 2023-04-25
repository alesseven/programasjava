/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia7;

/**
 *
 * @author EDUCACION
 */
public class Rectangulos {
    
    private double base;
    private double altura;

    public Rectangulos() {
    }

    public Rectangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearRectangulo(double altura, double base){
        
        this.base = base;
        this.altura = altura;
        
        
    }
    
    public double calcularSuperficie(){
        return this.altura * this.base;
        
    }
    public double calcularPerimetro(){
        return ( this.base + this.altura)*2;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < this.base; i++) {
            System.out.println("");
            for (int j = 0; j < this.altura; j++) {
                System.out.print("*");
                
            }
        }
        System.out.println("");
    }
}
