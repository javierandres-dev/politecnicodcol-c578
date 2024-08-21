/*
 * Crear dos clases: ciudad y la clase principal para ejecutar.
 * - Clase ciudad, cuenta con cuatro atributos: nombre, población, país,
 * presidente, además de los Getters y Setters con los constructores que creas
 * necesarios.
 * - Inicializar los atributos por medio de los Setters.
 * - En la clase principal mostrar los datos almacenados de la ciudad por medio
 * de los getters.
 */
package Ciudad;

public class Principal {
  public static void main(String[] args) {
    Ciudad ciudad = new Ciudad();
    ciudad.setNombre("Bogotá");
    ciudad.setPoblacion(7929539l);
    ciudad.setPais("Colombia");
    ciudad.setPresidente("Gustavo Petro");
    System.out
        .println("Datos\n\tNombre: " + ciudad.getNombre() + "\n\tPoblación: " + ciudad.getPoblacion() + "\n\tPaís: "
            + ciudad.getPais() + "\n\tPresidente: " + ciudad.getPresidente() + " 🤢");
  }
}
