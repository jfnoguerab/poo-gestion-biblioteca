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

© 2024 | Desarrollado por [Fernando Noguera](https://www.linkedin.com/in/jfnoguerab/)