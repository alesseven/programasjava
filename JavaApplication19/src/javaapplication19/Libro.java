/*
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package javaapplication19;

/**
 *
 * @author EDUCACION
 */
public class Libro {
    public String ISBN;
    public String Título;
    public String Autor;
    public int Númeropáginas;
    
    
    public Libro(){
        
        
    }

    public Libro(String ISBN, String Título, String Autor, int Númeropáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Númeropáginas = Númeropáginas;
    }
}
