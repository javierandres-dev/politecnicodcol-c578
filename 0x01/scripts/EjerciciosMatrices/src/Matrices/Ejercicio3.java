/*
 * Desarrollar un programa que dada una matriz 3*4 con números aleatorios,
 * imprimir de la matriz sólo lo siguiente:
 * - La primera fila
 * - La segunda columna
 * - La tercera fila
 */
package Matrices;

import java.util.Arrays;

public class Ejercicio3 {
  public static void main(String[] args) {
    final int[][] matrix = new int[3][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) Math.floor(Math.random() * 1001);
      }
    }
    System.out.println(Arrays.deepToString(matrix));
    toPrint(matrix);
  }

  private static void toPrint(int[][] m) {
    System.out.println("Primera fila:" + Arrays.toString(m[0]));
    System.out.println("Segunda columna:");
    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[i].length; j++)
        if (j == 1)
          System.out.println(m[i][j]);
    System.out.println("Tercera fila:" + Arrays.toString(m[2]));
  }
}
