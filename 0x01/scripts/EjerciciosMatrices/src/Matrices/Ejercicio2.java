/*
 * Desarrollar un programa que dada una matriz de números enteros entre 0 – 50
 * de 5*3, hallar el número mayor almacenado:
 * - Puedes utilizar variables auxiliares.
 */
package Matrices;

import java.util.Arrays;

public class Ejercicio2 {
  public static void main(String[] args) {
    final int[][] matrix = new int[5][3];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) Math.floor(Math.random() * 51);
      }
    }
    System.out.println(Arrays.deepToString(matrix));
    int greater = getGreater(matrix);
    System.out.println("Mayor número almacenado: " + greater);
  }

  private static int getGreater(int[][] matrix) {
    int greater = 0;
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[i].length; j++)
        if (matrix[i][j] > greater)
          greater = matrix[i][j];

    return greater;
  }
}
