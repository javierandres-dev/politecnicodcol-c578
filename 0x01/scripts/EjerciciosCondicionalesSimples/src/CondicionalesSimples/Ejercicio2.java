/*
 * Dados dos números enteros, determinar cuál es el mayor por medio de
 * una condicional y realizar una potencia con el número menor como
 * exponente (Math.pow).
 */
package CondicionalesSimples;

public class Ejercicio2 {
  public static void main(String[] args) {
    final int num1 = 4;
    final int num2 = 5;
    int greater;
    int exponent;
    if (num1 > num2) {
      greater = num1;
      exponent = num2;
    }
    if (num1 < num2) {
      greater = num2;
      exponent = num1;
    }
    final int power = (int) Math.pow(greater, exponent);
    System.out.println(greater + " elevado a la " + exponent + " = " + power);
  }
}
