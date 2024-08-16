/*
 * Hallar la raíz cuadrada de los siguientes números por medio del método
 * Math.sqrt.
 * - 2, 8, 9, 27, 28, 55, 121.
 * - Mostrar los resultados de cada operación.
 */
package ClaseMath;

public class Ejercicio2 {
  public static void main(String[] args) {
    int[] numbers = { 2, 8, 9, 27, 28, 55, 121 };
    for (int i = 0; i < numbers.length; i++) {
      double squareRoot = Math.sqrt(numbers[i]);
      System.out.println("Raíz cuadrada de " + numbers[i] + " = " + squareRoot);
    }
  }
}
