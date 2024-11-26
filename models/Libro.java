package models;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean prestado;

    public Libro() {
    }


    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado = false;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }


    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }


    @Override
    public void prestar() {
        // Validamos si el libro se encuentra prestado
        if (isPrestado()){
            System.out.println("Lo sentimos, el libro \""+titulo+"\" se encuentra prestado.");
            return;
        }
        
        // Cambiamos el estado de la variable "prestado"
        setPrestado(true);
    }

    @Override
    public void devolver() {
        // Validamos si el libro no se encuentra prestado
        if (!isPrestado()) {
            System.out.println("Lo sentimos, el libro \""+titulo+"\" no se encuentra prestado.");
            return;
        }
        // Cambiamos el estado de la variable "prestado"
        setPrestado(false);
    }

    @Override
    public Double calcularMultas() {
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("-------");
        System.out.println("Libro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroDePaginas);
        System.out.println("-------\n");
    }


    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + numeroDePaginas;
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
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (numeroDePaginas != other.numeroDePaginas)
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
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equalsIgnoreCase(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equalsIgnoreCase(other.autor))
            return false;
        if (numeroDePaginas != other.numeroDePaginas)
            return false;
        return true;
    }

}
