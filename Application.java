import java.util.Arrays;
import java.util.Scanner;

import models.Biblioteca;
import models.Libro;
import models.Persona;
import utils.ConsoleUtility;
import utils.MenuUtility;
public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {
        try {

            Libro libro1 = new Libro("El principito", "Stanly", 95);
            Libro libro2 = new Libro("La ultima pregunta", "Issac Asimov", 105);

            biblioteca.addLibro(libro1);
            biblioteca.addLibro(libro2);

            Persona persona1 = new Persona("John", "Smith");
            biblioteca.addPersona(persona1);

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
                "Mostrar todos los usuarios",
                "Agregar un usuario",
                "Prestar un libro",
                "Devolver un libro",
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
                    mostrarTodosUsuarios();
                    break;
                case 4:
                    agregarUsuario();
                    break;
                case 5:
                    prestarLibro();
                    break;
                case 6:
                    devolverLibro();
                    break;
                case 7:
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
           System.out.println(Arrays.toString(biblioteca.getLibros()));
        } else {
            System.out.println("No hay libros registrados.");
        }

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
    
    private static void agregarLibro() {
        MenuUtility.header("Agregar un libro");

        // Solicitamos los datos
        String titulo = MenuUtility.solicitarCadena(scanner, "Ingrese el título del libro: ");
        String autor = MenuUtility.solicitarCadena(scanner, "Ingrese el autor del libro: ");
        Integer numPaginas = MenuUtility.solicitaNumeroInteger(scanner, "Ingrese el número de páginas: ");

        Libro newLibro = new Libro(titulo, autor, numPaginas);

        // Agregamos el libro a la biblioteca
        biblioteca.addLibro(newLibro);

        System.out.println("\nEl libro \""+newLibro.getTitulo()+"\" se agregó a la biblioteca exitosamente.");

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
    
    
    private static void mostrarTodosUsuarios() {
        MenuUtility.header("Mostrar todos los usuarios");

        // Imprimimos todos los usuarios registrados
        if (biblioteca.hasPersonas()) {
            System.out.println(Arrays.toString(biblioteca.getPersonas()));
        } else {
            System.out.println("No hay usuarios registrados.");
        }

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
    
    private static void agregarUsuario() {
        MenuUtility.header("Agregar un usuario");

        // Solicitamos los datos
        String nombre = MenuUtility.solicitarCadena(scanner, "Ingrese el nombre del usuario: ");
        String apellido = MenuUtility.solicitarCadena(scanner, "Ingrese el apellido del usuario: ");

        Persona newUsuario = new Persona(nombre, apellido);

        // Agregamos el usuario a la biblioteca
        biblioteca.addPersona(newUsuario);

        System.out.println("\nEl usuario \""+newUsuario.getNombre()+" "+newUsuario.getApellido()+"\" se agregó a la biblioteca exitosamente.");

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }

    private static void prestarLibro() {
        MenuUtility.header("Prestar un libro");

        // Imprimimos todos los usuarios registrados
        if (!biblioteca.hasPersonas() || !biblioteca.hasLibros()) {
            System.out.println("No hay usuarios y/o libros registrados.");

            // Pausar la ejecución del programa hasta que presione ENTER
            ConsoleUtility.waitPressEnterKey(scanner);

            return;
        }

        System.out.println("Listado de libros:");
        biblioteca.printListLibros();

        // Solicitamos la selección del libro a asignar
        int indiceLibro = MenuUtility.solicitaNumeroMenu(scanner, "\nIngrese el número del libro correspondiente: ", 1, biblioteca.getLibros().length);


        System.out.println("Listado de usuarios:");
        biblioteca.printListPersonas();

        // Solicitamos la selección del usuario a asignar
        int indiceUsuario = MenuUtility.solicitaNumeroMenu(scanner, "\nIngrese el número del usuario correspondiente: ", 1, biblioteca.getPersonas().length);

        System.out.println("");
        // prestamos el libro al usuarios seleccionado
        biblioteca.prestar(biblioteca.getLibro(indiceLibro - 1), biblioteca.getPersona(indiceUsuario - 1));

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
    private static void devolverLibro() {
        MenuUtility.header("Devolver un libro");

        // Imprimimos todos los usuarios registrados
        if (!biblioteca.hasPersonas() || !biblioteca.hasLibros()) {
            System.out.println("No hay usuarios y/o libros registrados.");

            // Pausar la ejecución del programa hasta que presione ENTER
            ConsoleUtility.waitPressEnterKey(scanner);

            return;
        }

        System.out.println("Listado de libros:");
        biblioteca.printListLibros();

        // Solicitamos la selección del libro a asignar
        int indiceLibro = MenuUtility.solicitaNumeroMenu(scanner, "\nIngrese el número del libro correspondiente: ", 1, biblioteca.getLibros().length);


        System.out.println("Listado de usuarios:");
        biblioteca.printListPersonas();

        // Solicitamos la selección del usuario a asignar
        int indiceUsuario = MenuUtility.solicitaNumeroMenu(scanner, "\nIngrese el número del usuario correspondiente: ", 1, biblioteca.getPersonas().length);

        System.out.println("");

        // Devolvemos el libro al usuarios seleccionado
        biblioteca.devolver(biblioteca.getLibro(indiceLibro - 1), biblioteca.getPersona(indiceUsuario - 1));

        // Pausar la ejecución del programa hasta que presione ENTER
        ConsoleUtility.waitPressEnterKey(scanner);
    }
}
