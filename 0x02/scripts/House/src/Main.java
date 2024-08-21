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
public class Main {
    public static void main(String[] args) throws Exception {
        House house1 = new House("Bogotá", "San Javier", "Blanco");
        House house2 = new House("Salitre", "Gris", 3);
        House house3 = new House(2, 3, 4, 1);

        System.out.println(
                "Datos Casa 1\n\tCiudad: " + house1.getCiudad() + "\n\tBarrio: " + house1.getBarrio() + "\n\tColor: "
                        + house1.getColor() + "\n\tPisos: " + house1.getPisos() + "\n\tHabitaciones: "
                        + house1.getHabitaciones()
                        + "\n\tBaños: " + house1.getBanios() + "\n\tCocinas: " + house1.getCocinas());

        System.out
                .println("\n\nDatos Casa 2\n\tCiudad: " + house2.getCiudad() + "\n\tBarrio: " + house2.getBarrio()
                        + "\n\tColor: "
                        + house2.getColor() + "\n\tPisos: " + house2.getPisos() + "\n\tHabitaciones: "
                        + house2.getHabitaciones()
                        + "\n\tBaños: " + house2.getBanios() + "\n\tCocinas: " + house2.getCocinas());

        System.out.println(
                "\n\nDatos Casa 3\n\tCiudad: " + house3.getCiudad() + "\n\tBarrio: " + house3.getBarrio()
                        + "\n\tColor: "
                        + house3.getColor() + "\n\tPisos: " + house3.getPisos() + "\n\tHabitaciones: "
                        + house3.getHabitaciones()
                        + "\n\tBaños: " + house3.getBanios() + "\n\tCocinas: " + house3.getCocinas());
    }
}
