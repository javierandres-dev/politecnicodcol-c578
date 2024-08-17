/*
 * Desarrollar un programa que continúe con la serie sumatoria de:
 * 11 – 22 – 33 – 44.
 * Debe mostrar únicamente los primeros 25 valores de la serie.
 */
package CicloWhile;

public class Ejercicio4 {
  public static void main(String[] args) {
    final int base = 11;
    String result = "";
    int sum = 0;
    int count = 0;
    while (count < 25) {
      sum += base;
      final String str = Integer.toString(sum);
      result += (count == 24 ? str + "." : str + " - ");
      count++;
    }
    System.out.println(result);
  }
}
