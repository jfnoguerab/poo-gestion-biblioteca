import models.Revista;

public class Application {
    public static void main(String[] args) {
        Revista[] revistas = new Revista[3];
        revistas[0] = new Revista(1, 10, "NatGeo Colombia");
        revistas[1] = new Revista(50, 2, "NatGeo Argentina");
        revistas[2] = new Revista(25, 5, "NatGeo USA");

        for (Revista revista : revistas) {
            revista.obtenerInformacion();
        }

        // Prestamos dos ejemplares de la revista "NatGeo Argentina"
        revistas[1].prestar(); // Válido
        revistas[1].prestar(); // Válido
        revistas[1].prestar(); // Inválido
        
        // Imprimimos el resultado de la revista "NatGeo Argentina"
        revistas[1].obtenerInformacion();
        
        // Regresamos ejemplares de la revista "NatGeo Argentina"
        revistas[1].devolver();
        revistas[1].devolver();
        revistas[1].devolver();

        // Imprimimos el resultado de la revista "NatGeo Argentina"
        revistas[1].obtenerInformacion();
    }
}
