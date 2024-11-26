## POO (nivel avanzado): Actividad integradora

### Actividad - Gestión de biblioteca:

En esta actividad, se requiere el diseño de un sistema de gestión de biblioteca que emplee clases abstractas e interfaces para representar libros, revistas y películas. Para lograrlo, sigue estos pasos:

* Diseña una clase abstracta `ItemBiblioteca` que contenga métodos abstractos como `prestar()`, `devolver()` y `calcularMultas()`.

* Crea las clases concretas `Libro`, `Revista` y `Película`, las cuales deben extender la clase `ItemBiblioteca` y proporcionar implementaciones concretas de los métodos.

* Desarrolla una interfaz llamada `Catalogable` con métodos para obtener información sobre el elemento bibliotecario llamado `obtenerInformacion`. Luego, asegúrate de que todas las clases implementen esta interfaz.

* **Clase Revista:**
    * Incorpora los atributos `nroEdicion`, `cantidadEjemplares`, `nombreRevista`. Recuerda crear constructores, getters y setters.

    * Ajuste método `prestar()`: Este método, restará en 1 la `cantidadEjemplares`. Tener en cuenta que **NO** se puede prestar revistas cuyo stock sea cero.

    * Ajuste método `devolver()`: Este método, aumentará en 1 la `cantidadEjemplares`.

    * Ajuste método `obtenerInformacion()`: Este método, deberá imprimir la información de TODOS los atributos de la clase.

Crea un arreglo en tu clase que contiene el método `Main`, con 3 objetos del tipo `Revista` e invoca los métodos para probarlos.

---

### Actividad - Ejercicios Complementarios:

Continuando con la actividad anterior desarrolla:

1. Completando la gestión de clase `Revista`:

    Una implementación concreta del método `calcularMultas()`. Piensa si necesitas incorporar otro atributo a tu clase, como una `fecha` para poder desarrollar una lógica para este cálculo.

2. Completando la gestión de clase `Película`:

    Considerando tu experiencia previa con la gestión de la clase `Revista`, ahora te invito a completar la implementación necesaria para la clase `Película`.

---

### Actividad - Desarrollo funcionalidades - Primera Parte:

Debes ampliar el sistema para poder almacenar libros dentro de la biblioteca. Para esto deberás:

* Agregar los atributos `titulo`, `autor` y `numeroDePaginas` a la clase `Libro`. Además, implementa un método `mostrarInformación()` que muestre la información del libro en consola. En este caso, solo hay 1  ejemplar por título, por lo que no debe existir un atributo que controle la cantidad de ejemplares.

* Crea la clase `Biblioteca` que contenga un arreglo de objetos `Libro` para mantener un catálogo de libros disponibles en la biblioteca. La biblioteca también debe tener un método para agregar libros al catálogo.

* Crear una instancia de la clase Biblioteca y agregar varios libros al catálogo.

Implementa un menú por consola que permite al usuario agregar libros a la biblioteca y mostrar la información de los libros en el catálogo.


---

© 2024 | Desarrollado por [Fernando Noguera](https://www.linkedin.com/in/jfnoguerab/)