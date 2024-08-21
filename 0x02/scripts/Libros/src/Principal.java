/*
 * Crear dos clases: libro y la clase principal para ejecutar.
 * - Clase libro, cuenta con tres atributos: autor, título y páginas, además de
 * los Getters y Setters con los constructores que creas necesarios, y los
 * siguientes métodos.
 * - mostrarLibro(), muestra la información del libro en el siguiente formado:
 * “El libro TITULO, del autor AUTOR, tiene PAGINAS páginas”, por ejemplo: “El
 * libro Cien años de soledad, del autor Gabriel Garcia Marquez, tiene 482
 * páginas”.
 * - compararLibros(), recibe el número de páginas de dos libros, y muestra el
 * título del libro con mayor páginas.
 * - En la clase principal realizar todos los procesos anteriormente diseñados
 * por los métodos y mostrar los resultados.
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Gabriel García Marquez", "Cien años de soledad", 482);
        libro1.mostrarLibro(libro1);

        Libro libro2 = new Libro("Laura Restrepo", "Delirio", 303);
        libro2.mostrarLibro(libro2);

        libro1.compararLibros(libro1, libro2);
    }
}
