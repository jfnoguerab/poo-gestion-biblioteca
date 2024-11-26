package models;

public class Revista extends ItemBiblioteca implements Catalogable {

    private Integer nroEdicion;
    private Integer cantidadEjemplares;
    private String nombre;

    
    public Revista() {
    }

    
    public Revista(Integer nroEdicion, Integer cantidadEjemplares, String nombre) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombre = nombre;
    }

    

    public Integer getNroEdicion() {
        return nroEdicion;
    }


    public void setNroEdicion(Integer nroEdicion) {
        this.nroEdicion = nroEdicion;
    }


    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }


    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void prestar() {
        if (cantidadEjemplares <= 0) {
            System.out.println("No se pueden prestar más revistas.\n");
            return;
        }

        cantidadEjemplares--;
        System.out.println("La revista \""+this.nombre+"\" se prestó existosamente.\n");
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("La revista \""+this.nombre+"\" se devolvió existosamente.\n");
    }

    @Override
    public Double calcularMultas() {
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("-------");
        System.out.println("Revista: " + this.nombre);
        System.out.println("Número de edición: " + this.nroEdicion);
        System.out.println("Cantidad de ejemplares: " + this.cantidadEjemplares);
        System.out.println("-------\n");
    }

}
