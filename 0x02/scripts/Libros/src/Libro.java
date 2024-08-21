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
public class Libro {
  private String autor;
  private String titulo;
  private int paginas;

  public Libro(String autor, String titulo, int paginas) {
    this.autor = autor;
    this.titulo = titulo;
    this.paginas = paginas;
  }

  public void mostrarLibro(Libro libro) {
    System.out
        .println("El libro " + libro.titulo + ", del autor " + libro.autor + ", tiene " + libro.paginas
            + " páginas");
  }

  public void compararLibros(Libro l1, Libro l2) {
    if (l1.getPaginas() > l2.getPaginas()) {
      System.out.println(l1.getTitulo() + " tiene más páginas que " + l2.getTitulo());
    } else {
      System.out.println(l2.getTitulo() + " tiene más páginas que " + l2.getTitulo());
    }
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }
}
