/*
 * Dado un número entero, determinar por medio de un condicional si es
 * negativo o no (Menor a cero).
 */
package CondicionalesSimples;

public class Ejercicio3 {
  public static void main(String[] args) {
    final int num = -1;
    if (num < 0) {
      System.out.println(num + " es un número negativo");
    } else {
      System.out.println(num + " no es un número negativo");
    }
  }
}
