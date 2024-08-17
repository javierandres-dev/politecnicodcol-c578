/*
 * Desarrolla un programa que permita mostrar el factorial de un número
 * definido previamente.
 */
package CicloFor;

public class Ejercicio1 {
  public static void main(String[] args) {
    long num = 10;
    long factorial = 1;
    for (long i = num; i > 0; i--)
      factorial *= i;
    System.out.println("Factorial de " + num + " = " + factorial);
  }
}
