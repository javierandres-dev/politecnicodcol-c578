/*
 * Crear dos clases: casa y la clase principal para ejecutar:
 * - Clase casa, cuenta con siete atributos: ciudad, barrio, color, pisos,
 * habitaciones, baños y cocinas, se deben inicializar todos los atributos
 * dentro de la clase, de forma que serán atributos CONSTANTES y sólo se
 * crearán los Getters.
 * - En la clase principal mostrar la información de la casa por medio de los
 * getters.
 */
public class Casa {
  final private String ciudad = "Bogotá";
  final private String barrio = "San Javier";
  final private String color = "Blanco";
  final private int pisos = 5;
  final private int habitaciones = 16;
  final private int banios = 10;
  final private int cocinas = 6;

  public String getCiudad() {
    return ciudad;
  }

  public String getBarrio() {
    return barrio;
  }

  public String getColor() {
    return color;
  }

  public int getPisos() {
    return pisos;
  }

  public int getHabitaciones() {
    return habitaciones;
  }

  public int getBanios() {
    return banios;
  }

  public int getCocinas() {
    return cocinas;
  }
}
