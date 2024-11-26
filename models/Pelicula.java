package models;

public class Pelicula extends ItemBiblioteca implements Catalogable {

    private String nombre;
    private String genero;
    private Integer cantidadEjemplares;


    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, Integer cantidadEjemplares) {
        this.nombre = nombre;
        this.genero = genero;
        this.cantidadEjemplares = cantidadEjemplares;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares <= 0) {
            System.out.println("No se pueden prestar más películas.\n");
            return;
        }

        cantidadEjemplares--;
        System.out.println("La película \""+this.nombre+"\" se prestó existosamente.\n");
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("La película \""+this.nombre+"\" se devolvió existosamente.\n");
    }

    @Override
    public Double calcularMultas() {
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("-------");
        System.out.println("Película: " + this.nombre);
        System.out.println("Género: " + this.genero);
        System.out.println("Cantidad de ejemplares: " + this.cantidadEjemplares);
        System.out.println("-------\n");
    }

}
