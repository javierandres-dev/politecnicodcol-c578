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

public class Ciudad {
  private String nombre;
  private long poblacion;
  private String pais;
  private String presidente;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public long getPoblacion() {
    return poblacion;
  }

  public void setPoblacion(long poblacion) {
    this.poblacion = poblacion;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getPresidente() {
    return presidente;
  }

  public void setPresidente(String presidente) {
    this.presidente = presidente;
  }

}
