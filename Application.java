import java.util.Scanner;

import models.Biblioteca;
import models.Libro;
import utils.ConsoleUtility;
import utils.MenuUtility;
public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {
        try {

            mainMenu();

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void mainMenu() throws Exception {
        boolean showMenu = true;
        int opMenuUsu = 0;

        do {

            // Limpia la consola
            ConsoleUtility.cleanScreen();

            MenuUtility.header("Gestión de biblioteca");

            // Menu
            String[] menu = {
                "Mostrar todos los libros",
                "Agregar un libro",
                "Salir"
            };

            // Muestra el menú y devuelve la opción válida ingresada por el usuario que este dentro del rango del menú
            opMenuUsu = MenuUtility.createMenuAndGetOption(scanner, menu, "\nIngrese el número de la opción correspondiente: ");

            // Limpia la consola
            ConsoleUtility.cleanScreen();

            // Opciones del menú
            switch (opMenuUsu) {
                case 1:
                    mostrarTodosLibros();
                    break;
                case 2:
                    agregarLibro();
                    break;
                case 3:
                    showMenu = MenuUtility.exit();
                    break;
            }

            // Limpia la consola
            ConsoleUtility.cleanScreen();
            
        } while (showMenu);

    }

    private static void mostrarTodosLibros() {
        MenuUtility.header("Mostrar todos los libros");
        // Imprimimos todos los empleados registrados

        if (biblioteca.hasLibros()) {
            for (Libro libro : biblioteca.getLibros()) {
                libro.obtenerInformacion();
            }
        } else {
            System.out.println("No hay libros registrados.");
        }

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
    
    private static void agregarLibro() {
        MenuUtility.header("Agregar un libro");
        // Imprimimos todos los empleados registrados

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
}
