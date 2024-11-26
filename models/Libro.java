package models;

public class Libro extends ItemBiblioteca implements Catalogable {

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerInformacion'");
    }

}
