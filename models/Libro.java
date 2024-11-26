package models;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }


    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prestar'");
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolver'");
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

}
