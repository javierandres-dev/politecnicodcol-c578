/*
 * Replique el ejercicio anterior (CASA) y por medio constructores inicializar
 * los atributos:
 * - Primer constructor: recibe: la ciudad, el barrio y el color.
 * - Segundo constructor: recibe: el barrio, el color y los pisos.
 * - Tercer constructor: recibe: los pisos, las habitaciones, los baños y las
 * cocinas.
 * - En la clase principal mostrar la información de la casa generada por cada
 * constructor por medio de los getters, para esto deberás crear 3 objetos
 * diferentes en la clase principal para representar cada constructor.
 */
public class House {
  private String ciudad;
  private String barrio;
  private String color;
  private int pisos;
  private int habitaciones;
  private int banios;
  private int cocinas;

  public House(String ciudad, String barrio, String color) {
    this.ciudad = ciudad;
    this.barrio = barrio;
    this.color = color;
  }

  public House(String barrio, String color, int pisos) {
    this.barrio = barrio;
    this.color = color;
    this.pisos = pisos;
  }

  public House(int pisos, int habitaciones, int banios, int cocinas) {
    this.pisos = pisos;
    this.habitaciones = habitaciones;
    this.banios = banios;
    this.cocinas = cocinas;
  }

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
