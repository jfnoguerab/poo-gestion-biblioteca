package models;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] libros = new Libro[1];

    public Biblioteca() {
    }

    

    public Libro[] addLibro(Libro libro) {
        if (libro != null) {
            // Si ya existe algún valor en el arreglo entoces aumentamos en 1 el tamaño
            if (libros != null && libros[0] != null) {
                libros = Arrays.copyOf(libros, libros.length + 1);
            }

            libros[libros.length - 1] = libro;
        }

        return libros;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public boolean hasLibros() {
        return libros != null && libros[0] != null;
    }
}
