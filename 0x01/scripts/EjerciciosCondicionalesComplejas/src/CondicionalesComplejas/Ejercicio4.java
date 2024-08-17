/*
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo
 * la siguiente información: cantidad total de preguntas que se le realizaron y
 * la cantidad de preguntas que contestó correctamente.
 * Desarrolle un programa que informe el nivel según el porcentaje de
 * respuestas correctas que ha obtenido, y sabiendo que:
 * 1. Nivel máximo: Porcentaje >= 90%.
 * 2. Nivel medio: Porcentaje >= 75% y <90%.
 * 3. Nivel regular: Porcentaje >= 50% y <75%.
 * 4. Fuera de nivel: Porcentaje < 50%.
 */
package CondicionalesComplejas;

public class Ejercicio4 {
  public static void main(String[] args) {
    final int percentage = 90;
    // final int percentage = 80;
    // final int percentage = 60;
    // final int percentage = 49;
    String level = "";
    if (percentage >= 50) {
      if (percentage < 75) {
        level = "Nivel regular";
      } else if (percentage < 90) {
        level = "Nivel medio";
      } else {
        level = "Nivel máximo";
      }
    } else {
      level = "Fuera de nivel";
    }
    System.out.println(percentage + "% : " + level);
  }
}
