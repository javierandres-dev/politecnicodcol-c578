/*
 * Desarrollar un programa que por medio de tres (3) matrices de N*M
 * (Determinar el tamaño, igual para las 3 matrices):
 * - Almacenar números pares aleatorios entre 0 y 100 en la primera matriz.
 * - Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz.
 * - Almacenar la suma de los valores de ambas matrices en la tercera matriz.
 */
package Matrices;

import java.util.Arrays;

public class Ejercicio1 {
  public static void main(String[] args) {
    final int[][] m1 = new int[5][2];
    final int[][] m2 = new int[5][2];
    final int[][] m3 = new int[5][2];

    for (int row = 0; row < m1.length; row++) {
      for (int col = 0; col < m1[row].length; col++) {
        boolean isEven = false;
        while (!isEven) {
          int randomNumber = getRandomNumber(101);
          if (randomNumber % 2 == 0) {
            m1[row][col] = randomNumber;
            isEven = true;
          }
        }
      }
    }

    for (int row = 0; row < m2.length; row++) {
      for (int col = 0; col < m2[row].length; col++) {
        boolean isOdd = false;
        while (!isOdd) {
          int randomNumber = getRandomNumber(51);
          if (randomNumber % 2 != 0) {
            m2[row][col] = randomNumber;
            isOdd = true;
          }
        }
      }
    }

    for (int i = 0; i < m3.length; i++) {
      for (int j = 0; j < m3[i].length; j++) {
        m3[i][j] = m1[i][j] + m2[i][j];
      }
    }

    System.out.println(Arrays.deepToString(m1));
    System.out.println(Arrays.deepToString(m2));
    System.out.println(Arrays.deepToString(m3));
  }

  private static int getRandomNumber(int limit) {
    return (int) Math.floor(Math.random() * limit);
  }

}
