/*
 * Dados dos números enteros, determinar si uno es múltiplo del otro
 * (Por medio del módulo).
 */
package CondicionalesSimples;

public class Ejercicio4 {
  public static void main(String[] args) {
    final int num1 = 10;
    final int num2 = 5;
    if (num1 % num2 == 0) {
      System.out.println(num1 + " es múltiplo de " + num2);
    }
    if (num2 % num1 == 0) {
      System.out.println(num2 + " es múltiplo de " + num1);
    }
  }
}
