/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Brenda
 */
public class PruebaLibros {

    public static void main(String[] args) {

        Libro l1 = new Libro("Alice in Wonderland", "Lewis Carroll | Free Boo", 320, 8);
        Libro l2 = new Libro("El método Lean Startup", "Eric Ries", 700, 7);

        ConjuntoLibros libros = new ConjuntoLibros();
        libros.añadirLibro(l1);
        libros.añadirLibro(l2);
        System.out.println(libros.toString());

        System.out.println(libros.mayorCalificacion());
        System.out.println(libros.menorCalificacion());

        l2.setCalificacion(8);

        Libro l3 = new Libro("Alice in Wonderland", "Lewis Carroll | Free Boo", 320, 8);
        libros.añadirLibro(l3);
        System.out.println(libros.toString());

    }
}
