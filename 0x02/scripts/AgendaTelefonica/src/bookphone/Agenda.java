package bookphone;

/*
 * Crear tres clases: contacto, agenda y la clase principal para ejecutar ambas:
 * - Clase contacto, cuenta con dos atributos: nombre y número, además de los
 *   métodos Getters y Setters y los constructores que creas necesarios.
 * - Clase agenda, cuenta con un atributo, un vector de tipo contacto
 *   inicializado en 10, con los siguientes métodos:
 * - registrarContacto(), recibe un objeto de tipo contacto.
 * - listarContactos(), lista toda la agenda.
 * - buscarContacto(), recibe el nombre del contacto que desea buscar y muestra
 *   el teléfono.
 * - disponibles(), muestra los contactos disponibles para registrar.
 * - En la clase principal realizar todos los procesos anteriormente diseñados
 *   por los métodos y mostrar los resultados.
 */
public class Agenda {
  private static Contacto[] contactos = new Contacto[10];

  public static void registrarContacto(Contacto contacto) {
    for (int i = 0; i < contactos.length; i++) {
      if (contactos[i] == null) {
        contactos[i] = contacto;
        break;
      }
    }
  }

  public static void listarContactos() {
    int count = 0;
    // System.out.println(Arrays.toString(contactos));
    for (int i = 0; i < contactos.length; i++) {
      if (i == 0) {
        System.out.println("Lista de contactos");
      }
      if (contactos[i] != null) {
        System.out.println(contactos[i].getNombre() + " " + contactos[i].getNumero());
        count++;
      }
    }
    if (count == 0) {
      System.out.println("Agenda vacía, no existen contactos");
    }
  }

  public static void buscarContacto(String nombre) {
    int count = 0;
    for (int i = 0; i < contactos.length; i++) {
      if (i == 0) {
        System.out.println("Buscando contacto...");
      }
      if (contactos[i].getNombre() == nombre) {
        System.out.println(contactos[i].getNombre() + " " + contactos[i].getNumero());
        count++;
      }
    }
    if (count == 0) {
      System.out.println("Nombre de contacto '" + nombre + "' no encontrado");
    }
  }

  public static void disponibles() {
    int count = 0;
    for (int i = 0; i < contactos.length; i++) {
      if (contactos[i] == null) {
        count++;
      }
    }
    System.out.println("- - - - - - - -\nDisponibles: " + count + "\n- - - - - - - -");
  }
}
