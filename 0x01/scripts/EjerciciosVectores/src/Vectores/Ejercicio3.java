/*
 * Desarrollar un programa que, dada una palabra, divida todos sus caracteres
 * y los almacene en las posiciones de un vector del tamaño de
 * la palabra, por ejemplo:
 * - “Colombia”, tiene 8 palabras, por ende, el vector debe ser de tamaño 8
 * para almacenar cada carácter.
 */
package Vectores;

import java.util.Arrays;

public class Ejercicio3 {
  public static void main(String[] args) {
    final String word = "Colombia";
    final char[] vector = new char[word.length()];
    for (int i = 0; i < vector.length; i++)
      vector[i] = word.charAt(i);
    System.out.println(Arrays.toString(vector));
  }
}
