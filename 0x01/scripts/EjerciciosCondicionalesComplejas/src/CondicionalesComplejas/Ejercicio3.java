/*
 * Desarrollar un programa que, por medio de 3 números enteros, determinar cuál
 * es el mayor.
 */
package CondicionalesComplejas;

public class Ejercicio3 {
  public static void main(String[] args) {
    /*
     * final int num1 = 4;
     * final int num2 = 8;
     * final int num3 = 2;
     */
    /*
     * final int num1 = 2;
     * final int num2 = 4;
     * final int num3 = 8;
     */
    final int num1 = 8;
    final int num2 = 2;
    final int num3 = 4;
    int greater;
    if (num1 > num2 && num1 > num3) {
      greater = num1;
    } else if (num2 > num1 && num2 > num3) {
      greater = num2;
    } else if (num3 > num1 && num3 > num2) {
      greater = num3;
    }
    System.out.println("El número mayor es: " + greater);
  }
}
