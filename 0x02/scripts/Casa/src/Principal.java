/*
 * Crear dos clases: casa y la clase principal para ejecutar:
 * - Clase casa, cuenta con siete atributos: ciudad, barrio, color, pisos,
 * habitaciones, baños y cocinas, se deben inicializar todos los atributos
 * dentro de la clase, de forma que serán atributos CONSTANTES y sólo se
 * crearán los Getters.
 * - En la clase principal mostrar la información de la casa por medio de los
 * getters.
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        Casa casa = new Casa();
        System.out.println("Datos\n\tCiudad: " + casa.getCiudad() + "\n\tBarrio: " + casa.getBarrio() + "\n\tColor: "
                + casa.getColor() + "\n\tPisos: " + casa.getPisos() + "\n\tHabitaciones: " + casa.getHabitaciones()
                + "\n\tBaños: " + casa.getBanios() + "\n\tCocinas: " + casa.getCocinas());
    }
}
