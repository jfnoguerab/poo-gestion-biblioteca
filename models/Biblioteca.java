package models;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] libros = new Libro[1];
    private Persona[] personas = new Persona[1];

    public Biblioteca() {
    }

    public void prestar(Libro libro, Persona persona) {
        // Validamos que existan libros
        if (hasLibros() && hasPersonas() && libro != null && persona != null) {
            // Buscamos el libro en el arreglo de libros
            Integer indexLibro = existElement(libro);
            if (indexLibro != null) {
                // Buscamos la persona en el arreglo de personas
                Integer indexPersona = existElement(persona);
                if (indexPersona != null) {
                    if (!libros[indexLibro].isPrestado()) {
                        libros[indexLibro].prestar();
                        personas[indexPersona].addLibroPrestado(libros[indexLibro]);
                        System.out.println("El libro se presto satisfactoriamente.");
                    } else {
                        System.out.println("Lo sentimos, el libro \""+libros[indexLibro].getTitulo()+"\" se encuentra prestado.");
                    }
                }
            }
        }

    }
    
    public void devolver(Libro libro, Persona persona) {
        // Validamos que existan libros y personas
        if (hasLibros() && hasPersonas() && libro != null && persona != null) {
            // Buscamos el libro en el arreglo de libros
            Integer indexLibro = existElement(libro);
            if (indexLibro != null) {
                // Buscamos la persona en el arreglo de personas
                Integer indexPersona = existElement(persona);
                if (indexPersona != null) {
                    // Validamos que el ususario sea el mismo que tenia prestado el libro
                    if (personas[indexPersona].existElement(libro) != null) {
                        if (libros[indexLibro].isPrestado()) {
                            libros[indexLibro].devolver();
                            personas[indexPersona].removeLibroPrestado(libros[indexLibro]);
                            System.out.println("El libro se devolvió satisfactoriamente.");
                        } else {
                            System.out.println("Lo sentimos, el libro \""+libros[indexLibro].getTitulo()+"\" no se encuentra prestado.");
                        }
                    } else {
                        System.out.println("Lo sentimos, La persona no tiene el libro prestado.");
                    }
                }
            }
        }

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

    // Busca un libro dentro del arreglo de libros
    // y devuelve el indice, sino existe devuelve null
    public Integer existElement(Libro libro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].equalsIgnoreCase(libro)) {
                return i;
            }
        }
        return null;
    }
    // Busca una persona dentro del arreglo de personas
    // y devuelve el indice, sino existe devuelve null
    public Integer existElement(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equalsIgnoreCase(persona)) {
                return i;
            }
        }
        return null;
    }
    
    public Persona[] addPersona(Persona persona) {
        if (persona != null) {
            // Si ya existe algún valor en el arreglo entoces aumentamos en 1 el tamaño
            if (personas != null && personas[0] != null) {
                personas = Arrays.copyOf(personas, personas.length + 1);
            }

            personas[personas.length - 1] = persona;
        }

        return personas;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public boolean hasPersonas() {
        return personas != null && personas[0] != null;
    }

    public void printListLibros() {
        if (hasLibros()) {
            for (int i = 0; i < libros.length; i++) {
                System.out.println((i+1) + ". "+libros[i].getTitulo());
            }
        }
    }
    
    public void printListPersonas() {
        if (hasPersonas()) {
            for (int i = 0; i < personas.length; i++) {
                System.out.println((i+1) + ". "+personas[i].getNombre()+" "+personas[i].getApellido());
            }
        }
    }

    public Libro getLibro(int indice) {
        return libros[indice];
    }
    public Persona getPersona(int indice) {
        return personas[indice];
    }
}
