/*
 * Desarrollar un programa que por medio de un vector de tipo float permita
 * almacenar el peso de 5 personas para posteriormente:
 * - Determinar el promedio del peso de las 5 personas.
 * - Determinar cuántas personas superar el promedio del peso.
 * - Determinar cuántas personas son inferiores al promedio del peso.
 */
package Vectores;

public class Ejercicio1 {
  public static void main(String[] args) {
    final float[] weightsPeople = { 72.1f, 74.0f, 69.9f, 56.8f, 61.7f };
    float sum = 0;
    for (int i = 0; i < weightsPeople.length; i++)
      sum += weightsPeople[i];
    float average = sum / weightsPeople.length;
    int aboveAverage = 0;
    int belowAverage = 0;
    for (int i = 0; i < weightsPeople.length; i++) {
      if (weightsPeople[i] > average)
        aboveAverage++;
      else
        belowAverage++;
    }
    System.out.println("El promedio del peso es: " + average + "\n" + aboveAverage
        + " personas superan el promedio del peso\n" + belowAverage
        + " personas son inferiores al promedio del peso");
  }
}
