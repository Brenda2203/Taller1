/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Arrays;

/**
 *
 * @author Brenda
 */
public class ConjuntoLibros {

    private Libro[] libros;

    public ConjuntoLibros() {
        this.libros = new Libro[10];
        for (int i = 0; i < 10; i++) {
            libros[i] = null;
        }
    }

    public void añadirLibro(Libro a) {
        boolean existe = true;
        for (int i = 0; i < 10; i++) {
            if (libros[i] != null) {
                if (a.getTitulo().equals(libros[i].getTitulo()) && a.getAutor().equals(libros[i].getAutor())) {
                    System.out.println("No es posible añadir el libro");
                    existe = false;
                    break;
                }
            }
        }
        if (existe) {
            for (int i = 0; i < 10; i++) {
                if (libros[i] == null) {
                    libros[i] = a;
                    break;
                }
            }
        }
    }

    public Libro mayorCalificacion() {
        int mayor = -999999;
        Libro libro = null;
        for (int i = 0; i < 10; i++) {
            if (libros[i] != null) {
                if (this.libros[i].getCalificacion() > mayor) {
                    mayor = this.libros[i].getCalificacion();
                    libro = this.libros[i];
                }
            }
        }

        return libro;
    }

    public Libro menorCalificacion() {
        int menor = 999999;
        Libro libro = null;
        for (int i = 0; i < 10; i++) {
            if (libros[i] != null) {
                if (this.libros[i].getCalificacion() < menor) {
                    menor = this.libros[i].getCalificacion();
                    libro = this.libros[i];
                }
            }
        }
        return libro;
    }

    @Override
    public String toString() {
        return "ConjuntoLibros{" + "libros=" + Arrays.toString(libros) + '}';
    }

}
