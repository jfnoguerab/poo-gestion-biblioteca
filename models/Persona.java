package models;

import java.util.Arrays;

public class Persona {
    private String nombre;
    private String apellido;
    private Libro[] librosPrestados = new Libro[1];
    
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean hasLibrosPrestados() {
        return librosPrestados != null && librosPrestados[0] != null;
    }

    public Libro[] addLibroPrestado(Libro libro) {
        if (libro != null) {
            // Si ya existe algún valor en el arreglo entoces aumentamos en 1 el tamaño
            if (librosPrestados != null && librosPrestados[0] != null) {
                librosPrestados = Arrays.copyOf(librosPrestados, librosPrestados.length + 1);
            }

            librosPrestados[librosPrestados.length - 1] = libro;
        }

        return librosPrestados;
    }
    
    public Libro[] removeLibroPrestado(Libro libro) {
        if (libro != null && hasLibrosPrestados()) {
            Integer indexLibro = existElement(libro);
            if (indexLibro != null) {
                int newSizeLibros = librosPrestados.length - 1;
                if (newSizeLibros == 0) {
                    return new Libro[1];
                }
                Libro[] newLibros = new Libro[newSizeLibros];
                for (int i = 0, j = 0; i < librosPrestados.length; i++) {
                    if (i != indexLibro) {
                        newLibros[j] =  librosPrestados[i];
                        j++;
                    }
                }
                return newLibros;
            }
        }

        return librosPrestados;
    }

    // Busca un libro dentro del arreglo de libros
    // y devuelve el indice, sino existe devuelve null
    public Integer existElement(Libro libro) {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i].equalsIgnoreCase(libro)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        return true;
    }

    public boolean equalsIgnoreCase(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equalsIgnoreCase(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equalsIgnoreCase(other.apellido))
            return false;
        return true;
    }

    

    
}
