/*
 * Desarrollar un programa que permita por medio de la edad de una persona,
 * determinar la categoría en la que pertenece a raíz de la siguiente tabla:
 * Rango de edad - Categoría
 * • 0 - 5 Infante
 * • 6 - 10 Niño
 * • 11 - 15 Pre adolescente
 * • 16 - 18 Adolescente
 * • 19 - 25 Pre adulto
 * • 26 - 40 Adulto
 * • 41 - 55 Pre anciano
 * • 56+ Anciano
 * Recuerda tener presente:
 * - Condicionales anidadas.
 * - Tabla de verdades.
 * - Tabla de operadores lógicos.
 */
package CondicionalesComplejas;

public class Ejercicio1 {
  public static void main(String[] args) {
    // final int age = 4;
    // final int age = 8;
    // final int age = 12;
    // final int age = 16;
    // final int age = 20;
    // final int age = 28;
    // final int age = 48;
    // final int age = 55;
    final int age = 56;
    String category;
    if (age <= 18) {
      if (age <= 5) {
        category = "Infante";
      } else if (age > 5 && age <= 10) {
        category = "Niño";
      } else if (age > 10 && age <= 15) {
        category = "Pre adolecente";
      } else {
        category = "Adolecente";
      }
    } else {
      if (age < 56) {
        if (age <= 25) {
          category = "Pre adulto";
        } else if (age > 25 && age <= 40) {
          category = "Adulto";
        } else {
          category = "Pre anciano";
        }
      } else {
        category = "Anciano";
      }
    }
    System.out.println("Edad: " + age + "\nCategría: " + category);
  }
}
